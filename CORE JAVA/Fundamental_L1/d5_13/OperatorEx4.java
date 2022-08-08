
public class OperatorEx4 {

	public static void main(String[] args) {
		int a=10;
		a /= 5;
		//a =/ 5;//error
		System.out.println(a);
		a=10;
		a *= 5;
		//a =* 5;//error
		System.out.println(a);
		a=10;
		a %= 5;
		//a =% 5;//error
		System.out.println(a);
		a=10;
		a += 5;
		System.out.println(a);
		a=10;
		a =+ 5;
		System.out.println(a);
		a=10;
		a -= 5;
		System.out.println(a);
		a=10;
		a =- 5;
		System.out.println(a);
		
		a=10;
		a%=14;
		System.out.println(a);
	}

}
