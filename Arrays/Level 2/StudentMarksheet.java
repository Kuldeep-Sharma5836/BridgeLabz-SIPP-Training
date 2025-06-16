import java.util.*;
public class StudentMarksheet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] maths = new int[n];
        double[] percentage = new double[n];
        String[] grade = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");

            System.out.print("  Physics: ");
            physics[i] = sc.nextInt();
            System.out.print("  Chemistry: ");
            chemistry[i] = sc.nextInt();
            System.out.print("  Maths: ");
            maths[i] = sc.nextInt();

            if (physics[i] < 0 || chemistry[i] < 0 || maths[i] < 0) {
                System.out.println(" Marks cannot be negative. Please re-enter.");
                i--; 
                continue;
            }
            int total = physics[i] + chemistry[i] + maths[i];
            percentage[i] = total / 3.0;
            if (percentage[i] >= 90) {
                grade[i] = "A+";
            } else if (percentage[i] >= 80) {
                grade[i] = "A";
            } else if (percentage[i] >= 70) {
                grade[i] = "B";
            } else if (percentage[i] >= 60) {
                grade[i] = "C";
            } else if (percentage[i] >= 50) {
                grade[i] = "D";
            } else {
                grade[i] = "F";
            }
        }

        System.out.println("\n--- Student Report ---");
        System.out.printf("%-10s %-10s %-10s %-12s %-6s\n",
                          "Physics", "Chemistry", "Maths", "Percentage", "Grade");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-10d %-10d %-10d %-12.2f %-6s\n",
                              physics[i], chemistry[i], maths[i], percentage[i], grade[i]);
        }

        sc.close();
    }
}
