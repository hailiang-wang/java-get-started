package day260919;

import java.util.Arrays;
import java.util.StringJoiner;

public class StringJoinerOps {
    public static void main(String[] args) {
        String[] names = {"Bob", "Alice", "Grace"}; // Bob, Alice, Grace
        // Bob,Alice,Grace,

        StringJoiner sj = new StringJoiner(", ");
        for (String name : names) {
            sj.add(name);
        }
        String s2 = sj.toString();
        System.out.println(s2);
    }
}
