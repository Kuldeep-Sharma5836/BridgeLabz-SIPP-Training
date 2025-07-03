import java.util.*;

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rate) {
        this.rentalRate = rate;
    }

    public abstract double calculateRentalCost(int days);
}

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

class Car extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Car(String number, double rate, String policy) {
        super(number, "Car", rate);
        this.insurancePolicyNumber = policy;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days + 500; 
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.10; 
    }

    @Override
    public String getInsuranceDetails() {
        return "Policy: " + insurancePolicyNumber + " (10% insurance)";
    }
}

class Bike extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Bike(String number, double rate, String policy) {
        super(number, "Bike", rate);
        this.insurancePolicyNumber = policy;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return 200; // fixed rate
    }

    @Override
    public String getInsuranceDetails() {
        return "Policy: " + insurancePolicyNumber + " (Flat ₹200 insurance)";
    }
}

class Truck extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Truck(String number, double rate, String policy) {
        super(number, "Truck", rate);
        this.insurancePolicyNumber = policy;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days + (1000 * days); 
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.15; 
    }

    @Override
    public String getInsuranceDetails() {
        return "Policy: " + insurancePolicyNumber + " (15% insurance)";
    }
}

public class VehicleRental {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("CAR123", 2000, "POLICY-C1"));
        vehicles.add(new Bike("BIKE456", 500, "POLICY-B1"));
        vehicles.add(new Truck("TRUCK789", 3000, "POLICY-T1"));

        int rentalDays = 5;

        for (Vehicle v : vehicles) {
            System.out.println("Vehicle: " + v.getType() + " | Number: " + v.getVehicleNumber());
            double rentalCost = v.calculateRentalCost(rentalDays);
            double insurance = 0;
            if (v instanceof Insurable) {
                insurance = ((Insurable) v).calculateInsurance();
                System.out.println(((Insurable) v).getInsuranceDetails());
            }
            System.out.println("Rental for " + rentalDays + " days: ₹" + rentalCost);
            System.out.println("Insurance: ₹" + insurance);
            System.out.println("Total: ₹" + (rentalCost + insurance));
            System.out.println();
        }
    }
}
