public class FibonacciSeries {
    public static void main(String[] args) {
        int a = 0;
        System.out.print(a + " ");
        int b = 1;
        System.out.print(b + " ");
        int c = 0;
        for (int i = 3; i <= 10; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
