package _05_class.d_inheritance;

public class Car extends Vehicle{

    public Car(String brand, String model, int year) {
        super(brand, model, year);
    }

    @Override
    public void move() {
        System.out.println("승객을 운송합니다");
    }
}
