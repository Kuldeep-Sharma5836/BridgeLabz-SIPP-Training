import java.util.List;

public class OrderManagerMain {
    public static void main(String[] args) {

        OrderManger<Cake> cakeOrderManger = new OrderManger<>();
        cakeOrderManger.addOrder(new Cake("Black Forest",1));
        cakeOrderManger.addOrder(new Cake("Coffee",2));
        cakeOrderManger.addOrder(new Cake("Red Velvet",1));


        OrderManger<Cookie> cookieOrderManger = new OrderManger<>();
        cookieOrderManger.addOrder(new Cookie("Dry Fruit",5));
        cookieOrderManger.addOrder(new Cookie("Choco chip",12));

        OrderManger<Pastry> pastryOrderManger = new OrderManger<>();
        pastryOrderManger.addOrder(new Pastry("Red Velvet",4));
        pastryOrderManger.addOrder(new Pastry("Cassata",5));
        pastryOrderManger.addOrder(new Pastry("Indian Choco Crunch",1));

        cookieOrderManger.deliverOrder();
        pastryOrderManger.deliverOrder();

        pastryOrderManger.undeliveredOrders();

        System.out.println("\nAll Orders for Cake :");
        cakeOrderManger.displayAllOrders();

        System.out.println("\nAll Orders for Pastry :");
        pastryOrderManger.displayAllOrders();

        cakeOrderManger.deliverAllOrders();

        System.out.println("\nAll Orders for Cake :");
        cakeOrderManger.displayAllOrders();

        List<OrderManger<? extends Order>> allManagers = List.of(cakeOrderManger, cookieOrderManger, pastryOrderManger);

        System.out.println("\nAll Red Velvet items :");
        for (OrderManger<? extends Order> o : allManagers) {
            List<? extends Order> list = o.filterByItem("Red Velvet");

            for (Order order : list) {
                System.out.println(order);
            }
        }
    }
}
