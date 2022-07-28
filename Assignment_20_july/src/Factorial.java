// WAP to find the factorial of a given number. eg: Factorial of 5 is 120.    (5!= 1*2*3*4*5)
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter a number to know its Factorial");
		int num = sc.nextInt();
		int fact = 1;
		if (num == 0 || num == 1) {
			System.out.println("Factorial of " + num + " is " + fact);
		} else if (num < 0) {
			System.out.println("Please enter +ve Integer");
		} else {
			for (int a = 1; a <= num; a++) {
				fact = fact * a;
			}
			System.out.println("Factorial of " + num + " is " + fact);

		}

	}
}