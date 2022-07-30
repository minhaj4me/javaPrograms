// WAP to find a given number is Prime or Not with function argument & return.
public class Find_Prime_using_function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc=new java.util.Scanner(System.in);

		String s;
		do {
			System.out.println("Enter a number to check it is Prime or Not!");
			int n=sc.nextInt();
			if(n<0) {
				System.out.println("Please Enter valid number");
				break;
			}
			else if(n==0||n==1) {
				System.out.println("Please Enter valid number");
			}
			else {
				System.out.println(findPrime(n));
			}
			System.out.println("Do you wanna Continue?[Yes/No]");
			s=sc.next();

		}while(s.equalsIgnoreCase("yes"));


	}
	public static boolean findPrime(int n) {
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;

	}
}
