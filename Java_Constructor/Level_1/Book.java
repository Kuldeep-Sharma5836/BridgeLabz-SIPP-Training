import java.util.*;
public class Book {
    String title;
    String author;
    int prices;

    public Book(String title, String author, int prices) {
        this.title = title;
        this.author = author;
        this.prices = prices;
    }

    public Book(){
        title="Java Programming";
        author="James Gosling";
        prices=500;
    }
    public void BookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + prices);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the title of the book:");
        String title = sc.nextLine();
        System.out.println("Enter the author of the book:");
        String author = sc.nextLine();
        System.out.println("Enter the price of the book:");
        int prices = sc.nextInt();
        Book book = new Book(title, author, prices);
        System.out.println("Book Details:");
        book.BookDetails();
        Book Book2 = new Book();
        System.out.println("Default Book Details:");
        Book2.BookDetails();
    }
}
