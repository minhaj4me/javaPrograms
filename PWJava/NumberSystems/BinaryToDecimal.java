/**
 * BinaryToDecimal
 */
public class BinaryToDecimal {

    public static void main(String[] args) {
        int num = 1001;
        int dec = 0;
        int pow = 1; // 2^0=1
        while (num != 0) {
            int unit_digit = num % 10;
            dec += (unit_digit * pow);
            num /= 10;
            pow = pow * 2;
        }
        System.out.println(dec);
    }
}