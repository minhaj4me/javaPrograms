// WAP to find the square of a given number with function argument & return.
public class Find_square_Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter a number to get its Square!");
		int num=sc.nextInt();
		System.out.println("The Sqaure of "+num+" is "+findSquare(num));
	}
	
	public static int findSquare(int n) {
		return (n*n);
	}

}
