package Inheritance.second;

import Inheritance.first.Car;

public class RunnerTwo {

    public static void main(String[] args) {

        Shed<Car> carShed = new Shed<>();

        Car c = new Car("Truck", "Ford", 500, 100, 10);
        Car c2 = new Car("Hatchback", "Volkswagen", 300, 140, 8);

        carShed.setVehicle(c2);
        System.out.println(carShed);

        Car newCar = carShed.getVehicle();
        System.out.println(newCar.calcBill());

    }
}
