package _05_class.d_inheritance;

public class Vehicle {
    private String brand;
    private String model;
    private int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String ride(String model) {
        return model;
    }

    public void start() {
        System.out.println("차량 시동을 걸었습니다");
    }

    public void move() {
    }
    
    public void stop() {
        System.out.println("차량을 정지했습니다");
    }

    @Override
    public String toString() {
        return "{brand='" + brand + "', model='" + model + "', year=" + year;
    }
}
