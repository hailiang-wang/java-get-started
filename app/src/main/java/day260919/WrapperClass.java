package day260919;

public class WrapperClass {

    public static void main(String[] args) {
        boolean f1 = true;
        Boolean f2 = true; // boolean 的包装类型
//        Boolean.toString(f1);


        char[] cs = "Hello".toCharArray();
        String s = new String(cs);
        System.out.println(s);
        cs[0] = 'X'; // Xello
        System.out.println(s);

        // 9, 10, 11, 12, 13, 14, 15
        // 9, a,  b,  c,  d,

    }
}
