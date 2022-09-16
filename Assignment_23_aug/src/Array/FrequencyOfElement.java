//Write a program to find frequency of each element in a 1D array.
package Array;

import java.util.Scanner;

public class FrequencyOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		// int tempArr[] = new int[n];
		// tempArr[0] = 0;
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			// System.out.println(i);
			boolean flag = true;
			for (int z = 0; z < i; z++) {
				if (arr[z] == arr[i])
					flag = false;

			}
			if (flag) {
				for (int j = i + 1; j < arr.length; j++) {

					if (arr[i] == arr[j]) {
						count++;
					}
					// else {
					// System.out.println(arr[i] + " " + count);
					// }
				}
				// tempArr[i] = arr[i];
				// if (arr[i] != tempArr[i])
				System.out.println(arr[i] + " " + count);
				// tempArr[i] = arr[i];
				// }
			}
		}
		// int count = 1;
		// int p=0;
		// int q=arr.length-1;
		// for (int i = 0; i < arr.length; i++) {
		// // for (int j = i + 1; j < arr.length; j++) {
		// if (arr[p] == arr[q]) {
		// count++;
		// // }
		// }
		// p++;q--;
		// System.out.println(arr[i] + " is " + count + " times.");
		// }
		// **************************************************************************************************************
		// int c = 1;
		// int p = 0;
		// int q = arr.length-1;
		// while (p<q) {
		// if (arr[p] == arr[q]) {
		// c++;
		// }
		// p++;
		// q--;
		// System.out.println(arr[p] + " " + c);
		// }
		// *****************************************************************************************************************************
		// */
		// int count = 2;
		// int arr1[] = new int[n];
		// arr1[0] = 0;
		// for (int i = 0; i < arr.length; i++) {
		// for (int j = i + 1; j < arr.length; j++) {
		// if (arr1[i] == arr[i]) {
		// if (arr[i] == arr[j]) {
		// count++;
		// }
		// }
		// arr1[i] = arr[i];
		// }
		// System.out.println(arr[i] + " is " + count + " times.");
		// }
	}
}
