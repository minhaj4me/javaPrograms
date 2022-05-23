import javax.swing.Box;

class Box {
    int length;
    int breadth;
    int height;

    Box() {

    }

    Box(int l, int b, int h) {
        length = l;
        breadth = b;
        height = h;
    }

    Box(int n) {
        length = n;
        breadth = n;
        height = n;
    }

    void display() {
        System.out.println("[" + length + "," + breadth + "," + height + "]");
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box(1, 2, 3);
        Box b3 = new Box(4);

        b1.display();
        b2.display();
        b3.display();

    }
}
