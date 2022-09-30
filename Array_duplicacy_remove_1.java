public class Array_duplicacy_remove_1 {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 1, 2, 3, 2, 8, 4, 5, 7, 2, 1, 8, 6, 1, 2 };

        // int[] arr = { 1, 1, 3, 3, 4, 5, 6, 6, 6, 7 };
        int t = 0;
        // Arrays.sort(arr);
        for (int pass = 1; pass < arr.length; pass++) {
            for (int i = 0; i < arr.length - pass; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[t] = arr[i];
                t++;
            }
        }
        arr[t] = arr[arr.length - 1];
        for (int i = 0; i <= t; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
