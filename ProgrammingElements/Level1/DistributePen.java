import java.util.*;
public class DistributePen {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int totalPens = sc.nextInt();
        int totalStudents = sc.nextInt();
        int pensPerStudent = totalPens / totalStudents;
        int remainingPens = totalPens % totalStudents;  
        System.out.println("Each student gets " + pensPerStudent + " pens.");
        System.out.println("Remaining pens: " + remainingPens);
    }
}
