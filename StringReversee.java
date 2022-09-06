/**
 * StringReversee
 */
public class StringReversee {

    public static void main(String[] args) {
        String s = new String("abc");
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
    }
}