import java.util.*;

public class Course {
    String courseName;
    int fee;
    String duration;
    static String institutionName = "BridgeLabz";

    Course(String courseName, int fee, String duration) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    void displayCourseDetails() {
        System.out.println("Course Name     : " + courseName);
        System.out.println("Course Fee      : ₹" + fee);
        System.out.println("Course Duration : " + duration);
        System.out.println("Institute Name  : " + institutionName);
    }

    static void updateInstituteName(String newName) {
        institutionName = newName;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter course name: ");
        String name = sc.nextLine();
        System.out.print("Enter course fee: ");
        int fee = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter course duration: ");
        String duration = sc.nextLine();
        Course c1 = new Course(name, fee, duration);
        System.out.println("Before updating institute name:");
        c1.displayCourseDetails();
        System.out.print("Enter new institute name: ");
        String newInstitute = sc.nextLine();
        Course.updateInstituteName(newInstitute);
        System.out.println("After updating institute name:");
        c1.displayCourseDetails();
    }
}
