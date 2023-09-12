package Inheritance;

public class Plane extends Vehicle{

    public Plane() {
        super();
    }

    public Plane(String name, String manufacturer, float weight, float maxSpeed, int age) {
        super(name, manufacturer, weight, maxSpeed, age);
    }
}
