/**
 * ArrayMinElement
 */
public class ArrayMinElement {

    public static void main(String[] args) {
        int[] arr = { 23, 45, 12, 43, -3, 65, 1, -6, -29, 88 };
        System.out.println(min(arr));
    }

    static int min(int[] arr) {
        int minimum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minimum) {
                minimum = arr[i];
            }
        }
        return minimum;
    }
}