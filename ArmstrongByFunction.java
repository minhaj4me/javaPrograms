import java.util.Scanner;

public class ArmstrongByFunction {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean result = isArmstrong(n);
        System.out.println("It is "+result+".");
    }

    static boolean isArmstrong(int n) {
        int num = n;
        int d = countDigit(n);
        int sum = 0;
        while (n != 0) {
            int rem = n % 10;
            sum += (int) Math.pow(rem, d);
            n /= 10;
        }
        if (sum == num) {
            return true;
        } else
            return false;

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
