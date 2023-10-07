public class StringCheck {
    public static void main(String[] args) {
        String name = "wdwr";

        int countStringLength = name.length();
        if (countStringLength <= 4) {
            System.out.println("Not Golden");
            return;
        } else if (name.charAt(0) == 'A' || name.charAt(0) == 'a') {
            System.out.println("Golden");
            // System.out.println("String is : " + name);
            // System.out.println("String Length is : " + countStringLength);

        }

    }
}
