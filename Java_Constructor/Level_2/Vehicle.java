import java.util.*;

public class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 2500.0;

    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    void displayVehicleDetails() {
        System.out.println("Owner Name       : " + ownerName);
        System.out.println("Vehicle Type     : " + vehicleType);
        System.out.println("Registration Fee : ₹" + registrationFee);
        System.out.println("-----------------------------------");
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter owner's name: ");
        String owner = sc.nextLine();

        System.out.print("Enter vehicle type (e.g., Car, Bike): ");
        String type = sc.nextLine();
        Vehicle v1 = new Vehicle(owner, type);
        System.out.println("Vehicle Details Before Updating Fee:");
        v1.displayVehicleDetails();
        System.out.print("Enter new registration fee: ");
        double newFee = sc.nextDouble();
        Vehicle.updateRegistrationFee(newFee);
        System.out.println(" Vehicle Details After Updating Fee:");
        v1.displayVehicleDetails();
    }
}
