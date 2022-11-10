import java.util.*;

public class C1 {
    public static void main(String[] args) {
        // System.out.println("Hello World");
        ArrayList<Integer> a1 = new ArrayList<Integer>(3);
        a1.add(2);
        a1.add(1);
        a1.add(3);
        a1.add(5);
        a1.add(4);
        // System.out.print (a1.indexOf (20) + " " + a1.lastIndexOf (20));
        // System.out.print ();

        // only forward

        Iterator<Integer> it = a1.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        System.out.println();

        // both
        ListIterator<Integer> lit = a1.listIterator();
        while (lit.hasNext()) {
            System.out.print(lit.next() + " ");
            System.out.println();
            // System.out.print (lit.previous () + " ");
        }

        // forEach
        a1.forEach(n -> System.out.print(n + " "));
        System.out.println();
        // forEach Scope Resolution Operator
        a1.forEach(System.out::print);
        System.out.println();

        // lambda Expression
        a1.forEach(n -> show(n));
    }

    // Outside main so, static
    public static void show(int n) {
        if (n > 3)
            System.out.print(n);
    }
}
