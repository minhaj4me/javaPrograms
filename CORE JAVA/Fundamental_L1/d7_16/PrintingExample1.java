
public class PrintingExample1 {

	public static void main(String[] args) {
		double a=26.584128787;
		System.out.println(a);
		System.out.print(a);
		System.out.print(a+"\n");
		System.out.print(a+"%n");
		
		System.out.printf("%f\n",a);
		System.out.printf("%f%n",a);
		
		System.out.format("%f\n",a);
		System.out.format("%f%n",a);
		

		System.out.printf("%.3f\n",a);
		System.out.format("%.3f\n",a);
	}

}
