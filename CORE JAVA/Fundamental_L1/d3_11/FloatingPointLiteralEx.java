class FloatingPointLiteralEx{ 
    public static void main(String []s){
        double a=256.98412;//Simple Floating Point Literal
        double b=2.5698412e+2;//Exponential Floating Point Literal
        System.out.println(a);
        System.out.println(b);

        double x=2_56.98_412;
        //double x=_2_56.98_412_;//error
        //double x=2_56_._98_412;//error wecannot give (_) in starting and ending of decimal...
        System.out.println(x);
    }
} 