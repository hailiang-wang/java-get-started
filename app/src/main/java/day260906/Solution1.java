package day260906;

/**
 * https://medium.com/appkodersolution/longest-common-subsequence-leetcode-q1143-optimized-java-solution-using-dynamic-programming-f2de58a43876
 */
public class Solution1 {

    // Recursive function to find the length of the Longest Common Subsequence
    public static int lcs(String s1, String s2, int i, int j) {

        // Base Case: if either string is exhausted, return 0 (no further match possible)
        if (i == s1.length() || j == s2.length()) {
            return 0;
        }

        // If characters at current indices match
        if (s1.charAt(i) == s2.charAt(j)) {
            // Count this character (add 1) and move to next character in both strings
            return 1 + lcs(s1, s2, i + 1, j + 1);
        } else {
            // Characters don't match, so explore both possibilities:
            // 1. Skip current character in s1 and move forward
            // 2. Skip current character in s2 and move forward
            // Take the maximum of the two results
            return Math.max(
                    lcs(s1, s2, i + 1, j),   // skip character in s1
                    lcs(s1, s2, i, j + 1)    // skip character in s2
            );
        }
    }

    public static void main(String[] args) {
        // Define input strings
        String text1 = "abcdaf";
        String text2 = "acbcf";

        // Start the recursive LCS check from index 0 for both strings
        int result = lcs(text1, text2, 0, 0);

        // Print the final result
        System.out.println("Length of LCS (Brute Force): " + result);
    }
}
