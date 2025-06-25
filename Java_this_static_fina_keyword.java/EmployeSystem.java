class Employee {
    static String companyName;
    static void setCompanyName(String name) {
        companyName = name;
    }
    static String getCompanyName() {
        return companyName;
    }
    final int id;
    String name;
    String designation;
    public Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
    }           
    void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
    }
}
public class EmployeSystem {
    public static void main(String[] args) {
        Employee.setCompanyName("Bustify.in");

        Employee emp1 = new Employee(101, "tanisk", "Software Engineer");
        Employee emp2 = new Employee(102, "Aditya", "Data Analyst");

        System.out.println("Company Name: " + Employee.getCompanyName());
        System.out.println();

        if (emp1 instanceof Employee) {
            emp1.displayDetails();
        }
        System.out.println();

        if (emp2 instanceof Employee) {
            emp2.displayDetails();
        }
    }
}
