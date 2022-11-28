/**
 * CountsDigit
 */
public class CountsDigit {

    public static void main(String[] args) {
        System.out.println("Enter a Digit to Find it's Count");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;
        }
        System.out.println("Digits are " + count);
    }
}