
//package array;
import java.util.Scanner;

/**
 * arrayByFunction
 */
public class arrayByFunction {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the " + n + " element");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        display(arr);
    }

    static void display(int[] arr) {
        System.out.print("Your element is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}