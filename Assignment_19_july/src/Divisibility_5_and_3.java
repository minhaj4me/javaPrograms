//WAP to find a given number is divisible by 5 and 3 both.
public class Divisibility_5_and_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.println("Enter a number to check its divisibility by 5 and 3 both.");
		int num=sc.nextInt();
		
		if(num%3==0&&num%5==0) {
			System.out.println("Yes! "+num+" is divisible by 3 and 5");
		}
		else {
			System.out.println("Not divisible");
		}


	}

}
