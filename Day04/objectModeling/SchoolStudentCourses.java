import java.util.ArrayList;

// School class
class School {
    // Attributes
    private String name;
    private int estYear;

    // All students in school
    public ArrayList<Student> students;

    // Parameterized constructor
    School(String name, int estYear) {
        this.name = name;
        this.estYear = estYear;
        students = new ArrayList<>();
    }

    // Method for adding student in the school
    public void addStudent(Student student) {
        students.add(student);
    }

    // displaying all students enrolled
    public void allSudentsInSchool() {
        for(Student student : students) {
            student.showStudentDetails();
        }
    }
}

// Student class definitions
class Student {
    // Attributes
    private String name;
    private int age;
    private ArrayList<Course> courses;

    // Parameterized constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
        courses = new ArrayList<>();
    }

    // Mathod showing student detail
    public void showStudentDetails() {
        System.out.println("Student name is " + name + " and his age is " + age);
    }

    // Method for adding the course
    public void addCourse(Course course) {
        courses.add(course);
    }

    // Method for showing all course this student is enrolled into
    public void showAllCourses() {
        int counter = 1;
        for(Course course : courses) {
            System.out.println(counter + "Course details are: ");
            course.showCourseDetails();
            counter++;
        }
    }
}

// Course class definition
class Course {
    // Attributes
    private String name;
    private int numberOfSubjects;

    // List of all students enrolled in this course
    private ArrayList<Student> students;

    // Parameterized constructor
    Course(String name, int numberOfSubjects) {
        this.name = name;
        this.numberOfSubjects = numberOfSubjects;
        students = new ArrayList<>();
    }

    // Method for adding student to this course
    public void addStudent(Student student) {
        students.add(student);
    }

    // Method for showing all enrolled students
    public void showStudentsEnrolled() {
        int counter = 1;
        for(Student student : students) {
            System.out.println(counter + " student details are: ");
            student.showStudentDetails();
        }
    }

    // Method for showing this course in detail
    public void showCourseDetails() {
        System.out.println("Course name is " + name + " and number of subjects it has " + numberOfSubjects);
    }
}

public class SchoolStudentCourses {
    public static void main(String[] args) {
        // Declaring the school class instance
        School dps = new School("DPS", 1889);

        // Declaring the multiple student objects
        Student student1 = new Student("Sahil", 21);
        Student student2 = new Student("yuvi", 22);
        Student student3 = new Student("vivish", 21);

        // Adding the student to the school record
        dps.addStudent(student1);
        dps.addStudent(student2);
        dps.addStudent(student3);

        // Displaying the all student record in the school
        dps.allSudentsInSchool();

        // Course objects declaration
        Course course1 = new Course("B.Tech", 5);
        Course course2 = new Course("Pharma", 10);

        // Adding the students to course and courses to the student record 
        student1.addCourse(course1);
        course1.addStudent(student1);
        student2.addCourse(course1);
        course1.addStudent(student2);

        student2.addCourse(course2);
        course2.addStudent(student2);

        student3.addCourse(course1);
        course1.addStudent(student3);

        // displaying the detail regarding the course object and student objects
        student1.showAllCourses();
        student2.showAllCourses();
        student3.showAllCourses();

        course1.showCourseDetails();
        course1.showStudentsEnrolled();

        course2.showCourseDetails();
        course2.showStudentsEnrolled();
    }
}
