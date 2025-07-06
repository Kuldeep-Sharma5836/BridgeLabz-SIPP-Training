abstract class Product {
     String name;
     double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract double calculateDiscount();

    public double getFinalPrice() {
        return price - calculateDiscount();
    }

    public void displayDetails() {
        System.out.println("Product: " + name);
        System.out.println("Original Price: " + price);
        System.out.println("Discount: " + calculateDiscount());
        System.out.println("Final Price: " + getFinalPrice());
    }
}

class Electronics extends Product {
    public Electronics(String name, double price) {
        super(name, price);
    }

    public double calculateDiscount() {
        return price * 0.10;
    }
}

class Clothing extends Product {
    public Clothing(String name, double price) {
        super(name, price);
    }

    public double calculateDiscount() {
        return price * 0.20;
    }
}

class Grocery extends Product {
    public Grocery(String name, double price) {
        super(name, price);
    }

    public double calculateDiscount() {
        return 0.0;
    }
}

public class OnlineStore {
    public static void main(String[] args) {
        Product p1 = new Electronics("Laptop", 60000);
        Product p2 = new Clothing("Shirt", 1500);
        Product p3 = new Grocery("Rice", 800);

        p1.displayDetails();
        System.out.println();
        p2.displayDetails();
        System.out.println();
        p3.displayDetails();
    }
}
