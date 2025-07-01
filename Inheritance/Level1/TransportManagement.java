class vehicle{
    int speed;
    String Fueltype;
    public vehicle(int speed, String Fueltype) {
        this.speed = speed;
        this.Fueltype = Fueltype;
    }
    public void displayInfo() {
        System.out.println("Vehicle Speed: " + speed + " km/h, Fuel Type: " + Fueltype);
    }
}
class Car extends vehicle {
    int seatingCapacity;
    public Car(int speed, String Fueltype, int seatingCapacity) {
        super(speed, Fueltype);
        this.seatingCapacity = seatingCapacity;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Car Seating Capacity: " + seatingCapacity);
    }
}
class Bike extends vehicle {
    int seatingCapacity;
    public Bike(int speed, String Fueltype, int seatingCapacity) {
        super(speed, Fueltype);
        this.seatingCapacity = seatingCapacity;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Bike Seating Capacity: " + seatingCapacity);
    }
}
class Truck extends vehicle {
    int loadCapacity;
    public Truck(int speed, String Fueltype, int loadCapacity) {
        super(speed, Fueltype);
        this.loadCapacity = loadCapacity;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Truck Load Capacity: " + loadCapacity + " tons");
    }
}
public class TransportManagement {
    public static void main(String[] args) {
        vehicle[] vehicles = new vehicle[3];
        vehicles[0] = new Car(180, "Petrol", 5);
        vehicles[1] = new Truck(120, "Diesel", 10);
        vehicles[2] = new Bike(100, "Petrol", 2);

        for (vehicle v : vehicles) {
            v.displayInfo();
            System.out.println(); 
        }
    }
}
