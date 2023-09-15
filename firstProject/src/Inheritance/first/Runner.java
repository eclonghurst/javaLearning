package Inheritance.first;

import Inheritance.second.Bird;
import Inheritance.second.Flyable;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {

        // Constructor
        Car c = new Car("Truck", "Ford", 500, 100, 10);
        Car c2 = new Car("Hatchback", "Volkswagen", 300, 140, 8);
//        System.out.println(c);

        Motorbike m2 = new Motorbike("R8", "Yamaha", 60, 220, 4);
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
        // add vehicles
        g.addVehicle(c);
        g.addVehicle(c2);
        g.addVehicle(m);
        g.addVehicle(m2);
        g.addVehicle(p);
        //System.out.println(g);

/*    // remove a vehicle by id
    g.removeVehicle(0);
    System.out.println(g);

    // remove all vehicles
    g.removeAllVehicles();
    System.out.println(g);*/

            System.out.println(g.calculateBill());

    // overriding abstract method instead
    System.out.println(g.billTotal());

    g.removeVehicleByType("Car");
    System.out.println(g);

    System.out.println(g.billTotal());

    //Interfaces
    Bird b = new Bird("Macaw", 2);
    List<Flyable> flyables = new ArrayList<>();
    flyables.add(p);
    flyables.add(b);

    System.out.println(flyables);
    for (Flyable f : flyables){
        f.fly();
        }
    }

}
