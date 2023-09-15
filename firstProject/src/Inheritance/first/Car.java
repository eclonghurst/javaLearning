package Inheritance.first;

public class Car extends Vehicle {

    public Car() {
        super();
    }

    public Car(String name) {
        super(name);
    }

    @Override
    public double calcBill() {
        return 100;
    }

    public Car(String name, String manufacturer, float weight, float maxSpeed, int age) {
        super(name, manufacturer, weight, maxSpeed, age);
    }
}
