import java.util.List;
public class MetroService implements TransportService {
    private String name;
    private double fare;
    private List<ScheduleEntry> schedule;
    public MetroService(String name,double fare,List<ScheduleEntry> schedule){this.name=name;this.fare=fare;this.schedule=schedule;}
    public String getName(){return name;}
    public double getFare(){return fare;}
    public void showSchedule(){schedule.forEach(System.out::println);}
}