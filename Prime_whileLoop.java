import java.util.Scanner;

/**
 * Prime_whileLoop
 */
public class Prime_whileLoop {
    public static void main(String[] args) {
        System.out.println("Enter a number to check prime or not!");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 2) {
            System.out.println("Please Enter a Valid Number");
        } else {
            boolean ans = isPrime(n);
            System.out.println(n + " is " + ans);
        }
    }

    public static boolean isPrime(int n) {
        int divisor = 2;
        while (divisor < n) {
            if (n % divisor == 0) {
                return false;
            }
            divisor++;
        }
        return true;
    }
}
