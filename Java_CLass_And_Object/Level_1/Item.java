import java.util.*;
public class Item {
    int itemcode;
    String itemname;
    int price;

    void setItem(int itemcode, String itemname, int price) {
        this.itemcode = itemcode;
        this.itemname = itemname;
        this.price = price;
    }
    void display() {
        System.out.println("Item Code: " + itemcode);
        System.out.println("Item Name: " + itemname);
        System.out.println("Price: " + price);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Item item = new Item();
        System.out.println("Enter Item Code:");
        int itemcode = sc.nextInt();
        sc.nextLine(); 
        System.out.println("Enter Item Name:"); 
        String itemname = sc.nextLine();
        System.out.println("Enter Item Price:");
        int price = sc.nextInt();
        item.setItem(itemcode, itemname, price);
        System.out.println("Item Details:-----------------------------------");
        item.display();
    }
}
