//WAP to find the greatest number among the five numbers.
public class Greatest_among_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter 5 number to check among them which is greater!");
		
		System.out.println("Enter 1st number");
		int num1=sc.nextInt();
		
		System.out.println("Enter 2nd number");
		int num2=sc.nextInt();
		
		System.out.println("Enter 3rd number");
		int num3=sc.nextInt();
		
		System.out.println("Enter 4th number");
		int num4=sc.nextInt();
		
		System.out.println("Enter 5th number");
		int num5=sc.nextInt();
		
		if(num1>num2&&num1>num3&&num1>num4&&num1>num5) {
			System.out.println(num1+" is greater");
		}
		else if(num2>num3&&num2>num4&&num2>num5) {
			System.out.println(num2+" is greater");
		}
		else if(num3>num4&&num3>num5) {
			System.out.println(num1+" is greater");
		}
		else if(num4>num5) {
			System.out.println(num1+" is greater");
		}
		else {
			System.out.println(num5+" is greater");
		}
		

	}

}
