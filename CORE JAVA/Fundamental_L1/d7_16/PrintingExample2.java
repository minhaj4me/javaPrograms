
public class PrintingExample2 {

	public static void main(String[] args) {
		int a=10;
		double b=23.45;
		String c="Hello";
		char d='h';
		boolean e=true;
		System.out.printf("%d\n",a);
		System.out.printf("%f\n",b);
		System.out.printf("%s\n",c);
		System.out.printf("%c\n",d);
		System.out.printf("%b\n",e);
		
		System.out.printf("%d\n%f\n%s\n%c\n%b\n",a,b,c,d,e);
		System.out.printf("%d%n%f%n%s%n%c%n%b%n",a,b,c,d,e);
	}

}
