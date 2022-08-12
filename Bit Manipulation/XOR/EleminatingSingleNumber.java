/**
 * EleminatingSingleNumber
 */
public class EleminatingSingleNumber {

    public static void main(String[] args) {
        int[] arr={2,1,2,5,6,1,75,5,7,7,6};
        int xor=0;
        for(int i=0;i<arr.length;i++){
            xor=xor^arr[i];
        }
        System.out.println(xor);
    }
}