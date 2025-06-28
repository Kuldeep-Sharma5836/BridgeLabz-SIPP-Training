import java.util.*;

public class MovieTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 10;
        int booked = 0;
        int Goldprice = 300;
        int Silverprice = 200;
        int Platinumprice = 500;
        int totalAmount = 0;

        while (true) {
            if (booked >= max) {
                System.out.println("All seats are booked. House Full.");
                System.out.println("Total amount :  " + totalAmount);
                 System.out.println("-----------------------------------");
                System.out.println();
                break;
            }

            System.out.println("Press G for Gold ticket : ");
            System.out.println("Press S for Silver ticket : ");
            System.out.println("Press P for Platinum ticket : ");
            System.out.println("Press E to Exit");
            char ch = sc.next().charAt(0);
            ch = Character.toUpperCase(ch);

            if (ch == 'S') {
                booked++;
                totalAmount += Silverprice;
                System.out.println("Silver ticket booked");
                System.out.println("Capacity left : " + (max - booked));
                System.out.println("Total amount :  " + totalAmount);
                System.out.println("-----------------------------------");
                System.out.println();
            } else if (ch == 'G') {
                booked++;
                totalAmount += Goldprice;
                System.out.println("Gold ticket booked");
                System.out.println("Capacity left : " + (max - booked));
                System.out.println("Total amount :  " + totalAmount);
                 System.out.println("-----------------------------------");
                System.out.println();
            } else if (ch == 'P') {
                booked++;
                totalAmount += Platinumprice;
                System.out.println("Platinum ticket booked");
                System.out.println("Capacity left : " + (max - booked));
                System.out.println("Total amount :  " + totalAmount);
                 System.out.println("-----------------------------------");
                System.out.println();
            } else if (ch == 'E') {
                System.out.println("Successfully exit");
                System.out.println("Total amount :  " + totalAmount);
                 System.out.println("-----------------------------------");
                System.out.println();
                break;
            } else {
                System.out.println("Please enter valid ticket name");
                 System.out.println("-----------------------------------");
                System.out.println();
            }
        }
    }
}
