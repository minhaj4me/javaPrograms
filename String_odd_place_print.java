public class String_odd_place_print {

    public static void main(String[] args) {
        java.util.Scanner sc =new java.util.Scanner(System.in);
        System.out.println("Enter any String");
        String S = sc.nextLine();
        String s = "";
        for (int i = 0; i < S.length(); i += 2) {
            s = s + S.charAt(i);
        }
        System.out.println(s);
    }
}
