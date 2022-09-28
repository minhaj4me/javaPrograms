/**
 * String_Vowel_Reverse
 */
public class String_Vowel_Reverse {

    public static void main(String[] args) {
        String str = new String("equ56564ation");

        // String[] arr = str.split("|");
        // int s = 0;
        // int e = str.length()-1;
        // while(s<e){
        // if(!(arr[s].matches("[aeiouAEIOU]"))){
        // s++;
        // }
        // else if(!(arr[e].matches("[aeiouAEIOU]"))){
        // e--;
        // }
        // else{
        // String temp=arr[s];
        // arr[s]=arr[e];
        // arr[e]=temp;
        // s++;
        // e--;
        // }
        // }
        // for (String string : arr) {
        // System.out.print(string+" ");
        // }

        String st = "";
        String[] arr = str.split("|");
        int j = 0;
        while(j<arr.length) {
            
            if (!(arr[j].matches("[0 1 2 3 4 5 6 7 8 9]"))) {

                j++;

            }
            //  else
                // st += arr[j];

        }
        // for (String string : arr) {
        //     System.out.print(string + " ");
        // }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
