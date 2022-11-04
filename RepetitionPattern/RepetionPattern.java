/**
 * RepetionPattern
 */
public class RepetionPattern {

    public static void main(String[] args) {
        String s = new String("aaabbbcccddf");
        int count = 1,i;
        for (i = 0; i < s.length()-1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                System.out.println(s.charAt(i) + " " + (count));
                count = 1;
            }

        }
        System.out.println(s.charAt(i) + " " + (count));

    }
}