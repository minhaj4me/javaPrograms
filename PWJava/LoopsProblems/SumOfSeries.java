/*
 1-2+3-4+5.....n
 */
public class SumOfSeries {
    public static void main(String[] args) {
        System.out.println("Enter a Digit");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum -= i;
            } else {
                sum += i;
            }
        }
        System.out.println("Sum of this series is : " + sum);
    }
}
