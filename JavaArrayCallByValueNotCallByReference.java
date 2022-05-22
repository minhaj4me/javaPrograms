//this will not swap....
// if we swap two array by taking one temporary array then it will not swap...
// because java  is Call  by value not call by reference

public class JavaArrayCallByValueNotCallByReference {
    public static void main(String[] args) {
        int[] arr1 = { 10, 20, 30 };
        int[] arr2 = { 100, 200, 300 };
        for (int j = 0; j < arr1.length; j++) {

            System.out.print(arr1[j] + " ");
        }
        System.out.println();
        swap(arr1, arr2);
        for (int j = 0; j < arr1.length; j++) {

            System.out.print(arr1[j] + " ");
        }
    }

    static void swap(int[] a, int[] b) {
        int[] t = a;
        a = b;
        b = a;
    }
}
