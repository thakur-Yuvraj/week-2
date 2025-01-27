

class Patient {
    // Attributes
    static String hospitalName = "People's Hospital";
    String name;
    int age;
    String ailment;
    final int patientId;
    static int totalPatients = 0;

    // Constructor
    Patient(String name, int age, String ailment, int patientId) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientId = patientId;
        totalPatients++;
    }

    // Static method to get total patients
    static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    // Method to display patient details
    void displayDetails() {
        System.out.println("Patient Name: " + name);
        System.out.println("Patient Age: " + age);
        System.out.println("Ailment: " + ailment);
        System.out.println("Patient Id: " + patientId);
        System.out.println("Hospital Name: " + hospitalName);
    }

}

public class HospitalManagementSystem {
    public static void main(String[] args) {
        Patient patient1 = new Patient("Raju", 40, "Cancer", 101);
        Patient patient2 = new Patient("Shyam", 45, "Typhoid", 102);
        if (patient1 instanceof Patient) {
            // Display patient details
            patient1.displayDetails();
            patient2.displayDetails();

            // Display total patients
            Patient.getTotalPatients();
        }
    }
}