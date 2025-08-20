package practice._04_abstract_interface;

import java.util.ArrayList;
import java.util.List;

public class Execute {
    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();

        Car car = new Car("Sonata", 180);
        vehicles.add(car);

        Airplane airplane = new Airplane("Boeing 747", 900);
        vehicles.add(airplane);

        for (Vehicle v : vehicles) {
            v.move();

            if (v instanceof Flyable) {
                ((Flyable) v).fly();
            }
        }

    }
}
