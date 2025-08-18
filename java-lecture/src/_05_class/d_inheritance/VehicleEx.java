package _05_class.d_inheritance;

public class VehicleEx {
    public static void main(String[] args) {

        Car car = new Car("Hyundai", "City Bus", 2022);
        Bus bus = new Bus("Toyota", "Camry", 2023);
        Motorcycle motor = new Motorcycle("Harley-Davidson", "Sportster", 2021);

        System.out.println("=== Bus 정보 ===");
        System.out.println("Bus " + car);
        car.start();
        car.move();
        car.stop();

        System.out.println("=== Car 정보 ===");
        System.out.println("Car " + bus);
        bus.start();
        bus.move();
        bus.stop();

        System.out.println("=== Motorcycle 정보 ===");
        System.out.println("Motorcycle " + motor);
        motor.start();
        motor.move();
        motor.stop();
    }
}
