import java.util.Scanner;

/**
 * ReverseArray
 */
public class ReverseArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the Elements");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("You Enter these Elements");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        int s = 0; // s will go right side
        int t = (a.length) - 1; // t will go towards left
        // till s>t prog will show my reversed array....
        int temp = 0;
        while (s <= t) {
            temp = a[s];
            a[s] = a[t];
            a[t] = temp;
            s++;
            t--;
        }
        System.out.println("\nThis is the reverse of your Elements");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}