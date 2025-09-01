import java.time.LocalDateTime;
import java.util.*;
public class ForEachExamples {
    public static void main(String[] args){
        List<Double> stockPrices=Arrays.asList(101.5,102.7,103.8);
        stockPrices.forEach(System.out::println);
        
        List<String> attendees=Arrays.asList("Alice","Bob","Charlie");
        attendees.forEach(name->System.out.println("Welcome "+name));
        
        List<Integer> readings=Arrays.asList(45,80,60);
        readings.stream().filter(r->r>50)
                .forEach(r->System.out.println("High reading: "+r));
        
        List<String> emails=Arrays.asList("a@x.com","b@x.com");
        emails.forEach(email->System.out.println("Sending email to "+email));
        
        List<String> transactionIds=Arrays.asList("T1","T2");
        transactionIds.forEach(id->System.out.println(LocalDateTime.now()+" Transaction: "+id));
    }
}