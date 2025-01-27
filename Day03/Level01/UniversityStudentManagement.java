
class Student {
    // Attributes
    static String universityName = "Technocrats Institute";
    String name;
    final int rollNumber;
    char grade;
    static int totalStudents;

    // Constructor
    Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    // Static method to show total students
    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    // Method to display students details
    void displayStudentDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
        System.out.println("University: " + universityName);
    }

}

public class UniversityStudentManagement {
    public static void main(String[] args) {
        Student student = new Student("Raju", 101, 'A');
        Student student2 = new Student("Shyam", 102, 'B');

        if (student2 instanceof Student) {
            // Display student details
            student.displayStudentDetails();
            student2.displayStudentDetails();

            // Display total students
            Student.displayTotalStudents();
        }
    }
}
