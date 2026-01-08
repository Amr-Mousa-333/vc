import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Vehicle> vehicles = new ArrayList<>();

        Car car = new Car(
                "C1", 120, "Toyota", 500000,
                "Red", new Engine(2.0)
        );

        Scooter scooter = new Scooter(
                "S1", 40, "Xiaomi", 15000, "Black"
        );

        MotorBike motorBike = new MotorBike(
                "M1", 180, "Yamaha", 200000,
                "Blue", new Engine(1.0)
        );

        vehicles.add(car);
        vehicles.add(scooter);
        vehicles.add(motorBike);

        System.out.println("=== Vehicles Moving ===");
        for (Vehicle v : vehicles) {
            v.move();
        }

        System.out.println("\n=== Charging Scooter ===");
        if (scooter instanceof Chargeable) {
            ((Chargeable) scooter).charge();
        }
    }
}
