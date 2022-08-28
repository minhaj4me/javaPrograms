import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int max1 = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max1) {
                max1 = arr[i];
                index = i;
            }
        }
        System.out.println("FirstOne " + max1 + " at " + index);
        int max2 = arr[0];
        int indexx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == index)
                continue;
            if (arr[i] > max2) {
                max2 = arr[i];
                indexx = i;
            }
        }
        System.out.println("SecondOne " + max2 + " at " + indexx);

    }
}
