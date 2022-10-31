import javax.sql.rowset.spi.SyncResolver;

// class A {
//     int button=9;

//  private void switchhChannel(int xx){
//      button=xx;

//  }
//     void changeChannel(int x) {
//         switchhChannel(x);
//         System.out.print("Channel Changed"+button);
//     }
// }

// public class Abstraction {
//     public static void main(String[] args) {
//         A a = new A();
//         a.changeChannel(5);
//     }
// }

/**
 * Abstraction
 */

class Parent {
    int x = 9;

    // void show() {
    //     System.out.println(x);
    // }
}

class Child extends Parent {
int y=2;
void m1(){
    System.out.println(y);
    System.out.println(x);

}
}

public class Abstraction {

    public static void main(String[] args) {
// Parent p=new Parent();
Child c=new Child();
c.m1();    
    }
}