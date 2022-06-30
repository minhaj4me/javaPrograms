import java.util.Scanner;

/**
 * GCD_AKA_LCM
 */
public class GCD_AKA_LCM {

    public static void main(String[] args) {
        System.out.println("Enter Dividend");
        Scanner sc = new Scanner(System.in);
        int dividend = sc.nextInt();
        System.out.println("Enter Divisor");
        int divisor = sc.nextInt();
        int dis = dividend;
        int dat = divisor;
        while (dividend % divisor != 0) {
            int remainder = dividend % divisor;
            dividend = divisor;
            divisor = remainder;
        }
        System.out.println("The LCM_AKA_GCD of " + dis + " and " + dat + " is " + divisor);
    }
}