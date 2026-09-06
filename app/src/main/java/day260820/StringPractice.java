package day260820;

/**
 * 练习 String 类的使用
 * https://liaoxuefeng.com/books/java/oop/core/string-encoding/index.html
 */
public class StringPractice {

    public static void main(String[] args) {

        String s1 = "Hello!"; // 字符串是由 1 个或多个 字符 组成
        String s2 =  new String("Hello!");
        String s3 = new String(new char[] {'H', 'e', 'l', 'l', 'o', '!'});

        s1  = new String("you");
    }

}
