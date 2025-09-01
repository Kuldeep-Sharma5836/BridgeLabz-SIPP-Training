public class Doctor {
    String name;
    String specialty;
    boolean availableOnWeekend;
    Doctor(String name,String specialty,boolean availableOnWeekend){
        this.name=name;
        this.specialty=specialty;
        this.availableOnWeekend=availableOnWeekend;
    }
    public String toString(){
        return name+" - "+specialty;
    }
}