// WAP to find a given number is even or odd.
public class Even_Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter a number to check Even or Odd");
		int num=sc.nextInt();
		
//		if(num<0) {
//			System.out.println("Please Enter a Valid Number");
//		}
//		else 
		if(num%2==0) {
			System.out.println(num+" is Even");
		}
		else {
			System.out.println(num+" is Odd");
		}
	}

}
