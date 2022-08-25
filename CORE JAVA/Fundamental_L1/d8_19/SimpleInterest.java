
public class SimpleInterest {
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util. Scanner( System.in );
		
		System.out.println("Enter Principle: ");
		double p=sc.nextDouble();
		System.out.println("Enter Rate: ");
		double r=sc.nextDouble();
		System.out.println("Enter Time: ");
		double t=sc.nextDouble();
		
		double si=p*r*t/100;
		System.out.println("SimpleInterest= "+si);
	}
}
