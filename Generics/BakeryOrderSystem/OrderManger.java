import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

public class OrderManger <T extends Order> {
    List<T> allOrders = new ArrayList<>();
    Queue<T> orderQueue = new LinkedList<>();

    public void addOrder (T order) {
        System.out.println("\n" + order.getItemName() + " " + order.getCategory() + " processing.");
        allOrders.add(order);
        orderQueue.add(order);
    }

    public void displayAllOrders() {
        allOrders.forEach(System.out::println);
    }

    public void deliverAllOrders() {
        if (!orderQueue.isEmpty()) {
            T k = orderQueue.peek();
            System.out.println("\n---------------- " + k.getCategory() + " ----------------");
        }
        while (!orderQueue.isEmpty()) {
            T stuff = orderQueue.poll();
            stuff.setDelivered(true);
            System.out.println(stuff + "\u001b[32m\n     Delivered successfully.\u001b[0m");
        }
        System.out.println("-----------------------------------------\n");
    }

    public void deliverOrder() {
        if (!orderQueue.isEmpty()) {
            T k = orderQueue.peek();
            System.out.println("\n---------------- " + k.getCategory() + " ----------------");
        }
        T stuff = orderQueue.poll();
        if (stuff != null) {
            stuff.setDelivered(true);
            System.out.println(stuff + "\u001b[32m\n     Delivered successfully.\u001b[0m");
        }else {
            System.out.println("\nNothing to deliver !");
        }
        System.out.println("-----------------------------------------\n");
    }

    public void undeliveredOrders() {
        if(!orderQueue.isEmpty()) {
            T stuff = orderQueue.peek();
            System.out.println("\nRemaining Orders for " + stuff.getCategory());
            orderQueue.forEach(System.out::println);
        }
    }

    public List<T> filterByItem(String itemName) {
        return  allOrders.stream()
                .filter(order -> order.getItemName().equalsIgnoreCase(itemName))
                .collect(Collectors.toList());
    }
}
