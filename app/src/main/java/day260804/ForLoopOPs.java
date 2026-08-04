package day260804;

public class ForLoopOPs {
          public static void main(String[] args) {
      int[] ns = { 1, 4, 9, 16, 25 };
        int sum = 0;
        for (int i=(ns.length - 1); i> 0; i--) {
            System.out.printf("%d %d\n", i, ns[i]);
        }

    }
}
