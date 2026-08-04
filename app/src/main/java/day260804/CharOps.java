package day260804;

import org.springframework.util.StringUtils;

/**
 * 字符类型
 */
public class CharOps {

    public static void main(String[] args) {
        // 注意是十六进制:
        char c3 = '\u0041'; // 'A'，因为十六进制0041 = 十进制65
        char c4 = '\u4e2d'; // '中'，因为十六进制4e2d = 十进制20013

        String s3 = String.valueOf(c3);
        String s4 = String.valueOf(c4);
        System.out.println(s3);
        System.out.println(s4);

        String s1 = "\"\t\t\t这里";
        System.out.println(s1);

        String s5 = "";
        if(StringUtils.isEmpty(s5)){
            System.out.println("s5 是 empty 的！");
        }

        // 请将下面一组int值视为字符的Unicode码，把它们拼成一个字符串：
        int a = 72;
        int b = 105;
        int c = 65281;

        String s =  "" + (char)a + (char)b + (char)c;
        System.out.println(s);
    }
}
