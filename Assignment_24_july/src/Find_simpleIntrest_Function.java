// WAP to find Simple Interest  with function argument & return.
public class Find_simpleIntrest_Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter Principle Amount!");
		double p=sc.nextDouble();
		System.out.println("Enter Rate of Intrest!");
		double r=sc.nextDouble();
		System.out.println("Enter Time!");
		int t=sc.nextInt();
		System.out.printf("Simple Intrest is %.2f",findSimpleIntrest(p,r,t));
	}

	public static double findSimpleIntrest(double p,double r,int t) {
		return ((p*r*t)/100);
	}

}
