package core;

public class Car {
    int regNum;
    private static int count = 1000;

    Car() {
        regNum = count++;
    }

    void start() {
        System.out.println(regNum + " Car Start");
    }

    void accelerate() {
        System.out.println(regNum + " Car Accelerate");
    }

    void brakes() {
        System.out.println(regNum + " Car Brakes");
    }
}
