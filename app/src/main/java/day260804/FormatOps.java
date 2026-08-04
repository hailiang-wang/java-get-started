package day260804;

import java.util.Formatter;

public class FormatOps {

    public static void main(String[] args) {
        Formatter fm = new Formatter();
        String s = fm.format("%.2f", 1.2233).toString();
        System.out.println(s);
    }
}
