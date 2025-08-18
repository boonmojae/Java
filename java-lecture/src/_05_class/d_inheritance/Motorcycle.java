package _05_class.d_inheritance;

public class Motorcycle extends Vehicle{

    public Motorcycle(String brand, String model, int year) {
        super(brand, model, year);
    }

    @Override
    public void move() {
        System.out.println("울림통을 합니다");
    }
}
