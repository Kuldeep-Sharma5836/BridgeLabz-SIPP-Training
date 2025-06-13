import java.util.*;
public class KMintoMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double kilometers = sc.nextDouble();
        double miles = kilometers * 1.6; 
        System.out.printf("Distance in "+ kilometers +" into  miles is "+ miles);
    }
}
