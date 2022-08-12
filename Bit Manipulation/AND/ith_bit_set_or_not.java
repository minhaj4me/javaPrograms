//Q- Check ith bit is set or not.


/**
 * ith_bit_set_or_not
 */
public class ith_bit_set_or_not {

    public static void main(String[] args) {
        int n = 17;
        int ith_bit = 3;
        int mask = 1 << ith_bit; // this will left shift 1
        int booleanSet = (n & mask); // (n&mask is not equal to zero then it is set otherwise not)
        if (booleanSet != 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}