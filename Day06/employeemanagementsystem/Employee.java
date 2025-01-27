package encapsulation_and_polymorphism.employee_management_system;

// abstract class with employeeId, name, basesalary
abstract class Employee implements Department {
    // private attributes
    private int employeeId;
    private String name;
    private double baseSalary;
    private String department;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        setBaseSalary(baseSalary);
    }

    // abstract method that calculate salary
    abstract double calculateSalary();

    // concrete method to display details
    public void displayDetails(){
        System.out.println("\nEmployee's Id : "+getEmployeeId());
        System.out.println("Employee's Name : "+getName());
    }

    // setters and getter to access private attributes
    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if(baseSalary > 0){
            this.baseSalary = baseSalary;
        }else{
            System.out.println("Salary should not be negative");
        }
    }
}






