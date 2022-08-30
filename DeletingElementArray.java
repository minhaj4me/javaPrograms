public class DeletingElementArray {
    public static void main(String[] args) {
        int arr[] = new int[10];
        System.out
                .println("Array is of 10 size, so make sure you enter less than size so that you can delete element ");
        System.out.println("Enter the number of elements");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the index at which you want to delete ");
        int index = sc.nextInt();
        for (int i = index; i < n; i++) {
            arr[i] = arr[i + 1];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
