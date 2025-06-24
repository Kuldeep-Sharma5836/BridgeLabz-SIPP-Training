import java.util.*;

public class CarRental {
    String carModel;
    String customerName;
    int rentalDays;
    static int pricePerDay=1000;
    public CarRental(String carModel, String customerName, int rentalDays) {
        this.carModel = carModel;
        this.customerName = customerName;
        this.rentalDays = rentalDays;
    }

    public void displayRentalDetails() {
        System.out.println("Car Rental Details:");
        System.out.println("Customer Name : " + customerName);
        System.out.println("Car Model     : " + carModel);
        System.out.println("Rental Days   : " + rentalDays);
    }
    public void calculateTotalCost() {
        int s= rentalDays * pricePerDay;
        System.out.println(s+" total price");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Car Model: ");
        String model = sc.nextLine();
        System.out.print("Enter Number of Rental Days: ");
        int days = sc.nextInt();
        CarRental rental = new CarRental(model, name, days);

        rental.displayRentalDetails();
        rental.calculateTotalCost();
    }
}
