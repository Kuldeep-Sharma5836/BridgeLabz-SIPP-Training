class vehicle {
    static int registrationfee;
    final int registrationNumber;
    String ownerName;
    String vehicleType;
    public vehicle(int registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }
    static void setRegistrationFee(int fee) {
        registrationfee = fee;
    }
    static int getRegistrationFee() {
        return registrationfee;
    }
    void displayDetails() {
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: ₹" + registrationfee);
    }
    static void displayRegistrationFee() {
        System.out.println("Registration Fee: ₹" + registrationfee);
    }
}
public class VehicleRegistration {
    public static void main(String[] args) {
        vehicle.setRegistrationFee(5000);

        vehicle vehicle1 = new vehicle(101, "Salman", "Car");
        vehicle vehicle2 = new vehicle(102, "John", "Motorcycle");

        System.out.println("Vehicle Registration Details:");
        System.out.println();

        if (vehicle1 instanceof vehicle) {
            vehicle1.displayDetails();
        }
        System.out.println();

        if (vehicle2 instanceof vehicle) {
            vehicle2.displayDetails();
        }

        System.out.println();
        vehicle.displayRegistrationFee();
    }
}
