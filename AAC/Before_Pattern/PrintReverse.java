import java.util.Scanner;

public class PrintReverse {
    public static void main(String[] args) {
        
        System.out.println("Enter any Number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n != 0) {
            int lastDigit = n % 10;
            System.out.print(lastDigit);
            n /= 10;
        }
    }
}
