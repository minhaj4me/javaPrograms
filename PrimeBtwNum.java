import java.util.*;

public class PrimeBtwNum  {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Starting Value");
        int low = sc.nextInt();
        System.out.println("Enter the Starting Value");
        int high = sc.nextInt();
        for (int i = low; i <= high; i++) {
            int x = 1;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    x++;
                    break;
                }
            }
            if (x <= 1) {
                System.out.print(i + " ");
            }
            // else
            // continue;
        }
    }
}
