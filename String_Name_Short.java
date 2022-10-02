class String_Name_Short {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter your name Please");
        String s1 = sc.nextLine();
        String[] arr = s1.split(" ");
        for (int i = 0; i < arr.length - 1; i++) {
            int j = 0;
            // while (j <= i) {
                System.out.print(arr[i].charAt(j) + ".");
                // break;
            // }
        }
        System.out.print(arr[arr.length - 1]);
    }
}
