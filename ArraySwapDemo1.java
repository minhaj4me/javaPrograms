//  this program will not swap....
import java.util.Scanner;

public class ArraySwapDemo1 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int[] arr = { 10, 20, 30, 40, 50 };
        System.out.println("Previous " +arr[0] + " " + arr[1]);
        swap(arr[0], arr[1]);
        System.out.println("Now " +arr[0] + " " + arr[1]);
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
