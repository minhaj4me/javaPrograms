import org.w3c.dom.css.Rect;

class Rectangle {
    int length;
    int breadth;

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    void display() {
        System.out.println("length is " + length + " breadth is " + breadth);
    }

    int area() {
        return length * breadth;

    }
}

/**
 * Constructor
 */
public class Constructor {
    public static void main(String[] args) {
        Rectangle rect=new Rectangle(2,3);
        rect.display();
    }
}