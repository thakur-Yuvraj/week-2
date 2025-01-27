import java.util.ArrayList;

// Hospital class
class Hospital {
    private ArrayList<Doctor> doctors;
    private ArrayList<Patient> patients;

    public Hospital() {
        doctors = new ArrayList<>();
        patients = new ArrayList<>();
    }

    // Add doctor to hospital
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    // Add patient to hospital
    public void addPatient(Patient patient) {
        patients.add(patient);
    }


}

// Doctor class
class Doctor {
    private String name;
    private ArrayList<Patient> patients;

    public Doctor(String name) {
        this.name = name;
        patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // Add a patient to the doctor's list
    public void assignPatient(Patient patient) {
        patients.add(patient);
    }

    // Show consultation details
    public void startConsultation(Patient patient) {
        if (patients.contains(patient)) {
            System.out.println("Doctor " + name + " is consulting with patient: " + patient.getName());
            System.out.println("Consultation: " + patient.getName() + " reports feeling unwell.");
        } else {
            System.out.println("Doctor " + name + " has not yet seen patient: " + patient.getName());
        }
    }

    // Get all patients treated by the doctor
    public ArrayList<Patient> getPatients() {
        return patients;
    }
}

// Patient class
class Patient {
    private String name;
    private ArrayList<Doctor> doctors;

    public Patient(String name) {
        this.name = name;
        doctors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // Add a doctor to the patient's list
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    // Get all doctors treating the patient
    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }
}

public class HospitalDoctorsPatients {
    public static void main(String[] args) {
        // Creating a hospital
        Hospital hospital = new Hospital();

        // Creating doctors
        Doctor doctor1 = new Doctor("Dr. Smith");
        Doctor doctor2 = new Doctor("Dr. Johnson");

        // Adding doctors to the hospital
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);

        // Creating patients
        Patient patient1 = new Patient("Alice");
        Patient patient2 = new Patient("Bob");

        // Adding patients to the hospital
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        // Assigning patients to doctors
        doctor1.assignPatient(patient1);
        doctor1.assignPatient(patient2);
        doctor2.assignPatient(patient1);

        patient1.addDoctor(doctor1);
        patient1.addDoctor(doctor2);
        patient2.addDoctor(doctor1);

        // Starting consultations
        doctor1.startConsultation(patient1);
        doctor1.startConsultation(patient2);
        doctor2.startConsultation(patient1);
    }
}
