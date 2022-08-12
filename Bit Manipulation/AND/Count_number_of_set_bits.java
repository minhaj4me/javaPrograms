public class Count_number_of_set_bits {
    public static void main(String[] args) {
        // optimalOne
        int n = 5;
        int count = 0;

        while (n != 0) {
            n = n & (n - 1); // removing the last bit and letting n tends to zero;
            count++;
        }
        System.out.println(count);

        // lessOptimalOne

        // while(n!=0){
        // if((n&1)==1){
        // count++;
        // }
        // n=n>>1;
        // //right shift the last bit and letting n tends to zero;
        // }
        // System.out.println(count);
    }
}
