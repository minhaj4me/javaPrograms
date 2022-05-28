package core;

class Box {
    int height;
    int width;
    int length;

    Box(int h, int w, int l) {
        height = h;
        width = w;
        length = l;
    }

    // here we are using this keyword
    Box(int n) {
        this(n, n, n);
    }

    void display() {
        System.out.println("[ Height= " + height + " ,Width= " + width + " ,Length= " + length + "]");
    }
}

public class TestBox {
    public static void main(String[] args) {
        Box b = new Box(4); // here we are calling a constructor by passing an argument and use another
                            // constructor by using this keyword......
        b.display();
    }
}
