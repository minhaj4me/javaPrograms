import java.util.Scanner;

/**
 * linearSearch
 */
public class linearSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = { 2, 3, 1, 45, 67, -9, -1, 56, 89 };

        System.out.println("Enter a number to find it's index");
        int targetVariable = sc.nextInt();
        int ans = lSearch(arr, targetVariable);
        System.out.println("targetVariable  is at " + ans + " index.");
        int ans1 = lSearch1(arr, targetVariable);
        System.out.println("targetVariable  is " + ans1 + " and at a index of " + ans);
        boolean ans2 = lSearch2(arr, targetVariable);
        System.out.println("targetVariable  is found " + ans2 + " and at a index of " + ans);
    }

    static int lSearch(int[] num, int targetVariable) {
        if (num.length == 0)
            return -1;
        for (int i = 0; i < num.length; i++) {
            // int element = num[i];
            if (num[i] == targetVariable) {
                return i;
            }
        }
        return -1;
    }

    static int lSearch1(int[] num, int targetVariable) {
        if (num.length == 0)
            return -1;
        for (int i = 0; i < num.length; i++) {
            // int element = num[i];
            if (num[i] == targetVariable) {
                return num[i];
                /*
                 * for (int element : num) { if (element == targetVariable)
                 * 
                 * return element;
                 * 
                 * }
                 */
            }
        }
        return Integer.MAX_VALUE;
    }

    static boolean lSearch2(int[] num, int targetVariable) {
        if (num.length == 0)
            return false;
        for (int i = 0; i < num.length; i++) {
            // int element = num[i];
            if (num[i] == targetVariable) {
                return true;
            }
        }
        return false;
    }
}