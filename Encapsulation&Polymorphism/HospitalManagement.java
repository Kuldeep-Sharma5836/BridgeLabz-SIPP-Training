import java.util.*;

abstract class Patient {
    private String patientId;
    private String name;
    private int age;

    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public abstract double calculateBill();
}

interface MedicalRecord {
    void addRecord(String record);
    List<String> viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private double roomChargePerDay;
    private List<String> records;

    public InPatient(String id, String name, int age, int days, double rate) {
        super(id, name, age);
        this.daysAdmitted = days;
        this.roomChargePerDay = rate;
        this.records = new ArrayList<>();
    }

    @Override
    public double calculateBill() {
        return daysAdmitted * roomChargePerDay + 2000; // Fixed admission fee
    }

    @Override
    public void addRecord(String record) {
        records.add(record);
    }

    @Override
    public List<String> viewRecords() {
        return records;
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private List<String> records;

    public OutPatient(String id, String name, int age, double consultationFee) {
        super(id, name, age);
        this.consultationFee = consultationFee;
        this.records = new ArrayList<>();
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        records.add(record);
    }

    @Override
    public List<String> viewRecords() {
        return records;
    }
}

public class HospitalManagement {
    public static void displayPatientSummary(Patient p) {
        p.getPatientDetails();
        System.out.println("Total Bill: ₹" + p.calculateBill());

        if (p instanceof MedicalRecord) {
            List<String> recs = ((MedicalRecord) p).viewRecords();
            System.out.println("Medical Records:");
            for (String r : recs) {
                System.out.println("- " + r);
            }
        }

        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();

        InPatient p1 = new InPatient("P101", "Rahul", 45, 4, 1500);
        p1.addRecord("Diagnosed with pneumonia.");
        p1.addRecord("Prescribed antibiotics.");

        OutPatient p2 = new OutPatient("P102", "Sneha", 28, 600);
        p2.addRecord("Routine check-up.");
        p2.addRecord("Advised blood test.");

        patients.add(p1);
        patients.add(p2);

        for (Patient p : patients) {
            displayPatientSummary(p);
        }
    }
}
