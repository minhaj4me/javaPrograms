package ajju;

public class OneToTenWithoutLoop {
    public static void main(String[] args) {
        count(1);
    }

    static void count(int i) {
        System.out.println(i);
        if (i == 10)
            return;
        count(i + 1);
    }
}
