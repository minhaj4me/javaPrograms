
import java.lang.*;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number to check armstrong :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // boolean ans = isArmstrong(n);
        // System.out.println(ans);
        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i))
                System.out.println(i + " ");
        }
    }

    static boolean isArmstrong(int a) {
        int orginal = a;
        int sum = 0;
        while (a > 0) {
            int rem = a % 10;
            int cube = rem * rem * rem;
            sum = sum + cube;
            a = a / 10;

        }
        return orginal == sum;

    }

}
