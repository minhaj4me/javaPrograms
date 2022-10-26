public class Decimal_Binary {
    public static void main(String[] args) {
        long n = 163;
        long bin = dToB(n);
        System.out.println(bin);
    }

    public static long dToB(long n) {
        long bin = 0;
        while (n != 0) {
            long rem = n % 2;
            bin = bin * 10 + rem;
            n /= 2;
        }
        return bin;
    }
}
 