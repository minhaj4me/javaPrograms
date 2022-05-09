/**
 * Prime
 */
public class Prime {

    public static void main(String[] args) {
        int n = 12;
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (i == 2) {
                System.out.println("Prime");
            }
            for (int j = 3; j < i; j++) {
                if (i % j == 0) {
                    System.out.println("Not Prime");
                    count = count + 1;
                    break;
                }

            }
            if (count == 0) {
                System.out.println("Prime");
            }
        }
    }
}