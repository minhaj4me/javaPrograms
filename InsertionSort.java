public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 8, 9, 4, 2, 1, 11, 89 };
        Sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void Sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            int item = arr[i]; // storing the ith index value to an item
            while (j >= 0 && arr[j] > item) {
                arr[j + 1] = arr[j];
                j--;
            }
            j++;
            arr[j] = item;
        }
    }

}
