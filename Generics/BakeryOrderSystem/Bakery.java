import java.util.*;

class Order {
    private String itemName;
    private int quantity;
    private String category;

    public Order(String itemName, int quantity, String category) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.category = category;
    }

    public String getItemName() {
        return itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return category + ": " + itemName + " x" + quantity;
    }
}

class BakeryOrderSystem<T extends Order> {
    private Queue<T> orderQueue;
    private List<T> allOrders;

    public BakeryOrderSystem() {
        orderQueue = new LinkedList<>();
        allOrders = new ArrayList<>();
    }

    public void addOrder(T order) {
        orderQueue.offer(order);
        allOrders.add(order);
    }

    public T deliverOrder() {
        return orderQueue.poll();
    }

    public List<T> filterByCategory(String category) {
        List<T> result = new ArrayList<>();
        for (T order : allOrders) {
            if (order.getCategory().equalsIgnoreCase(category)) {
                result.add(order);
            }
        }
        return result;
    }

    public void showAllOrders() {
        for (T order : allOrders) {
            System.out.println(order);
        }
    }
}

public class Bakery {
    public static void main(String[] args) {
        BakeryOrderSystem<Order> system = new BakeryOrderSystem<>();

        system.addOrder(new Order("Chocolate Cake", 1, "Cake"));
        system.addOrder(new Order("Butter Cookie", 5, "Cookie"));
        system.addOrder(new Order("Vanilla Pastry", 2, "Pastry"));
        system.addOrder(new Order("Almond Cookie", 3, "Cookie"));

        System.out.println("=== All Orders ===");
        system.showAllOrders();

        System.out.println("\n=== Deliver Order ===");
        System.out.println(system.deliverOrder());

        System.out.println("\n=== Remaining Orders ===");
        system.showAllOrders();

        System.out.println("\n=== Filter by Category: Cookie ===");
        List<Order> cookies = system.filterByCategory("Cookie");
        for (Order o : cookies) {
            System.out.println(o);
        }
    }
}
