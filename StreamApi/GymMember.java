import java.time.LocalDate;
public class GymMember {
    String name;
    LocalDate expiryDate;
    GymMember(String name,LocalDate expiryDate){
        this.name=name;
        this.expiryDate=expiryDate;
    }
    public String toString(){
        return name+" expires "+expiryDate;
    }
}