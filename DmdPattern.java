package nados;

import java.util.*;

public class DmdPattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the row to print the Diamond");
        int n = scn.nextInt();
        int sp = n / 2;
        int st = 1;
        for (int t = 1; t <= n; t++) {
            for (int i = 1; i <= sp; i++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }
            System.out.println();
            if (t <= n / 2) {
                sp--;
                st += 2;

            } else {
                sp++;
                st -= 2;
            }

        }

    }
}
