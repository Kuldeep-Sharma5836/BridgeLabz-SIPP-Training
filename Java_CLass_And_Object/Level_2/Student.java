import java.util.Scanner;
public class Student {
    String name;
    int rollNo;
    double marks;

    void setDetails(String name, int rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }
    void calGrade(double marks) {
        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 80) {
            System.out.println("Grade: B");
        } else if (marks >= 70) {
            System.out.println("Grade: C");
        } else if (marks >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
    }
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        System.out.println("Enter Student Name:");
        String name = sc.nextLine();
        System.out.println("Enter Roll No:");
        int rollNo = sc.nextInt();
        System.out.println("Enter Marks:");
        double marks = sc.nextDouble();
        
        student.setDetails(name, rollNo, marks);
        
        System.out.println("Student Details:-----------------------------------");
        student.displayDetails();
        
        student.calGrade(marks);
    }
}
