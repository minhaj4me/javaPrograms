//WAP to find a given number is Prime or Not until the user says NO to continue
public class Prime_do_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.util.Scanner sc=new java.util. Scanner( System.in );

		String c;
		do {
			System.out.println("Enter a number to know it is Prime or not!");
			int num = sc.nextInt();
			
			boolean b = true;
			if (num == 0 || num == 1) {
				System.out.println(num + " is not a Prime number. so it is False");
			} else if (num < 0) {
				System.out.println("Please enter +ve Integer");
			} else {
				for (int a = 2; a * a <= num; a++) {
					if (num % a == 0) {
						b = false;
						break;
					}
				}
				if (b == true) {
					System.out.println(num + " is a Prime number. so it is True");
				} else {
					System.out.println(num + " is not a Prime number. so it is False");
				}
			}
			
			System.out.println("Do you wanna Continue?[Yes/No]");
			c=sc.next();
		}
		while(c.equalsIgnoreCase("Yes"));
		
		System.out.println("Thanks for using my App!");

	}

}
