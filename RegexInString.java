/**
 * RegexInString
 */
public class RegexInString {

    public static void main(String[] args) {

        /*
         * regular expression are used for defining patterns for strings... // we can
         * define a patternn to check wheter that string is matching that pattern or
         * not.
         */

        String str = "5";
        // "." - this will matches a single character or whatever single character and
        // return boolean value
        System.out.println(str.matches("."));

        String s1 = "c";
        // [abc] - this will return boolean value after matches exactly single character
        // in only this character
        System.out.println(s1.matches("[abc]"));

        String s2 = "av";
        // [abc][vz] - this will give either first or second set and if matches return
        // boolean value;
        System.out.println(s2.matches("[abc][vz]"));

        String s3 = "p";
        // [^abc] - this will give boolean except this particular text
        System.out.println(s3.matches("[^abc]"));

        String s4 = "o";
        // [a-z0-9] - this will either a-z or 0-9 will return boolean;
        System.out.println(s4.matches("[a-z0-9]"));

        String s5 = "c";
        // [A|B|c] - this will either A or B
        System.out.println(s5.matches("A|B|c"));

        String s6 = "X9";
        // [XZ][0-9] - this will give a boolean value after matching with exactly the
        // value given in square brackets;
        System.out.println(s6.matches("[XZ][0-9]"));

        /*
         * Meta Characters (\x) -> but we'll give like this to not confuse the compiler
         * between mwta characters and escape sequence, so like this- (\\x);
         */

        String s7 = "9";
        // '\d' - this will check for single digit
        System.out.println(s7.matches("\\d"));

        String s8 = "a";
        // '\D' - for not a digit
        System.out.println(s8.matches("\\D"));

        String s9 = " ";
        // '\s' for matching space
        System.out.println(s9.matches("\\s"));

        String s10 = "a";
        // '\S' - for not a space;
        System.out.println(s10.matches("\\S"));

        String s11 = "9";
        // '\w' - for a digit or alphabet;
        System.out.println(s11.matches("\\w"));

        String s12 = "#";
        // '\W' - neither alphabet nor digit;
        System.out.println(s12.matches("\\W"));
    }
}