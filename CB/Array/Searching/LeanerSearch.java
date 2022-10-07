/**
 * LeanerSearch
 */
public class LeanerSearch {

    public static void main(String[] args) {
        int[] arr = { 111, 22, 31, 34, 5 };
        int key = 34;
        int ans = lSearch(arr, key);
        System.out.println(ans);
    }

    public static int lSearch(int[] arr, int key) {
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == key) {
                return j;
            }
        }
        return -1;

    }
}