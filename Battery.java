public class Battery {
    private int batteryPercentage;

    public Battery() {
        this.batteryPercentage = 100;
    }

    public int getBatteryPercentage() {
        return batteryPercentage;
    }

    public void useBattery(int amount) {
        batteryPercentage = batteryPercentage - amount;
        if (batteryPercentage < 0) {
            batteryPercentage = 0;
        }
    }

    public void recharge() {
        batteryPercentage = 100;
    }
}