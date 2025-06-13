import java.util.Scanner;
public class PerimeterSquare {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int sideLength = sc.nextInt();
        int perimeter = 4 * sideLength;
        System.out.println("Perimeter of the square is " + perimeter);
    }
}
