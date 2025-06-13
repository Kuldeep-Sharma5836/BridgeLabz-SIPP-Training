import java.util.*;
public class CalculateTotalPrice {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int unitPrice = sc.nextInt();
        int quantity = sc.nextInt();
        int totalPrice = unitPrice * quantity;
        System.out.println("Total price is " + totalPrice);
    }
}
