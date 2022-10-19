import java.util.Scanner;

/**
 * Inverted_and_Rotated_Half_Pyramid
 */
public class Inverted_and_Rotated_Half_Pyramid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();

        // #1
        System.out.println("Inverted_and_Rotated_Half_Pyramid");
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= i; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // #2
        System.out.println("Normal Half Pyramid");
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int space = 1; space <= n - i; space++) {
                System.out.print("");
            }
            for (int star = 1; star <= i; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // #3
        System.out.println("Pyramid");
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= i; star++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}