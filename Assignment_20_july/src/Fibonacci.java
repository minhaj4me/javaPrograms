// WAP to print Fibonacci series till 100.

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Fibonnact Series till 100!");
		long a = 0l;
		long b = 1l;
		System.out.print(a + " ");
		System.out.print(b);
		for (int x = 2; x <= 100; x++) {
			long c = a + b;
			System.out.print(" " + c);
			long temp = c;
			a = b;
			b = temp;

		}
	}
}
