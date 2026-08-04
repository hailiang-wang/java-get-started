package day260804;

public class ArrayOps {
    public static void main(String[] args) {
        String[] strs = {"s1", "s2"};
        System.out.println(strs[0]);

//        int[] ints = new int[] {1, 2};
//        System.out.println(ints[0]);

        //
        String[] names = {"ABC", "XYZ", "zoo"};
        String s = names[1];
        names[1] = "cat";
        System.out.println(s); // s是"XYZ"还是"cat"?

        int[] ints = {1, 2, 3};
        int x = ints[1]; // 2
        ints[1] = 5;
        System.out.println(x); // x 是 2 还是 5?


    }
}
