public class ArrayFindingElementIndex {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int num = 14;
        System.out.println(findIndex(arr, num));
    }

    static int findIndex(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                // System.out.println(i);
                return i;
            }
        }
        return -1;
    }
}
