class Employee{
    String name;
    int id;
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public void displayInfo() {
        System.out.println("Employee Name: " + name + ", ID: " + id);
    }
}
class Manager extends Employee {
    int teamSize;
    public Manager(String name, int id, int teamSize) {
        super(name, id);
        this.teamSize = teamSize;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Manager of a team of size: " + teamSize);
    }
}
class Developer extends Employee {
    String programmingLanguage;
    public Developer(String name, int id, String programmingLanguage) {
        super(name, id);
        this.programmingLanguage = programmingLanguage;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Developer skilled in: " + programmingLanguage);
    }
}
public class EmployeeManagementSytem {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Ayush", 101);
        Manager mgr1 = new Manager("Boby", 102, 5);
        Developer dev1 = new Developer("Charu", 103, "Java");
        emp1.displayInfo();
        mgr1.displayInfo(); 
        dev1.displayInfo();
    }
}
