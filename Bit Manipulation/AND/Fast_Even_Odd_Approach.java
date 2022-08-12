public class Fast_Even_Odd_Approach {
    public static void main(String[] args) {
        int n = 10; // 1010
        if ((n & 1) == 0) // (1010) & (0001) result is 0 (both same 1 if not then 0)
        {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
