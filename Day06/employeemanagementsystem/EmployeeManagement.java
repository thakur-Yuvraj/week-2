package encapsulation_and_polymorphism.employee_management_system;

import java.util.ArrayList;
import java.util.List;

// That class contains main method (entry point)
public class EmployeeManagement {
    public static void main(String[] args) {
        // FullTimeEmployee class's objects
        Employee fullTimeEmployee1 = new FullTimeEmployee(1001,"Sanket patel",25000,"Management");
        Employee fullTimeEmployee2 = new FullTimeEmployee(1005,"Sandeep",30000,"Manufacturing");

        // PartTimeEmployee class's objects
        Employee partTimeEmployee1 = new PartTimeEmployee(1021,"Shivam",300,5,"Information Technology");
        Employee partTimeEmployee2 = new PartTimeEmployee(1025,"Pranav",500,4,"Development");

        // list of employees
        List<Employee> employeeList = new ArrayList<>();

        // Adding objects to employee list
        employeeList.add(fullTimeEmployee1);
        employeeList.add(fullTimeEmployee2);
        employeeList.add(partTimeEmployee1);
        employeeList.add(partTimeEmployee2);

        // displaying details from list of employee
        for (Employee details: employeeList) {
            details.displayDetails();
        }

    }
}
