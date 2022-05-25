public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 28, 3, 5, 6, 9, 2 };
        BubbleSorting(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void BubbleSorting(int[] arr) {
        for (int pass = 1; pass < arr.length; pass++) {
            for (int i = 0; i < arr.length - pass; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }

}
