import java.util.*;
interface Rent {
    double calculateRent(int days);
}

abstract class Vehicle  implements Rent{
    protected String model;
    protected String number;
    protected double price;
    public Vehicle(String number,String model,double price){
        this.model=model;
        this.number=number;
        this.price=price;
    }
    public String getModel(){
        return model;
    }
    public double getPrice(){
        return price;
    }
    public String getNumber(){
        return number;
    }
    public void display(){ 
        System.out.println("Model : "+model);
        System.out.println("Number : "+number);
        System.out.println("Price : "+price);
    }
}


public class VehicleManagement{
    
static ArrayList<String> l = new ArrayList<>();
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        
        while(true){
            System.out.println("----------------------------------------------------------");
            System.out.println();
            System.out.println("You want to rent a vehicle type rent :");
            System.out.println("Want to show history type show :");
            System.out.println("Want to exit type exit :");
            String input = sc.next();
            if (input.equalsIgnoreCase("show")) {
                System.out.println();
                System.out.println("History of Customers:");
                    if (l.isEmpty()) {
                        System.out.println("No customers found.");
                        continue;
                    }else{
                    for (int i = 0; i < l.size(); i += 2) {
                        String customerName = l.get(i);
                        String vehicleType = l.get(i + 1);
                        System.out.println("Customer Name: " + customerName + ", Vehicle Type: " + vehicleType);
                }
                System.out.println("----------------------------------------------------------");
            
            }
            else if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the system. Thank you!");
                return;
            } 
            else{ 
            System.out.println("----------------------------------------------------------");
            System.out.println();
            System.out.println("Welcome to Vehicle Management System");
            System.out.println("Enter customer name :");
            String customername=sc.next();
            System.out.println("Enter DL number : ");
            String city=sc.next();
            Customer c=new Customer(customername, city);
            l.add(customername);
            System.out.println("Enter vehicle name :  Bike | car | truck : ");
            String choice=sc.next();
            l.add(choice);  
            switch (choice) {
               
                case "Bike": 
                    System.out.println("Enter days for rent :   ");
                    int days = sc.nextInt();
                    Vehicle  Bike=new Bike("UK07G001","BMW32",150);
                    System.out.println("Details of Bike :");
                    System.out.println();
                    System.out.println(c.getName());
                    Bike.display();
                    System.out.println("Rent for "+days+" days is : "+Bike.calculateRent(days));

                    break;
                
                case "car": 
                    System.out.println("Enter days for rent :   ");
                    days = sc.nextInt();
                    Vehicle  car=new car("UP80FS5836","M340I",1500);
                    System.out.println("Details of Car :");
                    System.out.println();
                    System.out.println(c.getName());
                    car.display();
                    System.out.println("Rent for "+days+" days is : "+car.calculateRent(days));
                    break;

                case "Truck":
                    System.out.println("Enter days for rent :   ");
                    days = sc.nextInt();
                    Vehicle  Truck=new Truck("RJ11D2248","TATA545",5000);
                    System.out.println("Details of Truck :");
                    System.out.println();
                    System.out.println(c.getName());
                    Truck.display();
                    System.out.println("Rent for "+days+" days is : "+Truck.calculateRent(days));
                    break;
               
                default:
                    break;
            }      
        }
    }   
    }
}