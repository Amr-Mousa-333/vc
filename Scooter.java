public class Scooter extends Vehicle implements Chargeable {
    
    private Battery battery; // Composition

    // Constructor: بياخد الحاجات المهمة بس
    public Scooter(String id, int speed, String brand, double price, String color) {
        // هنا بنبعت البيانات لكلاس عمرو (Vehicle)
        // الحاجات اللي ملهاش لازمة في السكوتر بعتناها بـ 0 او false او No
        super(id, speed, "Electric", 100, "Scooter", 
              brand, 2024, 0, 1, 
              color, price, true, 50, 20, 
              false, false, "Automatic", "High", 
              "Cairo", true, "Unknown", "Pending", 
              false, "New");
              
        this.battery = new Battery();
    }

    @Override
    public void move() {
        if (battery.getBatteryPercentage() > 0) {
            System.out.println("Scooter " + brand + " is moving silently...");
            battery.useBattery(10);
            System.out.println("Battery level: " + battery.getBatteryPercentage() + "%");
        } else {
            System.out.println("Battery empty! Please charge.");
        }
    }

    @Override
    public void charge() {
        System.out.println("Charging the scooter...");
        battery.recharge();
        System.out.println("Scooter is fully charged 100%");
    }
}