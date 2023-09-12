package Inheritance;

public class Runner{
    public static void main(String[] args) {

    // Constructor
    Car c = new Car("Truck", "Ford", 500, 100, 10);
//        System.out.println(c);

    // Setters
    Motorbike m = new Motorbike();
        m.setName("R7");
        m.setManufacturer("Yamaha");
        m.setWeight(50);
        m.setMaxSpeed(200);
        m.setAge(8);
//        System.out.println(m);

    Plane p = new Plane("Helicopter", "Euro-copter", 400, 180, 2);
//        System.out.println(p);

    Garage g = new Garage();
    g.addVehicle(c);
    g.addVehicle(m);
    g.addVehicle(p);
    System.out.println(g);

    g.removeVehicle(0);
    System.out.println(g);

    g.removeAllVehicles();
    System.out.println(g);
    }
}
