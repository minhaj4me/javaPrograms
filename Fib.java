package ajju;

public class Fib {
    public static void main(String[] args) {
        System.out.println(fib(5));
    }
    static int fib(int i) {
        if (i == 0)
            return 1;

        return i * fib(i - 1);

    }

}
