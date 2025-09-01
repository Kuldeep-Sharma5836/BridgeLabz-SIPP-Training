import java.util.*;
public class App {
    public static void main(String[] args){
        List<ScheduleEntry> busSchedule=Arrays.asList(new ScheduleEntry("08:00","A-B"),new ScheduleEntry("09:00","A-C"));
        List<ScheduleEntry> metroSchedule=Arrays.asList(new ScheduleEntry("08:30","X-Y"),new ScheduleEntry("09:30","X-Z"));
        List<TransportService> services=Arrays.asList(
            new BusService("City Bus",20,busSchedule),
            new MetroService("Metro",30,metroSchedule),
            new TaxiService("City Taxi",100,Arrays.asList(new ScheduleEntry("On-Demand","Flexible")))
        );
        services.stream().sorted(Comparator.comparingDouble(TransportService::getFare)).forEach(TransportService::printServiceDetails);
        Dashboard.displayServices(services);
        List<Trip> trips=Arrays.asList(
            new Trip("Alice","A-B",20,true),
            new Trip("Bob","X-Y",30,false),
            new Trip("Charlie","A-C",20,true)
        );
        Reports.generateRevenueReport(trips);
        FareCalculator calc=(base,dist)->base*dist;
        System.out.println("Fare for 5km:"+calc.calculateFare(10,5));
        Location l1=new Location(0,0);
        Location l2=new Location(3,4);
        System.out.println("Distance:"+GeoUtils.calculateDistance(l1,l2));
    }
}