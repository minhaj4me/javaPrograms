import java.util.Scanner;

/**
 * ArraySwapDemo2
 */
public class ArraySwapDemo2 {

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int[] arr = { 10, 20, 30, 40, 50 };
        System.out.println("Previous " + arr[0] + " " + arr[1]);
        swap(arr, 0, 1); // we are passing array address with index..that's why it will swap...
        System.out.println("Now " + arr[0] + " " + arr[1]);
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}