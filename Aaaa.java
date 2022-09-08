// /**
//  * Aaaa
//  */
// public class Aaaa {

//     public static void main(String[] args) {
//         int arr1[] = { 1, 2, 3,5, 9 };
//         int arr2[] = { 2, 3, 5};
//         boolean flaf = true;
//         for (int i = 0; i < arr1.length; i++) {
//             for (int j = 0; j < arr2.length; j++) {
//                 if (arr1[i] == arr2[j]) {
//                     flaf = false;
//                     break;
//                 }
//             }
//             if (flaf)
//                 System.err.print(arr1[i] + " ");
//                 flaf=true;
//         }
//     }
// }

/**
 * A
 */
public class Aaaa {
    static void fun(int n) {
        for (int i = 0; i < num; i++) {
            System.out.print(i + " ");
        }
        System.out.print(fun(n--));
    }

    public static void main(String[] args) {
        int num = 3;
        fun(num);

    }
}