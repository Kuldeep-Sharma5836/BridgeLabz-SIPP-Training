import java.util.*;

abstract class WarehouseItem {
    private String name;

    public WarehouseItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String getDetails();
}

class Electronics extends WarehouseItem {
    private int warrantyInMonths;

    public Electronics(String name, int warrantyInMonths) {
        super(name);
        this.warrantyInMonths = warrantyInMonths;
    }

    @Override
    public String getDetails() {
        return "Electronics: " + getName() + ", Warranty: " + warrantyInMonths + " months";
    }
}

class Groceries extends WarehouseItem {
    private String expiryDate;

    public Groceries(String name, String expiryDate) {
        super(name);
        this.expiryDate = expiryDate;
    }

    @Override
    public String getDetails() {
        return "Groceries: " + getName() + ", Expiry: " + expiryDate;
    }
}

class Furniture extends WarehouseItem {
    private String material;

    public Furniture(String name, String material) {
        super(name);
        this.material = material;
    }

    @Override
    public String getDetails() {
        return "Furniture: " + getName() + ", Material: " + material;
    }
}

class Storage<T extends WarehouseItem> {
    private List<T> items;

    public Storage() {
        items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }
}

class DisplayUtil {
    public static void displayItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            System.out.println(item.getDetails());
        }
    }
}

public class SmartWarehouseApp   {
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop", 24));
        electronicsStorage.addItem(new Electronics("Smartphone", 12));

        Storage<Groceries> groceryStorage = new Storage<>();
        groceryStorage.addItem(new Groceries("Milk", "2025-08-01"));
        groceryStorage.addItem(new Groceries("Bread", "2025-07-22"));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair", "Wood"));
        furnitureStorage.addItem(new Furniture("Table", "Metal"));

        System.out.println("Electronics:");
        DisplayUtil.displayItems(electronicsStorage.getItems());

        System.out.println("\nGroceries:");
        DisplayUtil.displayItems(groceryStorage.getItems());

        System.out.println("\nFurniture:");
        DisplayUtil.displayItems(furnitureStorage.getItems());
    }
}
