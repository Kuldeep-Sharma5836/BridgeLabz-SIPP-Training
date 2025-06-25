class Book {
    static String libraryName;
    
    final int isbn;
        String title;
    String author;
        public Book(int isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }
        void displayDetails() {
        System.out.println("ISBN: " + isbn);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
        static void setLibraryName(String name) {
        libraryName = name;
    }
        static String DisplayLibraryName() {
        return libraryName;
    }    
}
public class LibraryManagement {
    public static void main(String[] args) {
        Book.setLibraryName("City Central Library");

        Book book1 = new Book(123456, "Java Programming", "Ram");
        Book book2 = new Book(789012, "Data Structures", "Shyam");

        System.out.println("Library Name: " + Book.DisplayLibraryName());
        System.out.println();

        if (book1 instanceof Book) {
            book1.displayDetails();
        }
        System.out.println();

        if (book2 instanceof Book) {
            book2.displayDetails();
        }
    }
}
