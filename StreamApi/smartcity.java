import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

interface TransportService {
    String getServiceName();
    double getFare();
    Date getDepartureTime();
    String getRoute();
    default void printServiceDetails() {
        System.out.println(getServiceName() + " | " + getRoute() + " | " + getFare());
    }
}

interface EmergencyService {}

interface FareCalculator {
    double calculateFare(double baseFare, double distance);
}

interface GeoUtils {
    static double calculateDistance(String from, String to) {
        return Math.random() * 10 + 1;
    }
}

class BusService implements TransportService {
    private String serviceName, route;
    private double fare;
    private Date departureTime;
    public BusService(String serviceName, String route, double fare, Date departureTime) {
        this.serviceName = serviceName;
        this.route = route;
        this.fare = fare;
        this.departureTime = departureTime;
    }
    public String getServiceName() { return serviceName; }
    public double getFare() { return fare; }
    public Date getDepartureTime() { return departureTime; }
    public String getRoute() { return route; }
}

class MetroService implements TransportService {
    private String serviceName, route;
    private double fare;
    private Date departureTime;
    public MetroService(String serviceName, String route, double fare, Date departureTime) {
        this.serviceName = serviceName;
        this.route = route;
        this.fare = fare;
        this.departureTime = departureTime;
    }
    public String getServiceName() { return serviceName; }
    public double getFare() { return fare; }
    public Date getDepartureTime() { return departureTime; }
    public String getRoute() { return route; }
}

class TaxiService implements TransportService {
    private String serviceName, route;
    private double fare;
    private Date departureTime;
    public TaxiService(String serviceName, String route, double fare, Date departureTime) {
        this.serviceName = serviceName;
        this.route = route;
        this.fare = fare;
        this.departureTime = departureTime;
    }
    public String getServiceName() { return serviceName; }
    public double getFare() { return fare; }
    public Date getDepartureTime() { return departureTime; }
    public String getRoute() { return route; }
}

class AmbulanceService implements TransportService, EmergencyService {
    private String serviceName, route;
    private double fare;
    private Date departureTime;
    public AmbulanceService(String serviceName, String route, double fare, Date departureTime) {
        this.serviceName = serviceName;
        this.route = route;
        this.fare = fare;
        this.departureTime = departureTime;
    }
    public String getServiceName() { return serviceName; }
    public double getFare() { return fare; }
    public Date getDepartureTime() { return departureTime; }
    public String getRoute() { return route; }
}

class Passenger {
    String name;
    String route;
    double fare;
    boolean peakTime;
    public Passenger(String name, String route, double fare, boolean peakTime) {
        this.name = name;
        this.route = route;
        this.fare = fare;
        this.peakTime = peakTime;
    }
    public String getRoute() { return route; }
    public double getFare() { return fare; }
    public boolean isPeakTime() { return peakTime; }
}

public class smartcity {
    public static void main(String[] args) {
        List<TransportService> services = Arrays.asList(
            new BusService("Bus101", "A-B", 15.0, new Date()),
            new MetroService("MetroX", "A-C", 20.0, new Date()),
            new TaxiService("TaxiZ", "B-C", 50.0, new Date()),
            new AmbulanceService("Ambulance1", "A-D", 0.0, new Date())
        );
        List<TransportService> filtered = services.stream()
            .filter(s -> s.getFare() < 30)
            .sorted(Comparator.comparing(TransportService::getDepartureTime))
            .collect(Collectors.toList());
        filtered.forEach(TransportService::printServiceDetails);
        double dist = GeoUtils.calculateDistance("A", "B");
        List<Passenger> passengers = Arrays.asList(
            new Passenger("Alice", "A-B", 15.0, true),
            new Passenger("Bob", "A-C", 20.0, false),
            new Passenger("Charlie", "B-C", 50.0, true)
        );
        services.forEach(s -> System.out.println("Live: " + s.getServiceName()));
        Map<String, List<Passenger>> byRoute = passengers.stream()
            .collect(groupingBy(Passenger::getRoute));
        Map<Boolean, List<Passenger>> byPeak = passengers.stream()
            .collect(partitioningBy(Passenger::isPeakTime));
        DoubleSummaryStatistics fareStats = passengers.stream()
            .collect(summarizingDouble(Passenger::getFare));
        FareCalculator calc = (baseFare, distance) -> baseFare + distance * 2;
        double fare = calc.calculateFare(10, dist);
        services.stream()
            .filter(s -> s instanceof EmergencyService)
            .forEach(s -> System.out.println(s.getServiceName() + " is emergency service"));
        System.out.println("Grouped by route: " + byRoute.keySet());
        System.out.println("Peak time passengers: " + byPeak.get(true).size());
        System.out.println("Total fare: " + fareStats.getSum() + ", Avg fare: " + fareStats.getAverage());
        System.out.println("Calculated fare: " + fare);
    }
}