import java.util.ArrayList;

class Company {

    // Attributes
    private String name;
    private ArrayList<Departments> departments = new ArrayList<>();

    // Constructor
    public Company(String name) {
        this.name = name;
    }

    // Method to add a department
    public void addDepartment(Departments department) {
        departments.add(department);
    }

    // Display company details
    public void displayDetails() {
        System.out.println("Company: " + name);
        for (Departments dept : departments) {
            dept.displayDetails();
        }
    }

    // Manually delete all departments and their employees
    public void deleteCompany() {
        System.out.println("Deleting company and all its departments...");
        for (Departments dept : departments) {
            dept.deleteEmployees();
        }
        departments.clear();
        System.out.println("All departments and employees have been deleted.");
    }
}

class Departments {

    // Attributes
    private String deptName;
    private ArrayList<Employee> employees = new ArrayList<>();

    // Constructor
    public Departments(String deptName) {
        this.deptName = deptName;
    }

    // Add employee to department
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Display department details
    public void displayDetails() {
        System.out.println("Department: " + deptName);
        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }

    // Manually delete all employees in the department
    public void deleteEmployees() {
        employees.clear();
        System.out.println("Employees deleted from department: " + deptName);
    }
}

class Employee {

    // Attributes
    private String name;
    private String empId;

    // Constructor
    public Employee(String name, String empId) {
        this.name = name;
        this.empId = empId;
    }

    // Display employee details
    public void displayDetails() {
        System.out.println("Employee Name: " + name + ", Employee ID: " + empId);
    }
}

public class CompanyDepartments {

    public static void main(String[] args) {

        // Create company
        Company company = new Company("Tech Corp");

        // Create departments
        Departments dept1 = new Departments("Engineering");
        Departments dept2 = new Departments("HR");

        // Create employees
        Employee emp1 = new Employee("Alice", "E101");
        Employee emp2 = new Employee("Bob", "E102");

        // Add employees to departments
        dept1.addEmployee(emp1);
        dept2.addEmployee(emp2);

        // Add departments to company
        company.addDepartment(dept1);
        company.addDepartment(dept2);

        // Display details
        company.displayDetails();

        // Manually delete company and all its departments and employees
        company.deleteCompany();
    }
}
