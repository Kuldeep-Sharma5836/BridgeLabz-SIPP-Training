
class Customer{
    private String name;
    private String DrivingLicense;
    public Customer(String name,String DrivingLicense){
        this.DrivingLicense=DrivingLicense;
        this.name=name;

    }
    public String getName(){
        return name;
    }
    public String getLicense(){
        return DrivingLicense;
    }

}
