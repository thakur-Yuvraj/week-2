// Sample Problem 2: School System with Different Roles
// Description: Create a hierarchy for a school system where Person is the superclass, and Teacher, Student, and Staff are subclasses.
// Tasks:
// Define a superclass Person with common attributes like name and age.
// Define subclasses Teacher, Student, and Staff with specific attributes (e.g., subject for Teacher and grade for Student).
// Each subclass should have a method like displayRole() that describes the role.
// Goal: Demonstrate hierarchical inheritance by modeling different roles in a school, each with shared and unique characteristics.


// Description: Create a hierarchy for a school system where Person is the superclass
// defining a superclass Person with common attributes like name and age.

class Person {
    // attributes
    String name;
    int age;

    // constructors
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    void display() {
        System.out.println("Name is : "+ name + " age is : "+ age);
    }
    
}

//Defining subclasses Teacher, Student, and Staff with specific attributes (e.g., subject for Teacher and grade for Student).

class Teacher extends Person {
    // attribute
    String subject = null;

    // constructors
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public Teacher(String subject) {
        this.subject = subject;
    }

    // displaying roles

    public void displayRole() {
        System.out.println("Role is Teacher");
    }

    @Override
    public void display() {
        super.display();
        displayRole();
    }
    
}

// staff with designation attribute
class Staff extends Person {
    // attribute
    String designation = null;

    // constructors
    public Staff(String name, int age, String designation) {
        super(name, age);
        this.designation = designation;
    }

    public Staff(String designation) {
        this.designation = designation;
    }

    // displaying roles

    public void displayRole() {
        System.out.println("Role is : "+ designation);
    }

    @Override
    public void display() {
        super.display();
        displayRole();
    }
    
}


// student class 
class Student extends Person {
    // attribute
    String grade = null;

    // constructors
    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    public Student(String grade) {
        this.grade = grade;
    }

    // displaying roles

    public void displayRole() {
        System.out.println("Role is Student");
    }

    @Override
    public void display() {
        super.display();
        displayRole();
    }
    
}

public class SchoolSystemWithRoles {
    public static void main(String[] args) {

        // example to demonstrate roles

        Teacher teacher1 = new Teacher("Shivam", 33, "Science");
        Staff staff1 = new Staff("rishab", 33, "Cleaning");
        Student student1 = new Student("vishal", 33, "A+");

        teacher1.display();
        staff1.display();
        student1.display();
    }
}
