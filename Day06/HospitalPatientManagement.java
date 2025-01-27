// Hospital Patient Management
// Description: Design a system to manage patients in a hospital:
// Create an abstract class Patient with fields like patientId, name, and age.
// Add an abstract method calculateBill() and a concrete method getPatientDetails().
// Extend it into subclasses InPatient and OutPatient, implementing calculateBill() with different billing logic.
// Implement an interface MedicalRecord with methods addRecord() and viewRecords().
// Use encapsulation to protect sensitive patient data like diagnosis and medical history.
// Use polymorphism to handle different patient types and display their billing details dynamically.


// Implement an interface MedicalRecord with methods addRecord() and viewRecords().
interface MedicalRecord{
    public void addRecord();
    public void viewRecord();
}

// Create an abstract class Patient with fields like patientId, name, and age.
abstract class Patient implements MedicalRecord {
    // attributes
    private int patientId;
    private String name;
    private int age;
    private String diagnosisName;

    // constructor
    public Patient(int patientId, String name, int age, String diagnosisName) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.diagnosisName = diagnosisName;
    }
    public Patient() {
    }

    // Add an abstract method calculateBill()
    abstract int calculateBill();

    // a concrete method getPatientDetails().
    void getPatientDetails() {
        System.out.println("Name of patient is : "+ name+ " admitted id is : "+ patientId+ " and his age is : "+ age+ " diagnosed with : "+ diagnosisName);
    }
    // implementing the the addRecord and view Record
    public void addRecord() {
        System.out.println("Record added");
    }

    public void viewRecord() {
        System.out.println("viewing record");
    }
    
}

class InPatient extends Patient{

    int InPatientFee;
    // using different billing logic
    @Override
    int calculateBill() {
        // initially billing fees
        

        return InPatientFee;
    }
    public InPatient(int patientId, String name, int age, String diagnosisName, int inPatientFee) {
        super(patientId, name, age, diagnosisName);
        InPatientFee = inPatientFee;
    }
    
}

class OutPatient extends Patient{

    // attributes
    int totalDays;
        
    // using different billing logic
    @Override
    int calculateBill() {
        // total fee of out patient
        int perDayFees = 10000;
        return perDayFees * totalDays;
    }
    public OutPatient(int patientId, String name, int age, String diagnosisName, int totalDays) {
        super(patientId, name, age, diagnosisName);
        this.totalDays = totalDays;
    }
    
    
}

public class HospitalPatientManagement {
    public static void main(String[] args) {
        Patient inPatient1 = new InPatient(554, "Rahul", 14, "nuabcll", 2000);
        Patient outPatient1 = new OutPatient(999, "rishi", 99, "Old age", 20);

        // calculate bill by different logic
        System.out.println(inPatient1.calculateBill());
        System.out.println(outPatient1.calculateBill());

        // add record
        inPatient1.addRecord();
        // viewRecord
        outPatient1.viewRecord();
        
        // printing the patient details
        inPatient1.getPatientDetails();
        outPatient1.getPatientDetails();
    }   
}