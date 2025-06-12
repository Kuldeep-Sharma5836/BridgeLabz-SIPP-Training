import java.util.Scanner;
public class DistanceInFeet {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int feet = sc.nextInt();
        int distanceInyards = feet * 3;
        int distanceInMiles = feet / 5280;
        System.out.println("Distance in yards: " + distanceInyards);
        System.out.println("Distance in miles: " + distanceInMiles);
    }
}
