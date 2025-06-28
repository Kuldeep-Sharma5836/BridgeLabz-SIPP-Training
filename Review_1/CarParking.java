import java.util.*;
public class CarParking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ParkingCapacity = 6;
        int i=0;
        while (i!=1) {
            System.out.println("\n------------------------------------------------------------------");
            System.out.println(" Want to Park car enter P \n Want to Unpark car enter U \n Want to exit enter E : ");
            System.out.println("------------------------------");
            char choice = sc.next().charAt(0);
            choice = Character.toUpperCase(choice);
            if (choice=='P') {
                ParkingCapacity--;
                System.out.println("\n------------------------------");
                if (ParkingCapacity < 0) {
                    System.out.println("Parking is full, cannot park more cars.");
                }else{
                    System.out.println( "Capacity left : " + ParkingCapacity);
                    System.out.println("Parked car : " + (6 - ParkingCapacity));
                }
            } else if (choice=='U') {
                ParkingCapacity++;
                System.out.println("\n------------------------------");
                if (ParkingCapacity > 6) {
                    System.out.println("Parking is empty, cannot unpark more cars.");
                }else{
                    System.out.println( "Capacity left : " + ParkingCapacity);
                    System.out.println("Parked car : " + (6 - ParkingCapacity));
                }
            } else if (choice=='E') {
                i=1;
            }
        }
    }
}
