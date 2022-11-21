public class One_Two_Pattern {
    public static void main(String[] args) {
        int row = 4;
        int col = 6;
        
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1" + " ");
                } else {
                    System.out.print("2" + " ");
                }
            }
            System.out.println();
        }
        
    }
}

// for (int i = 1; i <= row; i++) {
//     for (int j = 1; j <= col; j++) {
//         if ((i % 2 == 0 && j % 2 == 0) ) {
//             System.out.print("2" + " ");
//         } else {
//             System.out.print("1" + " ");
//         }
//     }
//     System.out.println();

// }
// System.out.println();