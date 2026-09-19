package day260919;

import java.time.Instant;
import java.time.Duration;

public class StringBuilderOps {

    public static void main(String[] args) {

        int moment = 100000;

        System.out.println("使用字符串拼接的方法执行");
        Instant start = Instant.now();
        String s = "";
        for (int i = 0; i < moment; i++) {
            s = s + "," + i;
        }
        Instant end = Instant.now();
        Duration duration = Duration.between(start, end);
        System.out.println("耗时：" + duration.toMillis());

        System.out.println("使用StringBuilde的方法执行");
        Instant start2 = Instant.now();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < moment; i++) {
            sb.append(',');
            sb.append(i);
//            sb.append(","+ i);
        }
        String s2 = sb.toString();
        Instant end2 = Instant.now();
        Duration duration2 = Duration.between(start2, end2);
        System.out.println("耗时：" + duration2.toMillis());
    }
}
