
class car extends Vehicle{
    public car(String number,String model,double price){
        super(number,model,price);
    }
    
    public double calculateRent(int days){
        double tax=500;
        return (price*days)+tax;
    }
    public void display(){ 
        System.out.println("Model : "+model);
        System.out.println("Number : "+number);
        System.out.println("Price : "+price);
    }
}
