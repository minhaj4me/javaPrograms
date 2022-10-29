import java.util.Scanner;

/**
 * Break_at_Mul_of_10
 */
public class Break_at_Mul_of_10 {

    public static void main(String[] args) {
        System.out.println("Enter Number");
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n % 10 == 0)
                break;
            System.out.println(n);
        }
    }
}