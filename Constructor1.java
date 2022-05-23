import org.w3c.dom.css.Rect;

class Rectangle {
    int length;
    int breadth;

    Rectangle(int length, int breadth) { // local variable is as same as non static variable that is we use this keyword
                                         // to make difference in these...
        this.length = length;
        this.breadth = breadth;
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
public class Constructor1 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(2, 3);
        rect.display();
    }
}
