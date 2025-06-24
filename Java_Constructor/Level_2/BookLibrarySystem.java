class Book {
    public String ISBN;     
    protected String title;  
    private String author;

    Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }
     public void displayBookInfo() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}
    class EBook extends Book {
        EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
        }
        public void displayEBookInfo() {
            System.out.println("E-Book Information:");
            System.out.println("ISBN (Accessing public): " + ISBN);
            System.out.println("Title (Accessing protected): " + title);
            System.out.println("Author (Using getter): " + getAuthor());
        }
        
    }
    
public class BookLibrarySystem {
    public static void main(String[] args) {
        EBook myEBook = new EBook("978-0134685991", "Effective Java", "Joshua Bloch");
         myEBook.displayBookInfo();
        System.out.println();
        myEBook.displayEBookInfo();
        myEBook.setAuthor("ABC");
        System.out.println("\nUpdated Author: " + myEBook.getAuthor());

    }
}

