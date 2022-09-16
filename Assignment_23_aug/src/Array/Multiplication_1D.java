//Write a program to find multiplication of all elements in a 1D array.
package Array;

import java.util.Scanner;

public class Multiplication_1D {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int mul = 1;
		for (int m : arr) {
			mul *= m;
		}
		System.out.println(mul);
	}
}
