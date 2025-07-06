import java.util.Scanner;
class item{
    int id;
    String name;
    int quantity;
    double price;
    item next;
    public item(int id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}

public class InventorySystem {
    private item head;
    public InventorySystem() {
        this.head = null;
    }
    public void addItem(int id, String name, int quantity, double price) {
        item newItem = new item(id, name, quantity, price);
        if (head == null) {
            head = newItem;
        } else {
            item current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newItem;
        }
    }
    public void displayItems() {
        item current = head;
        while (current != null) {
            System.out.println("ID: " + current.id + ", Name: " + current.name + ", Quantity: " + current.quantity + ", Price: " + current.price);
            current = current.next;
        }
    }
    public void deleteItem(int id) {
        if (head == null) return;
        if (head.id == id) {
            head = head.next;
            return;
        }
        item current = head;
        while (current.next != null && current.next.id != id) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
        }
    }
    public item searchItem(int id) {
        item current = head;
        while (current != null) {
            if (current.id == id) {
                return current;
            }
            current = current.next;
        }
        return null; 
    }    
    public void update(int id,int quantity) {
        item current = head;
        while (current != null) {
            if (current.id == id) {
                current.quantity = quantity;
                return;
            }
            current = current.next;
        }
        System.out.println("Item with ID " + id + " not found.");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InventorySystem inventory = new InventorySystem();
        while (true) {
            System.out.println("1. Add Item");
            System.out.println("2. Display Items");
            System.out.println("3. Delete Item");
            System.out.println("4. Search Item");
            System.out.println("5. Update Item Quantity");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter ID, Name, Quantity, Price: ");
                    int id = sc.nextInt();
                    String name = sc.next();
                    int quantity = sc.nextInt();
                    double price = sc.nextDouble();
                    inventory.addItem(id, name, quantity, price);
                    break;
                case 2:
                    inventory.displayItems();
                    break;
                case 3:
                    System.out.print("Enter ID to delete: ");
                    int delId = sc.nextInt();
                    inventory.deleteItem(delId);
                    break;
                case 4:
                    System.out.print("Enter ID to search: ");
                    int searchId = sc.nextInt();
                    item foundItem = inventory.searchItem(searchId);
                    if (foundItem != null) {
                        System.out.println("Found Item - ID: " + foundItem.id + ", Name: " + foundItem.name + ", Quantity: " + foundItem.quantity + ", Price: " + foundItem.price);
                    } else {
                        System.out.println("Item not found.");
                    }
                    break;
                case 5:
                    System.out.print("Enter ID and new Quantity: ");
                    int updateId = sc.nextInt();
                    int newQuantity = sc.nextInt();
                    inventory.update(updateId, newQuantity);
                    break;
                case 6:
                    System.out.println("Exiting.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
