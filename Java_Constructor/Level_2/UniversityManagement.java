class Student {
    protected String name;
    public int rollNumber;
    private double CGPA;

    Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        if (CGPA >= 0.0 && CGPA <= 10.0)
            this.CGPA = CGPA;
        else
            System.out.println("Invalid CGPA. Please enter between 0 and 10.");
    }

    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}
class PostgraduateStudent extends Student {

    PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }

    public void displayPostgraduateDetails() {
        System.out.println("Postgraduate Student Details:");
        System.out.println("Name (Accessing protected): " + name);
        System.out.println("CGPA (Using getter): " + getCGPA());
    }
}

public class UniversityManagement {
    public static void main(String[] args) {
        PostgraduateStudent pgStudent = new PostgraduateStudent(101, "Kuldeep Sharma", 8.6);

        pgStudent.displayDetails();               
        pgStudent.displayPostgraduateDetails();   

        pgStudent.setCGPA(9.2);                   
        System.out.println("Updated CGPA: " + pgStudent.getCGPA());
    }
}
