package day260906;

/**
 * https://medium.com/appkodersolution/longest-common-subsequence-leetcode-q1143-optimized-java-solution-using-dynamic-programming-f2de58a43876
 */
public class Solution {
    // Function to compute the length of the Longest Common Subsequence
    public static int lcs(String s1, String s2) {
        int m = s1.length(); // Get the length of the first string
        int n = s2.length(); // Get the length of the second string

        // Create a 2D DP table to store subproblem results.
        // dp[i][j] will hold the length of LCS of s1[0..i-1] and s2[0..j-1]
        int[][] dp = new int[m + 1][n + 1]; // Extra row and column to handle empty prefixes

        // Fill the DP table row by row
        for (int i = 1; i <= m; i++) {       // Loop over characters of s1
            for (int j = 1; j <= n; j++) {   // Loop over characters of s2

                // If the characters at s1[i-1] and s2[j-1] match
                // Add 1 to the value from the diagonal (previous subproblem)
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1]; // Move diagonally
                } else {
                    // If characters do not match, take the maximum of:
                    // - dp[i-1][j] (ignoring current char from s1)
                    // - dp[i][j-1] (ignoring current char from s2)
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        // The bottom-right cell contains the length of LCS of s1 and s2
        return dp[m][n];
    }

    // Driver method to test the LCS implementation
    public static void main(String[] args) {
        String text1 = "abcdaf"; // First input string
        String text2 = "acbcf";  // Second input string

        // Call the LCS method with both strings
        int result = lcs(text1, text2);

        // Output the result
        System.out.println("Length of LCS (DP): " + result); // Expected Output: 4
    }
}
