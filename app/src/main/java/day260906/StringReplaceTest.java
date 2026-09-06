package day260906;

import java.util.Arrays;
import java.util.List;

public class StringReplaceTest {


    public static void main(String[] args) {

        // 替换字符串里的内容
        String s = "hello";
        String s2 = s.replace("e", "l");
        System.out.println("s:" + s);
        System.out.println("s2:" + s2);


        System.out.println("分割字符串");
        String s3 = "A,B,C,D";
        String[] ss = s3.split(","); // {"A", "B", "C", "D"}
        for (int i = 0; i < ss.length; i++) {
            System.out.println(ss[i]);
        }

        System.out.println("字符串拼接");
        String[] arr = {"A", "B", "C"};
        List<String> lis =  Arrays.asList(arr);
        String s4 = String.join("$", lis); // A$B$C
        System.out.println(s4);


        // 格式化字符串
        System.out.println("格式化字符串");
        String s5 = "Hi %s, your score is %d, %.2f, %b!"; // %s 代表 string, %d 代表 digit 数字
        String s6 = s5.formatted("Alice", 80, 1.1, true);
        System.out.println(s6);

        // 下节课：类型转换，https://liaoxuefeng.com/books/java/oop/core/string-encoding/index.html
        // https://liaoxuefeng.com/books/java/oop/core/string-builder/index.html
        // https://liaoxuefeng.com/books/java/oop/core/string-joiner/index.html
    }

}
