public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter a Digit to Find Factorial ");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();

        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
            System.out.println("Factorial of " + i + " is " + fact);

        }
    }
}
