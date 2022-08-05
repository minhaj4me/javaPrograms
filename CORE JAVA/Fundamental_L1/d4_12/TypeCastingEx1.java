class TypeCastingEx1{
	static public void main(String s[]){
		char a='h';
		int b=a;
		System.out.println(a);
		System.out.println(b);
		
		int x=104;
		//char y=x;//error
		char y=(char)x;
		System.out.println(x);
		System.out.println(y);
	} 
}