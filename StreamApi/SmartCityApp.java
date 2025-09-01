import java.time.*;
import java.util.*;
import java.util.stream.*;

public class SmartCityApp {
    public static void main(String[] args){
        TransportService bus=new BusService();
        TransportService metro=new MetroService();
        TransportService taxi=new TaxiService();
        TransportService ambulance=new AmbulanceService();
        List<TransportService> services=Arrays.asList(bus,metro,taxi,ambulance);
        FareCalculator lowestFare=trip->trip.distance()*0.8*(trip.peak?1.2:1.0);
        Location a=new Location(28.6139,77.2090);
        Location b=new Location(28.4595,77.0266);
        Trip trip=new Trip("","",a,b,LocalDateTime.now(),LocalTime.now().isAfter(LocalTime.of(8,0))&&LocalTime.now().isBefore(LocalTime.of(11,0)));
        List<ScheduleEntry> options=services.stream().flatMap(s->s.getSchedule().stream()).filter(ScheduleEntry::isActive).sorted(Comparator.comparing(ScheduleEntry::getDeparture)).collect(Collectors.toList());
        Dashboard.printAll(services);
        Dashboard.showActive(services);
        double chosenFare=lowestFare.calculateFare(trip);
        ((TaxiService)taxi).getPassengers().add(new Passenger("P1","T1","Taxi",chosenFare,trip.peak));
        ((BusService)bus).getPassengers().add(new Passenger("P2","B1","Bus",18.0,false));
        ((MetroService)metro).getPassengers().add(new Passenger("P3","M1","Metro",30.0,true));
        Map<String,DoubleSummaryStatistics> rev=Reports.revenueByService(services);
        Map<String,List<Passenger>> byRoute=Reports.passengersByRoute(services);
        Map<Boolean,List<Passenger>> peak=Reports.peakPartition(services);
        List<Map.Entry<String,Long>> topRoutes=Reports.topRoutesByUsage(services,5);
        rev.forEach((k,v)->System.out.println(k+" revenue sum="+v.getSum()+" avg="+v.getAverage()));
        System.out.println("grouped routes="+byRoute.keySet());
        System.out.println("peak="+peak.get(true).size()+" nonPeak="+peak.get(false).size());
        System.out.println("topRoutes="+topRoutes);
        if(ambulance instanceof EmergencyService){System.out.println("Emergency priority set for "+ambulance.getName());}
        TransportService ferry=new FerryService();
        ferry.printServiceDetails();
    }
}

class Location {
    public final double lat;
    public final double lon;
    public Location(double lat,double lon){this.lat=lat;this.lon=lon;}
}

interface GeoUtils {
    static double calculateDistance(Location a, Location b){
        double R=6371.0;
        double dLat=Math.toRadians(b.lat-a.lat);
        double dLon=Math.toRadians(b.lon-a.lon);
        double s1=Math.sin(dLat/2)*Math.sin(dLat/2);
        double s2=Math.cos(Math.toRadians(a.lat))*Math.cos(Math.toRadians(b.lat))*Math.sin(dLon/2)*Math.sin(dLon/2);
        double c=2*Math.atan2(Math.sqrt(s1+s2),Math.sqrt(1-(s1+s2)));
        return R*c;
    }
}

@FunctionalInterface
interface FareCalculator {
    double calculateFare(Trip trip);
}

interface EmergencyService { }

interface TransportService {
    String getName();
    List<ScheduleEntry> getSchedule();
    List<Passenger> getPassengers();
    default void printServiceDetails(){
        System.out.println(getName()+": schedules="+getSchedule().size()+", passengers="+getPassengers().size());
    }
    default List<ScheduleEntry> active(){
        return getSchedule().stream().filter(ScheduleEntry::isActive).collect(Collectors.toList());
    }
}

class ScheduleEntry {
    private final String serviceName;
    private final String routeId;
    private final LocalTime departure;
    private final double baseFare;
    private final boolean active;
    public ScheduleEntry(String serviceName,String routeId,LocalTime departure,double baseFare,boolean active){
        this.serviceName=serviceName;
        this.routeId=routeId;
        this.departure=departure;
        this.baseFare=baseFare;
        this.active=active;
    }
    public String getServiceName(){return serviceName;}
    public String getRouteId(){return routeId;}
    public LocalTime getDeparture(){return departure;}
    public double getBaseFare(){return baseFare;}
    public boolean isActive(){return active;}
}

class Trip {
    public final String serviceName;
    public final String routeId;
    public final Location from;
    public final Location to;
    public final LocalDateTime when;
    public final boolean peak;
    public Trip(String serviceName,String routeId,Location from,Location to,LocalDateTime when,boolean peak){
        this.serviceName=serviceName;
        this.routeId=routeId;
        this.from=from;
        this.to=to;
        this.when=when;
        this.peak=peak;
    }
    public double distance(){return GeoUtils.calculateDistance(from,to);}
}

class Passenger {
    public final String id;
    public final String routeId;
    public final String serviceName;
    public final double farePaid;
    public final boolean peak;
    public Passenger(String id,String routeId,String serviceName,double farePaid,boolean peak){
        this.id=id;
        this.routeId=routeId;
        this.serviceName=serviceName;
        this.farePaid=farePaid;
        this.peak=peak;
    }
}

class BusService implements TransportService {
    private final String name="Bus";
    private final List<ScheduleEntry> schedule=new ArrayList<>();
    private final List<Passenger> passengers=new ArrayList<>();
    public BusService(){
        schedule.add(new ScheduleEntry(name,"B1",LocalTime.of(8,15),20.0,true));
        schedule.add(new ScheduleEntry(name,"B2",LocalTime.of(9,0),18.0,true));
        schedule.add(new ScheduleEntry(name,"B3",LocalTime.of(22,0),22.0,false));
    }
    public String getName(){return name;}
    public List<ScheduleEntry> getSchedule(){return schedule;}
    public List<Passenger> getPassengers(){return passengers;}
}

class MetroService implements TransportService {
    private final String name="Metro";
    private final List<ScheduleEntry> schedule=new ArrayList<>();
    private final List<Passenger> passengers=new ArrayList<>();
    public MetroService(){
        schedule.add(new ScheduleEntry(name,"M1",LocalTime.of(8,0),30.0,true));
        schedule.add(new ScheduleEntry(name,"M2",LocalTime.of(8,30),28.0,true));
        schedule.add(new ScheduleEntry(name,"M3",LocalTime.of(23,15),35.0,false));
    }
    public String getName(){return name;}
    public List<ScheduleEntry> getSchedule(){return schedule;}
    public List<Passenger> getPassengers(){return passengers;}
}

class TaxiService implements TransportService {
    private final String name="Taxi";
    private final List<ScheduleEntry> schedule=new ArrayList<>();
    private final List<Passenger> passengers=new ArrayList<>();
    public TaxiService(){
        schedule.add(new ScheduleEntry(name,"T1",LocalTime.of(8,5),50.0,true));
        schedule.add(new ScheduleEntry(name,"T2",LocalTime.of(8,45),45.0,true));
        schedule.add(new ScheduleEntry(name,"T3",LocalTime.of(21,30),55.0,true));
    }
    public String getName(){return name;}
    public List<ScheduleEntry> getSchedule(){return schedule;}
    public List<Passenger> getPassengers(){return passengers;}
}

class AmbulanceService implements TransportService,EmergencyService {
    private final String name="Ambulance";
    private final List<ScheduleEntry> schedule=new ArrayList<>();
    private final List<Passenger> passengers=new ArrayList<>();
    public AmbulanceService(){
        schedule.add(new ScheduleEntry(name,"A1",LocalTime.now(),0.0,true));
    }
    public String getName(){return name;}
    public List<ScheduleEntry> getSchedule(){return schedule;}
    public List<Passenger> getPassengers(){return passengers;}
}

class FerryService implements TransportService {
    private final String name="Ferry";
    private final List<ScheduleEntry> schedule=new ArrayList<>();
    private final List<Passenger> passengers=new ArrayList<>();
    public FerryService(){
        schedule.add(new ScheduleEntry(name,"F1",LocalTime.of(7,45),25.0,true));
        schedule.add(new ScheduleEntry(name,"F2",LocalTime.of(18,15),25.0,true));
    }
    public String getName(){return name;}
    public List<ScheduleEntry> getSchedule(){return schedule;}
    public List<Passenger> getPassengers(){return passengers;}
}

class Dashboard {
    public static void showActive(List<TransportService> services){
        services.forEach(s->s.active().forEach(e->System.out.println(e.getServiceName()+" "+e.getRouteId()+" "+e.getDeparture()+" "+e.getBaseFare())));
    }
    public static void printAll(List<TransportService> services){
        services.forEach(TransportService::printServiceDetails);
    }
}

class Reports {
    public static Map<String,DoubleSummaryStatistics> revenueByService(List<TransportService> services){
        return services.stream().collect(Collectors.toMap(TransportService::getName,s->s.getPassengers().stream().collect(Collectors.summarizingDouble(p->p.farePaid))));
    }
    public static Map<String,List<Passenger>> passengersByRoute(List<TransportService> services){
        return services.stream().flatMap(s->s.getPassengers().stream()).collect(Collectors.groupingBy(p->p.routeId));
    }
    public static Map<Boolean,List<Passenger>> peakPartition(List<TransportService> services){
        return services.stream().flatMap(s->s.getPassengers().stream()).collect(Collectors.partitioningBy(p->p.peak));
    }
    public static List<Map.Entry<String,Long>> topRoutesByUsage(List<TransportService> services,int limit){
        return services.stream().flatMap(s->s.getPassengers().stream()).collect(Collectors.groupingBy(p->p.routeId,Collectors.counting())).entrySet().stream().sorted((a,b)->Long.compare(b.getValue(),a.getValue())).limit(limit).collect(Collectors.toList());
    }
}
