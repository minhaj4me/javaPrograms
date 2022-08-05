class TypeCastingEx{
	static public void main(String s[]){
		int a=10;
		System.out.println(a);
		double b=a;//upcasting/widening/Implicit TypeCasting
		System.out.println(b);
		
		double x=25.3;
		System.out.println(x);
		//int y=x;//compile time error
		int y=(int)x;//downcasting/Narrowing/Explicit TypeCasting
		System.out.println(y);
		
	} 
}