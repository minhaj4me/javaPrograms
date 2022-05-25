public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 3, 51, 2, 2, 9, 6, 7, 55, 8, 0 };
        SelectionSorting(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void SelectionSorting(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min_index = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min_index] > arr[j]) {
                    min_index = j;
                }
            }
            // swapping of min_index value with j index value

            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    }

}
