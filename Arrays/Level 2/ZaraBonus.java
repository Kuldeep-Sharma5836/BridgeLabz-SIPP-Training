import java.util.*;
public class ZaraBonus {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2]; 
        double[][] result = new double[10][2]; 
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1));
            double salary, years;
            while (true) {
                System.out.print("  Enter salary: ");
                salary = sc.nextDouble();
                System.out.print("  Enter years of service: ");
                years = sc.nextDouble();
                if (salary >= 0 && years >= 0) break;
                System.out.println(" Invalid input. Try again.");
            }
            data[i][0] = salary;
            data[i][1] = years;
        }

        for (int i = 0; i < 10; i++) {
            double sal = data[i][0], yrs = data[i][1];
            double bonus = sal * (yrs > 5 ? 0.05 : 0.02);
            double newSal = sal + bonus;

            result[i][0] = newSal;
            result[i][1] = bonus;

            totalOldSalary += sal;
            totalBonus += bonus;
            totalNewSalary += newSal;
        }

        System.out.printf("\nTotal Old Salary: $%.2f\n", totalOldSalary);
        System.out.printf("Total Bonus Paid: $%.2f\n", totalBonus);
        System.out.printf("Total New Salary: $%.2f\n", totalNewSalary);

        System.out.println("\nEmp#   Old Salary   Years  Bonus     New Salary");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-6d %-11.2f %-6.1f %-9.2f %.2f\n",
                    i + 1, data[i][0], data[i][1], result[i][1], result[i][0]);
        }

        sc.close();
    }
}
