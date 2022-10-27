/**
 * Binary_Decimal
 */
public class Binary_Decimal {

    public static void main(String[] args) {
        int n = 10100;
        int dec = bToD(n);
        System.err.println(dec);
    }

    public static int bToD(int n) {
        int dec = 0, i = 0;
        while (n != 0) {
            int rem = n % 10;
            dec = dec + (rem * (int) Math.pow(2, i));
            i++;
            n /= 10;
        }
        return dec;
    }
}