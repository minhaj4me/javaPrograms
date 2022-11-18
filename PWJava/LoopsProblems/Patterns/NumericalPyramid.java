public class NumericalPyramid {
    public static void main(String[] args) {
        int row = 6;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print("  ");
            }

            // 1 to i

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // (i-1) to 1

            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
