import java.util.Scanner;

public class TargetSumFunc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        int targetSum()
        
        for (int counter = 0; counter < arr.length; counter++) {
            for (int i = counter + 1; i < arr.length; i++) {
                if (arr[counter] + arr[i] == 5) {
                    if (arr[counter] < arr[i]) {
                        System.out.println(arr[counter] + " " + arr[i]);
                    } else {
                        System.out.println(arr[i] + " " + arr[counter]);
                    }
                }

            }

        }

    }
}
