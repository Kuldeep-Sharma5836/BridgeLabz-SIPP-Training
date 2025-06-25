class Product{
    static int discountRate = 10; 
    final int productId;
    String productName;
    double price;
    public Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }
    void displayDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: ₹" + price);
        System.out.println("Discount Rate: " + discountRate + "%");
    }
    static void updateDiscountRate(int newRate) {
        discountRate = newRate;
    }
    static void upDiscountRate() {
        System.out.println("Updated  Discount Rate: " + discountRate + "%");
    }
    static void displayDiscountRate() {
        System.out.println("Current Discount Rate: " + discountRate + "%");
    }
}
public class ShopingCart {
    public static void main(String[] args) {
        Product product1 = new Product(101, "Laptop", 75000.0);
        Product product2 = new Product(102, "Smartphone", 30000.0);

        System.out.println("Product Details:");
        System.out.println("-----------------");
        product1.displayDetails();
        System.out.println();
        product2.displayDetails();
        System.out.println();

        Product.displayDiscountRate();
        System.out.println();
         Product.displayDiscountRate(); 
        Product.updateDiscountRate(15);
        Product.upDiscountRate();
        System.out.println();

       
    }
}
