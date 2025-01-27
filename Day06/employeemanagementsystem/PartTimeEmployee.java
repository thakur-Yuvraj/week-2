package encapsulation_and_polymorphism.employee_management_system;

//PartTimeEmployee class that extends abstract class Employee
class PartTimeEmployee extends Employee{
    // attributes
    private int workHours;
    private String department;

    public PartTimeEmployee(int employeeId, String name, double baseSalary, int workHours, String department) {
        super(employeeId, name, baseSalary);
        this.workHours = workHours;
        assignDepartment(department);
    }

    @Override
    double calculateSalary() {
        return (getBaseSalary()*getWorkHours());
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    @Override
    public void assignDepartment(String department) {
        this.department = department;
    }

    @Override
    public String getDepartmentDetails() {
        return department;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department : "+getDepartmentDetails());
        System.out.println("Work Type : Part Tiime");
        System.out.println("Employee's salary : "+calculateSalary());
    }
}