public class MotorBike extends Vehicle {
    private Engine engine;

    public MotorBike(String id, int speed, String brand, double price, String color, Engine engine) {
        super(id, speed, "Petrol", 15, "Bike", brand, 2024, engine.getEngineCapacity(), 
              2, color, price, false, 0, 200, false, false, "Manual", 
              "High", "City", true, "None", "Pending", true, "New");
        this.engine = engine;
    }

    @Override
    public void move() {
        System.out.println("MotorBike is speeding with engine " + engine.getEngineCapacity() + "L");
    }
}
