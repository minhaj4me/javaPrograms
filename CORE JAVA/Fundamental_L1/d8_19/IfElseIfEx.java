
public class IfElseIfEx {
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util. Scanner( System.in );
		
		System.out.println("Enter Your Age: ");
		int a=sc.nextInt();
		if(a<0 || a>=120) {
			System.out.println("Invalid Age.");
		}else if(a<=4) {
			System.out.println("You are Baby.");
		}else if(a<=10) {
			System.out.println("You are Kid.");
		}else if(a<=16) {
			System.out.println("You are Teenager.");
		}else if(a<=50) {
			System.out.println("You are Adult.");
		}else if(a<=80) {
			System.out.println("You are OldAge.");
		}else {
			System.out.println("You are Very OldAge.");
		}
	}
}
