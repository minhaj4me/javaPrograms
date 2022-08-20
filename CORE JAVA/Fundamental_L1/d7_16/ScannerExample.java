
public class ScannerExample {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.println("Enter a Integer number:");
		int a=sc.nextInt();
		System.out.println("Enter a Floating Point number:");
		double b=sc.nextDouble();
		System.out.println("Enter a String but single word:");
		String c=sc.next();
		
		System.out.println("Entered Interger Number: "+a);
		System.out.println("Entered Floating Point Number: "+b);
		System.out.println("Entered String Number: "+c);
	}

}
