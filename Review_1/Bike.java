
class Bike extends Vehicle{
    public Bike(String number,String model,double price){
        super(number,model,price);
    }
    
    public double calculateRent(int days){
        return price*days;
    }
    public void display(){ 
        System.out.println("Model : "+model);
        System.out.println("Number : "+number);
        System.out.println("Price : "+price);
    }
}