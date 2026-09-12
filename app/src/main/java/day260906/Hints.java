package day260906;

public class Hints {


    public static int longestCommonSequence(String text1, String text2) {

        System.out.println(text1.length()); // 6
        System.out.println(text1.charAt(1)); // abcdef --> b

        System.out.println(Math.max(text1.length(), 10)); // 10
        System.out.println(Math.min(text1.length(), 10)); // 6

        System.out.println("遍历字符串");
        for(int i = 0; i < text1.length(); i++) {
            System.out.print(text1.charAt(i) + "\n");
        }

        System.out.println(text1.substring(0, 3)); // 包含了开始和结束
        return 0;
    }

    public static void main(String[] args) {

        // text1: abcdef, text2: acfd
        // 最大公共子序列： acf

        String text1 = "abcdef";
        String text2 = "acfd";

        int result = longestCommonSequence(text1, text2);


    }

}
