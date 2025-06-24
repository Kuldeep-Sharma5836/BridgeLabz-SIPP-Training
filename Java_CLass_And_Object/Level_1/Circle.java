import java.util.*;
public class Circle {
    double radius;
    void setRadius(double radius) {
        this.radius = radius;
    }
    double calculateArea() {
        return Math.PI * radius * radius;
    }
    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        Circle circle = new Circle();
        circle.setRadius(radius);
        System.out.println("Area of the circle: " + circle.calculateArea());
        System.out.println("Circumference of the circle: " + circle.calculateCircumference());
    }
}
