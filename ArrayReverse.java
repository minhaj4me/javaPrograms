public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60 };
        int i, j;
        i = 0;
        j = arr.length - 1;
        System.out.println("Before Reverse");
        for (int j2 = 0; j2 < arr.length; j2++) {
            System.out.print(arr[j2] + " ");
        }

        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println();
        System.out.println();
        System.out.println("After Reverse");
        for (int j2 = 0; j2 < arr.length; j2++) {
            System.out.print(arr[j2] + " ");
        }

    }
}
