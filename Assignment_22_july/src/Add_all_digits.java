//WAP to add all digits of a given number. 
public class Add_all_digits {
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	java.util.Scanner sc=new java.util.Scanner(System.in);
	System.out.println("Enter a no to get its digit sum!");
	int num=sc.nextInt();
	int orgNum=num;
	int sum=0;
	while (num!=0) {
		int rem=num%10;
		sum+=rem;
		num/=10;
	}
	
	System.out.println("The sum of every digits of "+orgNum+" is "+sum);
}
}