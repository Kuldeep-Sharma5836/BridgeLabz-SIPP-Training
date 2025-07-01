class Book {
    String title;
    int publicationYear;
    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }
    public void displayInfo() {
        System.out.println("Book Title: " + title + ", Publication Year: " + publicationYear);
    }
}
class Author extends Book {
    String name;
    String biography;
    public Author(String title, int publicationYear, String name, String biography) {
        super(title, publicationYear);
        this.name = name;
        this.biography = biography;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author Name: " + name + ", Biography: " + biography);
    }
}
public class LibraryManagement {
   public static void main(String[] args) {
      Book book = new Book("Effective Java", 2018);
      Author author = new Author("Effective Java", 2018, "Joshua Bloch", "Renowned Java expert and author.");
        author.displayInfo();
   }
}