public class HollowTriangularPatter {
    public static void main(String[] args) {
        int row = 8;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == (2 * i - 1) || i == row) {
                    System.out.print(i);
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
