public class DigitsSum {
    public static void main(String[] args) {
        System.out.println("Enter a Digit to Find it's Sum");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while (n != 0) {
            int rem = n % 10;
            sum += rem;
            n /= 10;
        }
        System.out.println("DigitsSum is " + sum);
    }
}
