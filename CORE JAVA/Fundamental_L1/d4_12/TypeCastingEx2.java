class TypeCastingEx{
	static public void main(String s[]){
		System.out.println(23.6);//By-default floating point literal is double
		System.out.println(12);//By-default integer literal is int
		
		//float a=10.6;//compile time error
		//float a=(float)10.6;//allowed
		//float a=10.6f;//allowed
		float a=10.6F;//allowed
		System.out.println(a);
		
		//double b=10.6;//allowed
		//double b=10.6d;//allowed
		double b=10.6D;//allowed
		System.out.println(b);

		//long x=20000000000;//error
		long x=20000000000L;
		System.out.println(x);
	} 
}