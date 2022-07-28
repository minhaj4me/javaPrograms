//WAP to find a given number is Palindrome or Not.
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter a no to check it is palindrome or not!");
		int num=sc.nextInt();
		int orgNum=num;
		int rev=0;
		while(num!=0) {
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(rev==orgNum) {
			System.out.println(orgNum+" is Palindrome");
		}
		else {
			System.out.println(orgNum+" is Not Palindrome");
		}

	}

}
