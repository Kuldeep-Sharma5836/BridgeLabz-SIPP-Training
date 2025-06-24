import java.util.Scanner;
public class MobilePhone {
    String brand;
    String model;
    double price;
    void setDetails(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MobilePhone phone = new MobilePhone();
        System.out.println("Enter Mobile Phone Brand:");
        String brand = sc.nextLine();
        System.out.println("Enter Mobile Phone Model:");
        String model = sc.nextLine();
        System.out.println("Enter Mobile Phone Price:");
        double price = sc.nextDouble();
        phone.setDetails(brand, model, price);
        System.out.println("Mobile Phone Details:-----------------------------------");
        phone.displayDetails();
    }
}
