public class removing_the_last_set_bit {
    public static void main(String[] args) {
        int n = 65;
        if ((n & (n - 1)) == 0) {
            System.out.println("power of 2");
            n--;
            int result = n & n;
            System.out.println(result);
        } else {
            int result = n & (n - 1);
            System.out.println(result);
        }
    }
}
