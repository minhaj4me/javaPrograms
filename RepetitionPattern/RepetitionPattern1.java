/**
 * RepetitionPattern1
 */

// abcd aa bb cc dd aaa bbb ccc ddd aaaa bbbb cccc dddd abcd

public class RepetitionPattern1 {

    public static void main(String[] args) {

        String s = "abcdaabbccddaaabbbcccdddaaaabbbbccccddddabcd";
        String s1[] = s.split("");

        // for (String x : s1) {
        //     System.out.println(x);
        // }


        int countA=0;
        for (int i = 0; i < s1.length; i++) {
            if(s1[i]=="a"){
                countA++;
            }
        }
        System.out.println(countA);
    }
}