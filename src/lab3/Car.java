package lab3;

import utils.In;

public class Car {
    private String make;
    private int position;

    public static void main(String[] args) {
        Car car = new Car("BMW", 0);
        System.out.println(car);
        car.move(15);
        System.out.println(car);
    }
    
    Car(String make, int position) {
        this.make = make;
        this.position = position;
    }

    private void move(int distance) {
        this.position += distance;
    }

    @Override
    public String toString() {
        return this.make + " is at position " + this.position;
    }
}
