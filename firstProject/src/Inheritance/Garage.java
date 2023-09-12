package Inheritance;

import java.util.ArrayList;
import java.util.List;

public class Garage {

    private List<Vehicle> garage = new ArrayList<>();

    @Override
    public String toString() {
        return "Garage{" +
                "garage=" + garage +
                '}';
    }

    public boolean addVehicle(Vehicle v) {
        return this.garage.add(v);
    }

    public boolean removeVehicle(int id) {

        //loop through until you find the matching id
        for (Vehicle vehicle : garage) {
            if (vehicle.getId() == id) {
                return this.garage.remove(vehicle);
            }
        }
        return false;
    }

    public void removeAllVehicles() {
        garage.clear();
    }

    public float calculateBill() {
        float totalBill = 0;
        for (Vehicle v : garage) {
            if (v.getClass() == Car.class) {
                totalBill += 100;
            }
            else if (v.getClass() == Motorbike.class) {
                totalBill += 20;
            }
            else if (v.getClass() == Plane.class) {
                totalBill += 500;
            }
            else return totalBill;
        }
        return totalBill;
    }
}