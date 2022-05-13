package nados;
import java.util.*;

public class ReverseLeftTriangle {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int st = n;
        int sp = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            for (int k = st; k >= 1; k--) {
                System.out.print("*" + "\t");
            }
            sp++;
            st--;
            System.out.println();
        }

    }
}
