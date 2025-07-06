import java.util.*;

class Movie{
    String title;
    String director;
    int year;
    double rating;
    Movie next;
    Movie prev;
    Movie(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.next = null;
        this.prev = null;
    }
}
public class MovieManagement {
    private Movie head;
    private Movie tail;

    public MovieManagement() {
        this.head = null;
        this.tail = null;
    }
    public void addMovie(String title, String director, int year, double rating) {
        Movie newMovie = new Movie(title, director, year, rating);
        if (head == null) {
            head = newMovie;
            tail = newMovie;
        } else {
            tail.next = newMovie;
            newMovie.prev = tail;
            tail = newMovie;
        }
    }
    public void removeMovie(String title) {
        Movie current = head;
        while (current != null) {
            if (current.title.equals(title)) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    tail = current.prev;
                }
                return;
            }
            current = current.next;
        }
    }
    public void displayMovies() {
        Movie current = head;
        while (current != null) {
            System.out.println("Title: " + current.title + ", Director: " + current.director + 
                               ", Year: " + current.year + ", Rating: " + current.rating);
            current = current.next;
        }
    }
    public void searchMovie(String title) {
        Movie current = head;
        while (current != null) {
            if (current.title.equals(title)) {
                System.out.println("Found: Title: " + current.title + ", Director: " + current.director + 
                                   ", Year: " + current.year + ", Rating: " + current.rating);
                return;
            }
            current = current.next;
        }
        System.out.println("Movie not found.");
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        MovieManagement mm = new MovieManagement();
        while (true) {
            System.out.println("1. Add Movie\n2. Remove Movie\n3. Display Movies\n4. Search Movie\n5. Exit");
            int choice = sc.nextInt();
            sc.nextLine(); 
            switch (choice) {
                case 1:
                    System.out.print("Enter title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter director: ");
                    String director = sc.nextLine();
                    System.out.print("Enter year: ");
                    int year = sc.nextInt();
                    System.out.print("Enter rating: ");
                    double rating = sc.nextDouble();
                    mm.addMovie(title, director, year, rating);
                    break;
                case 2:
                    System.out.print("Enter title to remove: ");
                    String removeTitle = sc.nextLine();
                    mm.removeMovie(removeTitle);
                    break;
                case 3:
                    mm.displayMovies();
                    break;
                case 4:
                    System.out.print("Enter title to search: ");
                    String searchTitle = sc.nextLine();
                    mm.searchMovie(searchTitle);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
