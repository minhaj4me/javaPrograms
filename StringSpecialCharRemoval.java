/*
Inp = cats And*Dogs_are Awesome
Outp = CatsAndDogsAreAwesome
Final o/p = CaxsAxdDxgsxrexwexomx
s.substring(0,1).toUpperCase();

*/

/**
 * StringSpecialCharRemoval
 */
public class StringSpecialCharRemoval {

    public static void main(String[] args) {
        String s = new String("cats And*Dogs_are Awesome");
        for (int i = 0; i < s.length(); i++) {
            // System.out.print(s.charAt(i));
            if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
                s.toUpperCase();
                System.out.print(s.charAt(i));
            
            } else if (s.charAt(i) >= 97 && s.charAt(i) <= 122)
                System.out.print(s.charAt(i));
        }

        

    }

}