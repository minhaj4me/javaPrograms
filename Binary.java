public class Binary
{
  public static void main (String[]args)
  {
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.println("Enter any number to get its binary and get its number of 1's");
    int n = sc.nextInt();
    int binary = 0;
    int count=0;
    while (n != 0)
      {
	int remainder = n % 2;
	  binary = remainder + binary * 10;
// 	  System.out.println (binary);
	  n /= 2;
      }
      int num=binary;
      while(num!=0){
          int rem=num%10;
      if(rem==1){
                count+=1;
            }
            num=num/10;
             }
       System.out.println (count);
    System.out.println (binary);
  }
}
