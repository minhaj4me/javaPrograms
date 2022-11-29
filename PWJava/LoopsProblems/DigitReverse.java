public class DigitReverse {
    public static void main(String[] args) {
        System.out.println("Enter a Digit to Find it's Reverse");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }
        System.out.println("DigitReverse is " + rev);
    }
}
