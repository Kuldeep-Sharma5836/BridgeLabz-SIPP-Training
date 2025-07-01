class Device{
    int id;
    String status;
    public Device(int id, String status) {
        this.id = id;
        this.status = status;
    }
    public void displayInfo() {
        System.out.println("Device ID: " + id + ", Status: " + status);
    }
}
class thermostat extends Device {
    int temperature;
    public thermostat(int id, String status, int temperature) {
        super(id, status);
        this.temperature = temperature;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Thermostat Temperature: " + temperature + "°C");
    }
}
public class SmartHomeDevice {
    public static void main(String[] args) {
        Device device = new Device(1, "On");
        thermostat thermo = new thermostat(2, "On", 22);
        
        thermo.displayInfo();
    }
}
