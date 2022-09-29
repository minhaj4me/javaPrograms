import java.util.Arrays;

/**
 * Array_duplicacy_remove
 */
public class Array_duplicacy_remove {

    public static void main(String[] args) {
        int[] arr = { 3, 4, 1, 2, 3, 2, 8, 4, 5, 7, 2, 1, 8, 6, 1, 2 };
        // Arrays.sort(arr);
        // temporary array
        int temp[] = new int[arr.length];
        int t = 0;
        temp[t] = arr[0];
        t++;
        for (int i = 1; i < arr.length; i++) {
        boolean flag = true;
        for (int j = 0; j < t; j++) {
        if (arr[i] == temp[j]) {
        flag = false;
        }
        }
        if (flag) {
        temp[t] = arr[i];
        t++;
        }
        }

        // for (int i = 0; i < arr.length - 1; i++) {
        //     if (arr[i] != arr[i + 1]) {
        //         temp[t] = arr[i];
        //         t++;
        //     }
        // }
        // temp[t] = arr[arr.length - 1];

        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 1; j < arr.length; j++) {
        // if (arr[i] == arr[j] && (i != j)) {
        // System.out.print(arr[j] + " ");
        // }
        // }
        // }

        // Arrays.sort(temp);

        for (int i = 0; i < t; i++) {
            System.out.print(temp[i] + " ");
        }
        // System.out.print(temp[.length-1]);
    }
}
