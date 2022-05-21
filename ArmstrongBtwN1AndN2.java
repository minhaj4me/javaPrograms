package Function;

import java.util.Scanner;

public class ArmstrongBtwN1AndN2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting number");
        int n1 = sc.nextInt();
        System.out.println("Enter the ending number");
        int n2 = sc.nextInt();
        int sNo=1;
        for (int i = n1; i <= n2; i++) {

            int result = isArmstrong(i);
            if (result == i)
                System.out.println(sNo+") "+result);
                sNo++;
        }
    }

    static int isArmstrong(int n) {
        int num = n;
        int d = countDigit(n);
        int sum = 0;
        while (n != 0) {
            int rem = n % 10;
            sum += (int) Math.pow(rem, d);
            n /= 10;
        }
        if (sum == num) {
            return num;
        } else
            return n;

    }

    static int countDigit(int n) {
        int digit = 0;
        while (n != 0) {
            n = n / 10;
            digit++;
        }
        return digit;
    }
}
