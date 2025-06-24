import java.util.*;

public class CartItem {
    int price;
    String itemName;
    int quantity;

    void setDetails(int p, String name, int q) {
        price = p;
        itemName = name;
        quantity = q;
    }

    void addItem(int q) {
        quantity += q; // correctly update object quantity
    }

    void remove(int q) {
        if (quantity >= q) {
            quantity -= q;
        } else {
            System.out.println("Cannot remove more items than present.");
        }
    }

    void display() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: " + (price * quantity));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CartItem item = new CartItem();

        System.out.println("Enter item name: ");
        String name = sc.nextLine();

        System.out.println("Enter price: ");
        int p = sc.nextInt();

        System.out.println("Enter quantity: ");
        int q = sc.nextInt();

        item.setDetails(p, name, q);
        item.display();

        System.out.println("\nEnter quantity to add: ");
        int addQ = sc.nextInt();
        item.addItem(addQ);
        System.out.println("After adding items:");
        item.display();

        System.out.println("\nEnter quantity to remove: ");
        int removeQ = sc.nextInt();
        item.remove(removeQ);
        System.out.println("After removing items:");
        item.display();
    }
}
