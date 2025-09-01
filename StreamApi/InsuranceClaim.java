public class InsuranceClaim {
    String type;
    double amount;
    InsuranceClaim(String type,double amount){
        this.type=type;
        this.amount=amount;
    }
    public String getType(){return type;}
    public double getAmount(){return amount;}
}