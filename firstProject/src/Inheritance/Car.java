package Inheritance;

public class Car extends Vehicle{

    public Car() {
        super();
    }

    @Override
    public double calcBill() {
        return 100;
    }

    public Car(String name, String manufacturer, float weight, float maxSpeed, int age) {
        super(name, manufacturer, weight, maxSpeed, age);
    }
}
