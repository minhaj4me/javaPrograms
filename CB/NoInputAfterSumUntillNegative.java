import java.util.Scanner;

/**
 * NoInputAfterSumUntillNegative
 */
public class NoInputAfterSumUntillNegative {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter your Numbers");
        while (sum >= 0) {
        int ip = sc.nextInt();
            sum = sum + ip;
            
            // System.out.println(ip);
        }
        System.out.println(sum);
    }
}