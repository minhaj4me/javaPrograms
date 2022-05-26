class Triangle {
    int base;
    int height;

    Triangle(int b, int h) {
        base = b;
        height = h;
    }

    Triangle(Triangle t) {
        base = t.base;
        height = t.height;
    }

    void displayArea() {
        System.out.println("base " + base + " height " + height + " Area " + (base * height) / 2);
    }
}

/**
 * Constructor2
 */
public class Constructor2 {

    public static void main(String[] args) {
        Triangle t1 = new Triangle(2, 14);
        Triangle t2 = new Triangle(4, 6);
        Triangle t3 = new Triangle(t2);
        t1.displayArea();
        t3.displayArea();
    }
}