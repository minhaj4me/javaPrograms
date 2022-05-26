package core;

public class Driver {
    void drive(Car c) {
        c.start();
        c.accelerate();
        c.brakes();
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();

        Driver d = new Driver();

        d.drive(c1);
        d.drive(c2);

        // Driver d2 = new Driver(c2);

    }
}
