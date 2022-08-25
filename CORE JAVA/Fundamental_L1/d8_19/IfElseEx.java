
public class IfElseEx {
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util. Scanner( System.in );
		
		System.out.println("Enter Your Age: ");
		int a=sc.nextInt();
		if(a>=10 && a<=16) {
			System.out.println("You are Teenager.");
		}else {
			System.out.println("You are NOT Teenager.");
		}
		System.out.println("Bye App");
	}
}
