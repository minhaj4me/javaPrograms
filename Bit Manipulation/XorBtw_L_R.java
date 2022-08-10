public class XorBtw_L_R {
    public static void main(String[] args) {
        int L = 2;
        int R = 4;
        int ans = R ^ (L - 1); // means if we do xor of R and (L-1) meas {1 to L-1} then we can get the
                               // ans...and we know xor of 1 to N {n % 4 == F....}
        System.out.println(ans);
    }
}
