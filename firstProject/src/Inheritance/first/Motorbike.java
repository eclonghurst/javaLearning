package Inheritance.first;

public class Motorbike extends Vehicle {

    public Motorbike() {
        super();
    }

    public Motorbike(String name) {
        super(name);
    }

    @Override
    public double calcBill() {
        return 20;
    }

    public Motorbike(String name, String manufacturer, float weight, float maxSpeed, int age) {
        super(name, manufacturer, weight, maxSpeed, age);
    }

}
