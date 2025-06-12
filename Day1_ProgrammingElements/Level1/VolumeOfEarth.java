import java.util.*;
public class VolumeOfEarth {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int radius=sc.nextInt();
        double pi = 3.14;
        double volumeInCubicMetre = (4.0/3) * pi * radius * radius * radius;
        double volumeInCubicMiles=volumeInCubicMetre*1.6*1.6*1.6;
        System.out.printf("Volume of Earth in cubic metres "+volumeInCubicMetre+" and in cubic miles "+ volumeInCubicMiles);
    }
}
