import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int addition = num1 + num2;
        int subtraction = num1 - num2;
        int multiplication = num1 * num2;
        double division = (double) num1 / num2; 
        System.out.print("Addition: " + addition);
        System.out.print(" Subtraction: " + subtraction);  
        System.out.print(" Multiplication: " + multiplication);
        System.out.print(" Division: " + division);
    }
}
