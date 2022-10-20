
/**
 * InvertedPattern
 */
public class InvertedPattern {

    public static void main(String[] args) {
        int n = 4;
        int star = n;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= star; j++) {
        // System.out.print("*" + " ");
        // }
        // star--;
        // System.out.println();
        // }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

    }
}