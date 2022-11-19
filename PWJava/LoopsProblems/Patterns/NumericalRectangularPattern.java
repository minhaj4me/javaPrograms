public class NumericalRectangularPattern {
    public static void main(String[] args) {
        int row = 7;
        for (int i = 1; i <= row; i++) {
            for (int j = i; j <= row; j++) {
                System.out.print(j + " ");
            }

            for (int k = 1; k <= i - 1; k++) {
                System.out.print(k + " ");
            }
            System.err.println();
        }
    }
}
