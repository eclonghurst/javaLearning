package Inheritance;

import java.util.ArrayList;
import java.util.List;

public class Shed<V extends Vehicle> {

    private V Vehicle;

    public V getVehicle() {
        return Vehicle;
    }

    public void setVehicle(V vehicle) {
        Vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "Shed{" +
                "Vehicle=" + Vehicle +
                '}';
    }
}
