import java.util.*;
public class Person {
    String name;
    int age;

    public Person(){
        name = "Gaurav";
        age = 30;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void PersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public Person(Person second) {
        this.name = second.name;
        this.age = second.age;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the name of the person:");
        String name = sc.nextLine();
        System.out.println("Enter the age of the person:");
        int age = sc.nextInt();
        Person person = new Person(name, age);
        System.out.println("Person Details:-----------------------------");
        person.PersonDetails();
        Person person2 = new Person();
        System.out.println("Default Person Details:--------------------------------------");
        person2.PersonDetails();
        Person person3 = new Person(person);
        System.out.println("Copied Person Details:----------------------------------");
        person3.PersonDetails();
    }
}
