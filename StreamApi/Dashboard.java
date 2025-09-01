import java.util.List;
public class Dashboard {
    public static void displayServices(List<TransportService> services){
        services.forEach(TransportService::printServiceDetails);
    }
}