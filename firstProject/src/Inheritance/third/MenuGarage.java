package Inheritance.third;

import Inheritance.first.Car;
import Inheritance.first.Garage;
import Inheritance.first.Motorbike;

import java.util.Scanner;

public class MenuGarage {

    public void Menu() {
        Scanner scanner = new Scanner(System.in);
        Garage g = new Garage();

        System.out.println("Select an option via the number: \n1. Add a vehicle \n2. Remove a vehicle \n3. Calculate bill");
        String input = scanner.nextLine();

        switch (input) {
            case "1":
                System.out.println("Please enter your vehicle type: ");
                String inputTwo = scanner.next();
                switch (inputTwo){
                    case "Car":
                        Car c = new Car("Car");
                        g.addVehicle(c);
                        System.out.println(g);
                    case "Motorbike":
                        Motorbike m = new Motorbike("Bike");
                        g.addVehicle(m);
                        System.out.println(g);
                }
                break;
            case "2":
                System.out.println("Please provide the id for removal: ");
                break;

            case "3":
                System.out.println(g.billTotal());
                break;
        }
    }

    public void MainMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select an option via the number: \n1. Add a vehicle \n2. Remove a vehicle \n3. Calculate bill");
        String input = scanner.nextLine();
    }

    public void AddVehicle(Garage g){
        Car c = new Car("Car");
        g.addVehicle(c);
        System.out.println(g);
    }
}
