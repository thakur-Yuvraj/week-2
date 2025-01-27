import java.util.ArrayList;

class Student {
    private String name;
    private ArrayList<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addCourse(Course course) {
        courses.add(course);
        course.addStudent(this); // Enroll the student in the course
        System.out.println(name + " is now enrolled in " + course.getCourseName());
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }
}

class Professor {
    private String name;
    private ArrayList<Course> courses;

    public Professor(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void assignCourse(Course course) {
        courses.add(course);
        course.setProfessor(this); // Assign the professor to the course
        System.out.println(name + " is now teaching " + course.getCourseName());
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }
}

class Course {
    private String courseName;
    private Professor professor;
    private ArrayList<Student> students;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getProfessorName() {
        return professor != null ? professor.getName() : "No professor assigned";
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void displayEnrolledStudents() {
        for (Student student : students) {
            System.out.println(" - " + student.getName());
        }
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Creating student objects
        Student raj = new Student("Raj");
        Student pankaj = new Student("Pankaj");
        
        // Creating professor objects
        Professor sumit = new Professor("Sumit");
        Professor raju = new Professor("Raju");
        
        // Creating course objects
        Course math101 = new Course("Math 101");
        Course english101 = new Course("English 101");

        // Assigning professors to courses
        sumit.assignCourse(math101);
        raju.assignCourse(english101);

        // Enrolling students in courses
        raj.addCourse(math101);
        raj.addCourse(english101);
        pankaj.addCourse(math101);

        // Output course details and enrolled students
        System.out.println("Professor of Math 101: " + math101.getProfessorName());
        System.out.println("Students enrolled in Math 101:");
        math101.displayEnrolledStudents();
    }
}
