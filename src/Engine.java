
public class Engine {
    private double engineCapacity;
    private String fuelType;

    // ده اللي كان موجود
    public Engine(double engineCapacity, String fuelType) {
        this.engineCapacity = engineCapacity;
        this.fuelType = fuelType;
    }

    // ضيفنا ده عشان يحل مشكلة الـ Main
    public Engine(double engineCapacity) {
        this.engineCapacity = engineCapacity;
        this.fuelType = "Petrol"; // قيمة افتراضية
    }

    public double getEngineCapacity() { return engineCapacity; }
    public String getFuelType() { return fuelType; }
