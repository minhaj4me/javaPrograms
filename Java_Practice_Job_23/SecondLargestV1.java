public class SecondLargestV1 {
    public static void main(String[] args) {
        int arr[] = { 4, 2, 3, 5, 3, 2, 9, 88, 55, 4, 2, 22 };
        int max1 = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > max1) {
                max1 = arr[i];
            }
        }
        System.out.println(max1);

        int max2=arr[0];
        
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i]> max2 && arr[i]!=max1) {
                max2 = arr[i];
            }
        }
        System.out.println(max2);
    }
}
