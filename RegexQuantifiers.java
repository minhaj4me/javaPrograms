public class RegexQuantifiers {
    public static void main(String[] args) {

        // QUANTIFIERS--------
        // this will for multiple chracters;
        // earlier is for only single characters;

        String s1 = "abc";
        // '.*' - anything for any number of times
        System.out.println(s1.matches(".*"));

        String s2 = "abbbcac";
        // * - means 0 or more time
        // '[abc]*' - this will match but for any length of all abc like
        // ----aabbcc abcca accbba but not abm
        System.out.println(s2.matches("[abc]*"));

        String s3 = "okgoogle";
        // '[a-z]*' this will take a-z of any character of any length
        System.out.println(s3.matches("[a-z]*"));

        String s4 = "abbbcac";
        // + - means one or more time
        // '[abc]+' - this will match but for any lenght of all abc like
        // ----aabbcc abcca accbba but not abm
        System.out.println(s4.matches("[abc]+"));

        String s5 = "okgoogle";
        // '[a-z]+' this will take a-z of any character of any length
        System.out.println(s5.matches("[a-z]+"));

        String s6 = "a";
        // ? - means 0 or 1 time
        // '[abc]?' - this will match but for any lenght of all abc like
        // ----aabbcc abcca accbba but not abm
        System.out.println(s6.matches("[abc]?"));

        String s7 = "";
        // '[a-z]?' this will take a-z of any character of any length
        System.out.println(s7.matches("[a-z]?"));

        String s8 = "apkpp";
        // '[a-z]{5}' - means that any character but of only 5 size like
        // -- apple aplop klmno etc;
        System.out.println(s8.matches("[a-z]{5}"));

        String s9 = "abcu";
        // '[a-z]{start,end}' - means this will give us a range of character from start
        // to end;
        System.out.println(s9.matches("[a-z]{2,6}"));

        // GMAIL

        String g = "abc@gmail.com";
        System.out.println("Gmail Match - " + g.matches(".*gmail.*"));
        System.out.println("Gmail Match - " + g.matches("\\w*@gmail(.*)"));
    }

}
