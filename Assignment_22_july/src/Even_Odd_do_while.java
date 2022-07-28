//WAP to find a given number is Even or Odd until the user says NO to continue.
public class Even_Odd_do_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc=new java.util. Scanner( System.in );

		String c;
		do {
			System.out.println("Enter a number to check it is even and odd");
			int n=sc.nextInt();
			
			if(n%2==0) {
				System.out.println(n+" Even number");
			}
			else {
				System.out.println(n+" Odd number");
			}
			
			System.out.println("Do you wanna Continue?[Yes/No]");
			c=sc.next();
		}
		while(c.equalsIgnoreCase("Yes"));
		
		System.out.println("Thanks for using my App!");
	}

}
