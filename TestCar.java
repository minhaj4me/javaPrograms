package core;

class Car {
    int regNum;
    String color;
    private static int count = 1000;

    {
        regNum = count++;
    }

    Car() { 

    }

    Car(String c) {
        color = c;
    }

    void display() {
        System.out.println("num = " + regNum + " , color = " + color); 
    }

}

public class TestCar {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("red");
        c1.display();
        c2.display();

    }
}
