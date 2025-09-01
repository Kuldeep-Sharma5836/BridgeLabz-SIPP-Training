import java.util.List;
public class AmbulanceService implements TransportService, EmergencyService {
    private String name;
    private double fare;
    private List<ScheduleEntry> schedule;
    public AmbulanceService(String name,double fare,List<ScheduleEntry> schedule){this.name=name;this.fare=fare;this.schedule=schedule;}
    public String getName(){return name;}
    public double getFare(){return fare;}
    public void showSchedule(){schedule.forEach(System.out::println);}
}