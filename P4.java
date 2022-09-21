public class P4 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= (2 * n) - 1; i++) {
            int colInRow = (i > n) ? (2 * n) - i : i;
            for (int j = 1; j <= colInRow; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

}
