package day260906;

public class StringCompareTest {

    /**
     * == 是比较两个对象的底层是不是同一个对象：Java JVM 会将字符串相同的变量，初始化为同一个对象，这样能节省空间和时间
     * equals 是比较字符串的内容
     */
    public static void compare1(){
        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }

    /**
     * 在不同阶段生成的字符串，有不同的对象
     */
    public static void compare2(){
        String s1 = "hello";
        String s2 = "HELLO".toLowerCase(); // "hello"
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }

    /**
     * 忽略大小写
     */
    public static void compare3(){
        String s1 = "hello";
        String s2 = "HELLO";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
    }


    public static void main(String[] args) {

        String s1 = "Helololo";

//        compare1();
//        compare2();
//        compare3();

        // 是否包含子串:
//        boolean check = "Hello".contains("lle"); // true
//        System.out.println(check);

//        int index = "Hello".indexOf("ll"); // 2
//        System.out.println(index);

//        int index = "Helololo".lastIndexOf("lo"); // 6
//        System.out.println(index);

        // 取得子字符串
//        String sub = "Helololo".substring(index); // sub 子集，string 字符串：substring 子字符串
//        System.out.println(sub); // lo

//        sub = "Helololo".substring(6, 7); // 从 6 开始，到 7 截至（不包括 7）
//        System.out.println(sub); // l

        // 检查字符串的开始和结束
//        if(s1.startsWith("H")){ // startsWith 检查开始，endsWith
//            System.out.println("start with H");
//        } else {
//            System.out.println("not start with H");
//        }

        // 字符串转义 \t 代表 Tab, \r 和 \n 代表的一行的结束
        String s2 = "  \tHello\r\n sss \n";
//        System.out.println(s2.trim());
//        System.out.println(s2.strip()); // 注意：需要设定 Java Language Level >= 11
//        System.out.println(s2.stripLeading());
//        System.out.println(s2.stripTrailing());

        //
        boolean check = " ".isEmpty(); // false，空格也属于有效的
        check = " ".isBlank(); // true，因为isBlank 认为，空格也是空
        System.out.println(check);

    }

}
