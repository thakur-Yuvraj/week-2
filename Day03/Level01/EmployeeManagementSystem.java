

class Employee {
    // Attributes
    static String companyName = "Capgemini";
    static int totalEmployees;
    final int id;
    String name;
    String designation;

    // Constructor
    Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++;
    }

    // Static method to display total employees
    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    // Method to display employee details
    void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Designation: " + designation);
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "Raju", "HR");
        Employee emp2 = new Employee(102, "Shyaam", "Manager");

        if (emp1 instanceof Employee) {
            // Display details of employee
            emp1.displayDetails();
            emp2.displayDetails();

            // Display total employees
            Employee.displayTotalEmployees();
        }
    }
}