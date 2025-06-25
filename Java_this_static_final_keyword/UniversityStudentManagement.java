class student{
    static String universityName = "ABC University";
    final int rollNumber;
    String name;
    String grade;
    public student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
    }
    void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("University Name: " + universityName);
    }
    static void setUniversityName(String name) {
        universityName = name;
    }
    static String getUniversityName() {
        return universityName;
    }
}
public class UniversityStudentManagement {
    public static void main(String[] args) {
        student.setUniversityName("GLA University");

        student student1 = new student(101, "Rahul", "A");
        student student2 = new student(102, "Prem", "B");

        System.out.println("University Name: " + student.getUniversityName());
        System.out.println();

        if (student1 instanceof student) {
            student1.displayDetails();
        }
        System.out.println();

        if (student2 instanceof student) {
            student2.displayDetails();
        }
    }
}
