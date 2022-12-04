public class DecimalToBinary {
    public static void main(String[] args) {
        int num = 100;
        int bin = 0;
        int pow = 1;
        while (num != 0) {
            int parity = num % 2;
            bin += parity * pow;
            num /= 2;
            pow *= 10;
        }
        System.out.println(bin);

    }
}
