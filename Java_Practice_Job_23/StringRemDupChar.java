public class StringRemDupChar {
    public static void main(String[] args) {
        String str = "programming";
        char ch[] = new char[20];

        for (int i = 0; i < str.length(); i++) {
            boolean flag = false;
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                ch[i] = str.charAt(i);
            }
        }
        System.out.print(ch);
    }
}