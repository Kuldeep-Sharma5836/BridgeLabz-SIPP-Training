import java.util.*;

public class Library {
    String bookName;
    String authorName;
    boolean isAvailable;
    int price;

    public Library(String bookName, String authorName, boolean isAvailable, int price) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.isAvailable = isAvailable;
        this.price = price;
    }

    public Library() {
        bookName = "Java Programming";
        authorName = "James Gosling";
        isAvailable = true;
        price = 100;
    }

    public boolean borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Yes, the book is available: " + bookName);
            return true;
        } else {
            System.out.println("Sorry, the book is currently not available.");
            return false;
        }
    }

    public void Details() {
        System.out.println("Book Name    : " + bookName);
        System.out.println("Author Name  : " + authorName);
        System.out.println("Is Available : " + isAvailable);
        System.out.println("Price        : " + price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the book name:");
        String bookName = sc.nextLine();

        System.out.println("Enter the author name:");
        String authorName = sc.nextLine();

        System.out.println("Is the book available:");
        boolean isAvailable = sc.nextBoolean();

        System.out.println("Enter the price of the book:");
        int price = sc.nextInt();

        Library library = new Library(bookName, authorName, isAvailable, price);
        
        System.out.println("Library Details:");
        library.Details();

        System.out.println("Borrowing the book...");
        library.borrowBook();
    }
}
