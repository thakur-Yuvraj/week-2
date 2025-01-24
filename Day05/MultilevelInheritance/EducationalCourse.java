public class EducationalCourse {
    public static void main(String[] args) {
        // Creating the paidonlinecourse object
        PaidOnlineCourse course1 = new PaidOnlineCourse("Biology", 5, "Netfilx", true, 30000, 2299);
        // diaplaying the details of this paid online course
        course1.displayPaidCourseDetails();
    }
}

// Course class definition
class Course {
    // Attributes
    public String courseName;
    public int duration;

    // Paramaterized constructor
    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    // Displaying the details of the course
    public void displayCourseDetails() {
        System.out.println("Name of the course is " + courseName + " and it's duration is " + duration + " months.");
    }
}

// Online course class definition
class OnlineCourse extends Course {
    // Attributes
    public String platform;
    public boolean isRecorded;

    // Paramaterized constructor
    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    // Displaying the details of the online course
    public void displayOnlineCourseDetails() {
        displayCourseDetails();
        System.out.println("This is online course and is streams on the platform " + platform
                + ". And is it recorded course? " + isRecorded);
    }
}

// Paid online course class definition
class PaidOnlineCourse extends OnlineCourse {
    // Attributes
    public double fee;
    public double discount;

    // Parameterized constructor
    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee,
            double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    // Displaying the details of the paid course
    public void displayPaidCourseDetails() {
        displayOnlineCourseDetails();
        System.out.println("This is paid course and fee of this course is " + fee
                + " and organizer is giving the discout of " + discount);
    }
}
