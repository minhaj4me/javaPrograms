/**
 * a
 */
public class a {

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 4, 2 };
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > arr[i + 1]) {
                    arr[i] = arr[i] ^ arr[i + 1];
                    arr[i + 1] = arr[i + 1] ^ arr[i];
                    arr[i] = arr[i] ^ arr[i + 1];
                }
            }    
        }
        
        System.out.println(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] + " " + arr[4]);
    }
}