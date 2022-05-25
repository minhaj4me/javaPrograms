import java.util.Scanner;

public class TargetSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        System.out.println("Enter the target sum");
        int sum=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int pair=0;

        for (int counter = 0; counter < arr.length; counter++) {
            for (int i = counter+1; i < arr.length; i++) {
            if (arr[counter] + arr[i] == sum) {
                pair++;
                if (arr[counter] < arr[i]) {
                    System.out.println(arr[counter] + " " + arr[i]);
                } else {
                    System.out.println(arr[i] + " " + arr[counter]);
                }
                }
            }

        }

        if(pair==0){
            System.out.println("No pair found");
        }
        else{
            System.out.println(pair);
        }
    }
}
