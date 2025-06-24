import java.util.Scanner;
public class Circle {
    int radius;
    public Circle(int radius) {
        this.radius = radius;
    }
    public Circle() {
        radius = 5; 
    }
    public void CircleDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + (Math.PI * radius * radius));
        System.out.println("Circumference: " + (2 * Math.PI * radius));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        int radius = sc.nextInt();
        Circle circle = new Circle(radius);
        System.out.println("Circle Details:");
        circle.CircleDetails();
        Circle Circle2 = new Circle();
        System.out.println("Default Circle Details:");
        Circle2.CircleDetails();
    }
}
