public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 10, 14, 19, 26, 27, 31, 33, 35, 42, 44 };
        int key = 33;
        int ans = bSearch(arr, key);
        System.out.println(ans);
    }

    public static int bSearch(int[] arr, int key) {
        int s = 0;
        int e = arr.length - 1;

        for (int i = s; s <= e; i++) {
            int mid = (s + e) / 2;
            if (key > arr[mid]) {
                s = mid + 1;
            } else if (key < arr[mid]) {
                e = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}