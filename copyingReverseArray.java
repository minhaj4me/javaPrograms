public class copyingReverseArray {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enetr size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enetr the element");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] brr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            brr[i] = arr[i];
        }

        System.out.println("\narr");

        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println("\nbrr");

        for (int i : brr) {
            System.out.print(i + " ");
        }
    }
}
