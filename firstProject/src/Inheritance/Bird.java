package Inheritance;

public class Bird implements Flyable{

    String name;
    int weight;

    public Bird(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public void fly() {
        System.out.println("Flap flap flap");
    }

    @Override
    public String toString() {
        return "Bird: " + name + ", " + weight;
    }
}
