import java.util.Scanner;
class student{
    int rollNo;
    String name;
    int age;
    char grade;
    student next;
    public student(int rollNo, String name, int age, char grade) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}
public class StudentRecord {
    private student head;
    public StudentRecord() {
        this.head = null;
    }
    public void addStudent(int rollNo, String name, int age, char grade) {
        student newStudent = new student(rollNo, name, age, grade);
        if (head == null) {
            head = newStudent;
        } else {
            student current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newStudent;
        }
    }
    public void displayStudents() {
        student current = head;
        while (current != null) {
            System.out.println("Roll No: " + current.rollNo + ", Name: " + current.name + ", Age: " + current.age + ", Grade: " + current.grade);
            current = current.next;
        }
    }
    public void deleteStudent(int rollNo) {
        if (head == null) return;
        if (head.rollNo == rollNo) {
            head = head.next;
            return;
        }
        student current = head;
        while (current.next != null && current.next.rollNo != rollNo) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
        }
    }
    public student searchStudent(int rollNo) {
        student current = head;
        while (current != null) {
            if (current.rollNo == rollNo) {
                return current;
            }
            current = current.next;
        }
        return null;
    }
    public static void main(String[] args) {
        StudentRecord record = new StudentRecord();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add Student\n2. Display Students\n3. Delete Student\n4. Search Student\n5. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Roll No: ");
                    int rollNo = sc.nextInt();
                    System.out.print("Enter Name: ");
                    String name = sc.next();
                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    System.out.print("Enter Grade: ");
                    char grade = sc.next().charAt(0);
                    record.addStudent(rollNo, name, age, grade);
                    break;
                case 2:
                    record.displayStudents();
                    break;
                case 3:
                    System.out.print("Enter Roll No to delete: ");
                    int delRollNo = sc.nextInt();
                    record.deleteStudent(delRollNo);
                    break;
                case 4:
                    System.out.print("Enter Roll No to search: ");
                    int searchRollNo = sc.nextInt();
                    student foundStudent = record.searchStudent(searchRollNo);
                    if (foundStudent != null) {
                        System.out.println("Found Student - Roll No: " + foundStudent.rollNo + ", Name: " + foundStudent.name + ", Age: " + foundStudent.age + ", Grade: " + foundStudent.grade);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
