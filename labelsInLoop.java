// public class labelsInLoop {
//     public static void main(String[] args) {
//        outer: for (int i = 1; i <= 25; i++) {
//             if (i % 2 == 0)
//                 continue outer;
//             System.out.print(i + " ");
//         }
//     }
// }

// public class labelsInLoop {
//     public static void main(String[] args) {
//         outer: for (int i = 1; i <= 25; i++) {
//             if (i == 20)
//                 break outer;
//             System.out.print(i + " ");
//         }
//     }
// }

public class labelsInLoop {
    public static void main(String[] args) {
        outer: for (int i = 1; i <= 5; i++) {
            inner: for (int j = 1; j <= 10; j++) {
                if (j == 4)
                    break inn;
                System.out.print(j + " ");
            }
            System.out.println("");

        }
    }
}