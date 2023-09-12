package Inheritance;

public class Plane extends Vehicle{

    public Plane() {
        super();
    }

    @Override
    public double calcBill() {
        return 500;
    }

    public Plane(String name, String manufacturer, float weight, float maxSpeed, int age) {
        super(name, manufacturer, weight, maxSpeed, age);
    }
}
