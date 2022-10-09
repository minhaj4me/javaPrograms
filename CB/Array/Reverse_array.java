/**
 * Reverse_array
 */

// without return type

// public class Reverse_array {

//     public static void main(String[] args) {
//         int arr[] = { 1, 2, 3, 4, 5 };
//         rev(arr);
//         for (int i : arr) {
//             System.out.print(i + " ");
//         }
//     }

//     public static void rev(int arr[]) {
//         int n = arr.length - 1;
//         for (int i = 0; i < n; i++, n--) {
//             int temp = arr[i];
//             arr[i] = arr[n];
//             arr[n] = temp;
//         }
//     }
// }

//with return type

/**
 * Reverse_array
 */
public class Reverse_array {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int[] temp = rev(arr);
        for (int i : temp) {
            System.out.print(i + " ");
        }
    }

    public static int[] rev(int arr[]) {
        int n = arr.length - 1;
        for (int i = 0; i < n; i++, n--) {
            int temp = arr[i];
            arr[i] = arr[n];
            arr[n] = temp;
        }
        return arr;

    }
}
