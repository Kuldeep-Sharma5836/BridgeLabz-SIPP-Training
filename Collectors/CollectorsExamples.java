import java.util.*;
import java.util.stream.*;
public class CollectorsExamples {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student("Alice","A"), new Student("Bob","B"), new Student("Charlie","A"));
        Map<String,List<String>> studentsByGrade = students.stream().collect(Collectors.groupingBy(Student::getGrade, Collectors.mapping(Student::getName, Collectors.toList())));
        System.out.println(studentsByGrade);

        String paragraph = "java stream collectors java code java example";
        Map<String, Long> wordCount = Arrays.stream(paragraph.split(" ")).collect(Collectors.toMap(w -> w, w -> 1L, Long::sum));
        System.out.println(wordCount);

        List<Order> orders = Arrays.asList(new Order("John",100.5), new Order("Jane",200.0), new Order("John",50.0));
        Map<String, Double> revenuePerCustomer = orders.stream().collect(Collectors.groupingBy(Order::getCustomer, Collectors.summingDouble(Order::getTotal)));
        System.out.println(revenuePerCustomer);

        List<Employee> employees = Arrays.asList(new Employee("E1","HR",50000), new Employee("E2","IT",70000), new Employee("E3","HR",60000));
        Map<String, Double> avgSalaryByDept = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(avgSalaryByDept);

        List<Book> books = Arrays.asList(new Book("B1","Fiction",300), new Book("B2","Fiction",200), new Book("B3","Science",150));
        IntSummaryStatistics stats = books.stream().collect(Collectors.summarizingInt(Book::getPages));
        System.out.println(stats);
    }
}