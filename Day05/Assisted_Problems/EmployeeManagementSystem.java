

// Employee superclass definition
class Employee {
    // Attributes
    public String name;
    public int id;
    public double salary;

    // Method for displaying details of employees
    public void displayDetails() {

    }
}

// Manager class definition extending the employee class properties
class Manager extends Employee {
    // Attributes
    private String name = "Vijay";
    private int id = 146;
    private double salary = 34234.23;

    // Method for displaying the details of the manager
    @Override
    public void displayDetails() {
        System.out.println(
                "Name of the manager is " + name + " his id is " + id + ". Salary of the manager is: " + salary);
    }
}

// Developer class definition extending the employee class properties
class Developer extends Employee {
    // Attributes
    private String name = "Raju";
    private int id = 116;
    private double salary = 17454.23;

    // Method for displaying the details of the developer
    @Override
    public void displayDetails() {
        System.out.println(
                "Name of the developer is " + name + " his id is " + id + ". Salary of the manager is: " + salary);
    }
}

// Intern class definition extending the employee class
class Intern extends Employee {
    // Attributes
    private String name = "Pankaj";
    private int id = 316;
    private double salary = 4234.23;

    // Intern class details displaying methods
    @Override
    public void displayDetails() {
        System.out.println(
                "Name of the intern is " + name + " his id is " + id + ". Salary of the manager is: " + salary);
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Creating the object of manger
        Manager manager1 = new Manager();
        // Displaying the manager details
        manager1.displayDetails();

        // Creating the developer object
        Developer developer1 = new Developer();
        // Displaying the developer details
        developer1.displayDetails();

        // Creating the intern object
        Intern intern1 = new Intern();
        // Displaying the intern details
        intern1.displayDetails();
    }
}