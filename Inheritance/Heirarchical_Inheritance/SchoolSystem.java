class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
class Student extends Person {
    String studentId;

    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student ID: " + studentId);
    }
}
class Teacher extends Person {
    String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subject: " + subject);
    }
}
class staff extends Person {
    String position;

    public staff(String name, int age, String position) {
        super(name, age);
        this.position = position;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Position: " + position);
    }
}
public class SchoolSystem {
    public static void main(String[] args) {
        Person student = new Student("Arun", 20, "S12345");
        Person teacher = new Teacher("Mr. Smarth", 40, "Mathematics");
        Person staffMember = new staff("Mr. John", 35, "Librarian");

        student.displayInfo();
        System.out.println();

        teacher.displayInfo();
        System.out.println();

        staffMember.displayInfo();
    }
}
