class Patient {
    static String hospitalName = "City Hospital";
    static int totalPatients = 0;

    final int patientId;
    String name;
    int age;
    String ailment;

    public Patient(int patientId, String name, int age, String ailment) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }

    void displayDetails() {
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Ailment: " + ailment);
        System.out.println("---------------------------");
    }
}
public class HospitalSystem {
    public static void main(String[] args) {
        Patient patient1 = new Patient(101, "John", 30, "Flu");
        Patient patient2 = new Patient(102, "Virat", 35, "Cold");

        System.out.println("Hospital Name: " + Patient.hospitalName);
        System.out.println();

        if (patient1 instanceof Patient) {
            patient1.displayDetails();
        }

        if (patient2 instanceof Patient) {
            patient2.displayDetails();
        }

        Patient.getTotalPatients();
    }
}
