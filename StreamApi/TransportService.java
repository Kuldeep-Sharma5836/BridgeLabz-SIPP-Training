public interface TransportService {
    String getName();
    double getFare();
    void showSchedule();
    default void printServiceDetails() {
        System.out.println(getName() + " | Fare: " + getFare());
    }
}