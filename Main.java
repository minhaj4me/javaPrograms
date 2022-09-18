class A {
    int i = 10;
    // System.out.println(i);
}

class B extends A {
    int i = 20;

    // System.out.println(i);
}

class C extends B {
    int i = 30;

    public void m1() {
        System.out.println(super.i);
    }

    A a = new A();

    public void m2() {
        System.out.println(a.i);
    }

    // System.out.println(i);
}

class H{
    H(){
        System.out.println("tt");
    }
    H(int i){
System.out.println("lll");
    }
}
class G extends H{
G(){
    super(6);
    System.out.println("ggg");
}
}

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.i);
        c.m1();
        c.m2();
        new G();
    }
}