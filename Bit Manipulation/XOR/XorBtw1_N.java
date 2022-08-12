public class XorBtw1_N {
    public static void main(String[] args) {
        int n = 9;
        if (n % 4 == 0) {
            System.out.println(n);
        }
        if (n % 4 == 1) {
            System.out.println("1");
        }
        if (n % 4 == 2) {
            System.out.println(n + 1);
        }
        if (n % 4 == 3) {
            System.out.println("0");
        }

        // int n=5;
        // int xor=1;

        // for (int i = 1; i < 5; i++) {
        // xor=xor^(i+1);
        // }
        // System.out.println(xor);
    }
}
