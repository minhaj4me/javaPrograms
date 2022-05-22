public class Fibo {
    public static void main(String[] args) {
        int i = fibo(3);
        System.out.println(i);
    }

    static int fibo(int i) {
        if (i == 0)
            return 1;
        return i * fibo(i - 1);

    }

}
