import java.util.HashSet;

public class Array_duplicacy_remove_1_HashSet {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 1, 2, 3, 2, 8, 4, 5, 7, 2, 1, 8, 6, 1, 2 };
        HashSet s = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            s.add(arr[i]);
        }

        for (Object object : s) {
            System.out.print(object + " ");
        }
    }

}
