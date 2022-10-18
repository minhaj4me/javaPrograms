public class Hollow_Rhombus {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int sp = 1; sp <= n - i; sp++) {
                System.out.print(" ");
            }
            for (int st = 1; st <= n; st++) {
                if (i == 1 || i == n || st == 1 || st == n) {
                    System.out.print("*");
                } else {

                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
