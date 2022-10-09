public class Rotate_k_array {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 5;
        rotate(arr, k);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void rotate(int[] arr, int k) {
        int n = arr.length - 1;
        for (int i = 1; i <= k; i++) {
            for (int j = n; j > 0; j--) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
            }
        }
    }
}

// int n = nums.length;
// if (k > n)
// k = k % n;

// int[] result = new int[n];

// for (int i = 0; i < k; i++) {
// result[i] = nums[n - k + i];
// }

// int index = 0;
// for (int i = k; i < n; i++) {
// result[i] = nums[index++];
// }
// // return result;
// }
// }