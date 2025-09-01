public class ScheduleEntry {
    private String time;
    private String route;
    public ScheduleEntry(String time,String route){this.time=time;this.route=route;}
    public String toString(){return time+" - "+route;}
}