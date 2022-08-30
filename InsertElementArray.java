import java.util.Scanner;

public class InsertElementArray {
    public static void main(String[] args) {
        int arr[] = new int[10];
        System.out
                .println("Array is of 10 size, so make sure you enter less than size so that you can insert element ");
        System.out.println("Enter the number of elements");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the index at whilch you want to insert ");
        int index = sc.nextInt();
        System.out.println("Enter the value which you want to insert at " + index + " postion");
        int element = sc.nextInt();
        for (int i = n; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = element;
        // for (int i : arr) {
        // System.out.println(i);
        // }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
