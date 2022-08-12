public class clear_the_ith_bit {
    public static void main(String[] args) {
        int n=39;
        int ith_bit=5;
        int mask=1<<ith_bit;
        int negation_mask=~mask;
        int clear_ith_bit_result=n&negation_mask;
        System.out.println(clear_ith_bit_result);
    }
}
