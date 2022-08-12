public class set_ith_bit_of_a_number {
    public static void main(String[] args) {
        int n = 37;
        int ith_bit = 3;
        int mask = 1 << ith_bit;
        n = (n | mask);
        System.out.println(n);
    }
}
