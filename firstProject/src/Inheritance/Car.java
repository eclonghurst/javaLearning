package Inheritance;

public class Car extends Vehicle{

    public Car() {
        super();
    }

    public Car(String name, String manufacturer, float weight, float maxSpeed, int age) {
        super(name, manufacturer, weight, maxSpeed, age);
    }
}
