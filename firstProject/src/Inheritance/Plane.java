package Inheritance;

public class Plane extends Vehicle implements Flyable{

    public Plane() {
        super();
    }

    @Override
    public double calcBill() {
        return 500;
    }

    //Interface method
    @Override
    public void fly() {
        System.out.println("Nyoooommmm");
    }

    public Plane(String name, String manufacturer, float weight, float maxSpeed, int age) {
        super(name, manufacturer, weight, maxSpeed, age);
    }


}
