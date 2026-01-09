
public class Car extends Vehicle {
    private Engine engine;

    public Car(String id, int speed, String brand, double price, String color, Engine engine) {
        super(id, speed, "Petrol", 50, "Car", brand, 2024, engine.getEngineCapacity(), 
              5, color, price, false, 0, 1500, true, true, "Automatic", 
              "Medium", "City", true, "None", "Pending", true, "New");
        this.engine = engine;
    }

    @Override
    public void move() {
        System.out.println("Car is moving with engine " + engine.getEngineCapacity() + "L");
    }
}

