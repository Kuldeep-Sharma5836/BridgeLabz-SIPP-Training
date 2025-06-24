import java.util.Scanner;
class EmployeeDetail {
    String name;
    int id;
    int salary;

    void employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        EmployeeDetail emp = new EmployeeDetail();
        System.out.println("Enter Employee Name:");
        String name = sc.nextLine();
        System.out.println("Enter Employee ID:");
        int id = sc.nextInt();
        System.out.println("Enter Employee Salary:");
        int salary = sc.nextInt();
        emp.employee(name, id, salary);
        System.out.println("Employee Details:-----------------------------------");
        emp.display();
    }
}
