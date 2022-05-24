/**
 * ArrayMaxElement
 */
public class ArrayMaxElement {

    public static void main(String[] args) {
        int[] arr = { 23, 45, 12, 43, -3, 65, 1, -6, -29, 88 };
        System.out.println(max(arr));
    }

    static int max(int[] arr) {
        int maximum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maximum) {
                maximum = arr[i];
            }
        }
        return maximum;
    }
}
