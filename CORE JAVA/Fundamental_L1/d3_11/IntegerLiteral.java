class IntegerLiteral{
    public static void main(String []s){   
        int a=104;      //Decimal Integer Literal
        int b=0150;     //Octal Integer Literal
        int c=0x68;     //Hexa Integer Literal
        //int c=0X68; //allowed
        int d=0b1101000;//Binary Integer Literal
        //int d=0B1101000; //allowed
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        int x=4_53___24_567;
        //int x=_4_53_24_567_; //error because we cannot put (_) in the starting and end of the integer.
        System.out.println(x);
    }
}