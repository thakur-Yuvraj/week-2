import java.util.ArrayList;
import java.util.Scanner;

class University {
    // Attributes
    private String universityName;
    private int numberOfDepartment;
    // All departments record
    private ArrayList<Department> departments;
    // List of teacher exists, without any department
    private ArrayList<Faculties> faculties;

    // Scanner decalration for taking input for department related information
    Scanner input;

    // Parameterized constructor
    University(String universityName, int numberOfDepartment) {
        this.universityName = universityName;
        this.numberOfDepartment = numberOfDepartment;
        departments = new ArrayList<>();
        faculties = new ArrayList<>();
        input = new Scanner(System.in);
        createDepartment();
    }

    // Showing details of university
    public void getUniversityDetails() {
        System.out.println("University name is " + universityName + " annd it has " + numberOfDepartment
                + " of departments. Detail of each department is: ");

        for (Department department : departments) {
            System.out.println("Department name is " + department.depName + " and it has " + department.faculties
                    + " and it's details are: ");

            for (Faculties faculties : department.deptFaculty) {
                System.out.println("Name is " + faculties.name + " and he teaches " + faculties.subject);
            }
        }
    }

    // Department class definition
    private class Department {
        // Attributes
        private String depName;
        private int faculties;
        private ArrayList<Faculties> deptFaculty;

        Department(String depName, int faculties) {
            this.depName = depName;
            this.faculties = faculties;
            deptFaculty = new ArrayList<>();
        }
    }

    // Faculties class definition
    private class Faculties {
        private String name;
        private String subject;
        private String gender;

        Faculties(String name, String subject, String gender) {
            this.name = name;
            this.subject = subject;
            this.gender = gender;
        }
    }

    // Method for creating the department
    private void createDepartment() {
        for (int i = 0; i < numberOfDepartment; i++) {
            System.out.println("Enter the detail of department (name, number of faculties): ");
            String departmentName = input.next();
            int numberOfFaculty = input.nextInt();
            Department department = new Department(departmentName, numberOfFaculty);
            departments.add(department);
            enterFacultiesDetail(numberOfFaculty, department);
        }

        // Closing the scanner object
        input.close();
    }

    // Method for inputing the detail of faculty of department
    private void enterFacultiesDetail(int numberOfFaculty, Department department) {
        for (int i = 0; i < numberOfFaculty; i++) {
            System.out.println("Enter the detail of each faculties (name, subject, gender): ");
            String name = input.next();
            String subject = input.next();
            String gender = input.next();
            Faculties faculty = new Faculties(name, subject, gender);
            faculties.add(faculty);
            department.deptFaculty.add(faculty);
        }
    }
}

public class UniversityFacultiesAndDepartment {
    public static void main(String[] args) {
        // University class object creation
        University university = new University("RGPV", 2);
        university.getUniversityDetails();
    }
}