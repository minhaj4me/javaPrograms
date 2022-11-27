public class AToThePowerOfB {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter a Digit to Find it's Power");
        int a = sc.nextInt();
        System.out.println("Enter a Digit till Find The Power");
        int b = sc.nextInt();
        int pow = 1;
        for (int i = 1; i <= b; i++) {
            pow*=a;
        }
        System.out.println(a + " to the Power " + b + " is " + pow);
    }

}
