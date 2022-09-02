import java.util.*;

public class StringReverse {
    public static void main(String[] args) {
        String s = "Rahul Chauhan";
        String k = "INCAPP";
        StringTokenizer p = new StringTokenizer(k, "NCAPP");
        StringTokenizer p1 = new StringTokenizer(k, "CAPP");
        StringTokenizer p2 = new StringTokenizer(k, "APP");
        StringTokenizer p3 = new StringTokenizer(k, "PP");
        StringTokenizer p4 = new StringTokenizer(k, "P");
        StringTokenizer p5 = new StringTokenizer(k, "");
        while (p.hasMoreTokens()) {
            System.out.println(p.nextToken());
        }
        while (p1.hasMoreTokens()) {
            System.out.println(p1.nextToken());
        }
        while (p2.hasMoreTokens()) {
            System.out.println(p2.nextToken());
        }
        while (p3.hasMoreTokens()) {
            System.out.println(p3.nextToken());
        }

        while (p4.hasMoreTokens()) {
            System.out.println(p4.nextToken());
        }
        while (p5.hasMoreTokens()) {
            System.out.println(p5.nextToken());
        }

        String s1[] = s.split("");

        for (String x : s1) {
        System.out.println(x);
        }
        for (int i = s1.length - 1; i >= 0; i--) {
        System.out.print(s1[i] + " ");
        }
    }
}
