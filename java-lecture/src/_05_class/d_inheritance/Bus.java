package _05_class.d_inheritance;

public class Bus extends Vehicle{

//    private int passengerCapacity;

    public Bus(String brand, String model, int year) {
        super(brand, model, year);
    }

    @Override
    public void move() {
        System.out.println("주차했습니다");
    }
}
