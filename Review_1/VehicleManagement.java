class vehicle{
    String brand;
    String model;
    String fueltype;
    
    public vehicle(String brand, String model, String fueltype) {
        this.brand = brand;
        this.model = model;
        this.fueltype = fueltype;
    }

}
class Car extends vehicle{
    int serviceCost;
    public Car(String brand, String model, String fueltype, int serviceCost) {
        super(brand, model, fueltype);
        this.serviceCost = serviceCost;
    }
    public void  getServiceCost() {
        System.out.println("Service cost of Car : "+serviceCost);
    }
    public void details(){
        System.out.println("Brand : "+brand);
        System.out.println("Fuel type : "+fueltype);
        System.out.println("Model : "+model);
    }
}
class Truck extends vehicle{
    int serviceCost;
    public Truck(String brand, String model, String fueltype, int serviceCost) {
        super(brand, model, fueltype);
        this.serviceCost = serviceCost;
    }
    public void getServiceCost() {
        System.out.println("Service cost of Truck :"+serviceCost);
    }
    public void details(){
        System.out.println("Brand : "+brand);
        System.out.println("Fuel type : "+fueltype);
        System.out.println("Model : "+model);
    }
}
class Bike extends vehicle {
    int serviceCost;
    public Bike(String brand, String model, String fueltype, int serviceCost){
        super(brand, model, fueltype);
        this.serviceCost=serviceCost;
    }
    public void getServiceCost(){
        System.out.println("Service cost of Bike :" +serviceCost);
    }
    public void details(){
        System.out.println("Brand : "+brand);
        System.out.println("Fuel type : "+fueltype);
        System.out.println("Model : "+model);
    }
}
public class VehicleManagement {
    public static void main(String[] args) {
        Bike bike=new Bike("Hero","m30wq1","petrol",500);
        Car car=new Car("BMW", "M5", "Electric", 5000);
        Truck truck=new Truck("Tata", "swaraj", "Diesel",2000);
        car.getServiceCost();
        car.details();
        System.out.println("--------------------------------------------------------");
        bike.getServiceCost();
        bike.details();
        System.out.println("-----------------------------------------------------------");
        truck.getServiceCost();
        truck.details();
        System.out.println("---------------------------------------------------------------");
    }
}


