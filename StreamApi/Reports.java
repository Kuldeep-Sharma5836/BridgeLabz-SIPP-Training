import java.util.*;
import java.util.stream.Collectors;
public class Reports {
    public static void generateRevenueReport(List<Trip> trips){
        double total=trips.stream().collect(Collectors.summarizingDouble(t->t.fare)).getSum();
        System.out.println("Total Revenue: "+total);
        Map<String,Long> routeCount=trips.stream().collect(Collectors.groupingBy(t->t.route,Collectors.counting()));
        routeCount.forEach((k,v)->System.out.println("Route: "+k+" Trips: "+v));
    }
}