import java.util.Scanner;
public class HotelBooking {
    String guestname;
    String roomtype;
    int nights;

    public HotelBooking(String guestname, String roomtype, int nights) {
        this.guestname = guestname;
        this.roomtype = roomtype;
        this.nights = nights;
    }
    public HotelBooking() {
        guestname = "Rohan";
        roomtype = "Deluxe";
        nights = 2;
    }
    public void BookingDetails() {
        System.out.println("Guest Name: " + guestname);
        System.out.println("Room Type: " + roomtype);
        System.out.println("Nights: " + nights);
    }
    HotelBooking(HotelBooking second) {
        this.guestname = second.guestname;
        this.roomtype = second.roomtype;
        this.nights = second.nights;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the guest name:");
        String guestname = sc.nextLine();
        System.out.println("Enter the room type:");
        String roomtype = sc.nextLine();
        System.out.println("Enter the number of nights:");
        int nights = sc.nextInt();
        
        HotelBooking booking = new HotelBooking(guestname, roomtype, nights);
        System.out.println("Booking Details:");
        booking.BookingDetails();
        
        HotelBooking defaultBooking = new HotelBooking();
        System.out.println("Default Booking Details:");
        defaultBooking.BookingDetails();
        
        HotelBooking copiedBooking = new HotelBooking(booking);
        System.out.println("Copied Booking Details:");
        copiedBooking.BookingDetails();
    }

}
