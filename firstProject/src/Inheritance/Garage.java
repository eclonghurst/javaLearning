package Inheritance;

import java.util.ArrayList;
import java.util.List;

public class Garage {

    private List<Vehicle> garage = new ArrayList<>();

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

    public void removeAllVehicles(){
        garage.clear();
    }
    @Override
    public String toString() {
        return "Garage{" +
                "garage=" + garage +
                '}';
    }
}
