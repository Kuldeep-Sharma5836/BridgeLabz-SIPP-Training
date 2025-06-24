class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0)
            this.salary = salary;
        else
            System.out.println("Invalid salary.");
    }

    public double getSalary() {
        return salary;
    }

    public void displayEmployeeInfo() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: ₹" + salary);
    }
}

class Manager extends Employee {


    Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    public void displayManagerInfo() {
        System.out.println("Manager Details:");
        System.out.println("ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: ₹" + getSalary());
    }
}

public class Company {
    public static void main(String[] args) {
        Manager mgr = new Manager(1001, "HR", 50000);

        mgr.displayEmployeeInfo();
        System.out.println();
        mgr.displayManagerInfo();

        mgr.setSalary(55000);
        System.out.println("\nUpdated Salary: ₹" + mgr.getSalary());
    }
}
