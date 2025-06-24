import java.util.Scanner;
public class MovieTicket {
    int ticketnumber;
    String moviename;
    int price;
    
    void bookTicket(int ticketnumber, String moviename, int price) {
        this.ticketnumber = ticketnumber;
        this.moviename = moviename;
        this.price = price;
    }
    void display() {
        System.out.println("Ticket Number: " + ticketnumber);
        System.out.println("Movie Name: " + moviename);
        System.out.println("Price: $" + price);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        MovieTicket ticket = new MovieTicket();
        System.out.println("Enter Ticket Number:");
        int ticketnumber = sc.nextInt();
        sc.nextLine(); 
        System.out.println("Enter Movie Name:");
        String moviename = sc.nextLine();
        System.out.println("Enter Ticket Price:");
        int price = sc.nextInt();
        ticket.bookTicket(ticketnumber, moviename, price);
        System.out.println("Movie Ticket Details:-----------------------------------");
        ticket.display();
    }
}
