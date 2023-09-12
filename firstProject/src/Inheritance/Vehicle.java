package Inheritance;

public class Vehicle {
    private String name;
    private String manufacturer;
    private float weight;
    private float maxSpeed;
    private int age;

    public Vehicle(String name, String manufacturer, float weight, float maxSpeed, int age){
        this.name = name;
        this.manufacturer = manufacturer;
        this.weight = weight;
        this.maxSpeed = maxSpeed;
        this.age = age;
    }

    public Vehicle() {
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", weight=" + weight +
                ", maxSpeed=" + maxSpeed +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(float maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
