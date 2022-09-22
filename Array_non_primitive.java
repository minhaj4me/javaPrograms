class A {
    static{
System.out.println("static block");
    }
    {
        System.out.println("Initializ block");
    }
    A(int a) {
        this();
        System.out.println(a);
    }
    A() {
        System.out.println("zero arg constructor");
    }

    void show() {
        System.out.println("Hi");
    }
}

public class Array_non_primitive {
    public static void main(String[] args) {
        A[] a = new A[3];
        a[0] = new A(8);
        a[1] = new A(9);
        a[2] = new A(6);
        a[0].show();
        a[1].show();
        a[2].show();
    }
}
