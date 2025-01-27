package encapsulation_and_polymorphism.employee_management_system;

//FullTimeEmployee class extends abstract class Employee
class FullTimeEmployee extends Employee{
    // department attributes
    private String department;
    public FullTimeEmployee(int employeeId, String name, double baseSalary, String department) {
        super(employeeId, name, baseSalary);
        assignDepartment(department);
    }

    @Override
    double calculateSalary() {
        return getBaseSalary();
    }


    // Assign department to the employee
    @Override
    public void assignDepartment(String department) {
        this.department=department;
    }

    // getting employee's department
    @Override
    public String getDepartmentDetails() {
        return department;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department : "+getDepartmentDetails());
        System.out.println("Work Type : Full Tiime");
        System.out.println("Employee's salary : "+calculateSalary());
    }
}