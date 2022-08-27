import java.lang.*;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        int a, b, c;
        double r1, r2, d;
        System.out.println("Enter the value of a, b, c");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = Math.sqrt((b * b) - (4 * a * c));
        r1 = (-b + d) / (2 * a);
        r2 = (-b - d) / (2 * a);
        System.err.println("Root1 : " + r1 + "           " + "Root2 : " + r2);
        System.out.println("(x+"+r1 +")("+ "x+"+r2 +")=0");
    }
}
