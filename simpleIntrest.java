//WAP to find Simple Interest of a given Principle, Rate of Interest  and Time.
public class simpleIntrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Please Enter Principle Amount");
		int p=sc.nextInt();
		System.out.println("Please define rate");
		double r=sc.nextDouble();
		System.out.println("Please tell me the time");
		int t=sc.nextInt();
		double result=((p*r*t)/100);
		System.out.printf("Simple Intrest is %.2f ",result);
				

	}

}
