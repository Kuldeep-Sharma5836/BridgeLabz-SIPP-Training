import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
public class StreamExamples {
    public static void main(String[] args){
        List<Movie> movies=Arrays.asList(
            new Movie("Movie A",4.6,2024),
            new Movie("Movie B",4.8,2023),
            new Movie("Movie C",4.3,2025),
            new Movie("Movie D",4.9,2025),
            new Movie("Movie E",4.1,2022),
            new Movie("Movie F",4.7,2025)
        );
        movies.stream().filter(m->m.rating>4.0)
                .sorted((m1,m2)->Double.compare(m2.rating,m1.rating))
                .limit(5)
                .forEach(System.out::println);
        
        List<Doctor> doctors=Arrays.asList(
            new Doctor("Dr. A","Cardiology",true),
            new Doctor("Dr. B","Neurology",false),
            new Doctor("Dr. C","Orthopedics",true)
        );
        doctors.stream().filter(d->d.availableOnWeekend)
                .sorted(Comparator.comparing(d->d.specialty))
                .forEach(System.out::println);
        
        List<InsuranceClaim> claims=Arrays.asList(
            new InsuranceClaim("Health",2000),
            new InsuranceClaim("Health",3000),
            new InsuranceClaim("Auto",1500),
            new InsuranceClaim("Auto",2500)
        );
        Map<String,Double> avgClaims=claims.stream()
                .collect(Collectors.groupingBy(InsuranceClaim::getType,Collectors.averagingDouble(InsuranceClaim::getAmount)));
        avgClaims.forEach((type,avg)->System.out.println(type+" avg claim: "+avg));
        
        List<GymMember> members=Arrays.asList(
            new GymMember("Alice",LocalDate.now().plusDays(10)),
            new GymMember("Bob",LocalDate.now().plusDays(40))
        );
        members.stream().filter(m->m.expiryDate.isBefore(LocalDate.now().plusDays(30)))
                .forEach(System.out::println);
        
        List<String> customers=Arrays.asList("john","alice","mark");
        customers.stream().map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }
}