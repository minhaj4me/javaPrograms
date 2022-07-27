//WAP to find the greatest number among the two numbers.
public class Greatest_btw_two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.println("Enter 1st number");
		int num1=sc.nextInt();
		
		System.out.println("Enter 2nd number");
		int num2=sc.nextInt();
		
		if(num1==num2) {
			System.out.println("Both are equal");
		}
		else if(num1>num2) {
			System.out.println(num1+" is greater");
		}
		else {
			System.out.println(num2+" is greater");
		}

	}

}
