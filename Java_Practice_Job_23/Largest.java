public class Largest {
    public static void main(String[] args) {
        int arr[] = { 4, 2, 3, 5, 3, 2, 9, 88, 55, 4, 2, 22 };
        int max = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
