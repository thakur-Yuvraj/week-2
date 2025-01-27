import java.util.ArrayList;

class Bank {

    // Attributes of bank class
    private ArrayList<Customer> customers = new ArrayList<>();
    private String name;
    int countCustomers = 0;

    // Constructors
    Bank(String name) {
        this.name = name;
    }

    // Method to open Account
    public void openAccount(Customer customer) {
        if (!customers.contains(customer)) {
            countCustomers++; // for counting customers
            customers.add(customer);
            System.out.println("Account Created Successfully in: "+name);
        } else {
            System.out.println("Account Already exist: ");
        }
    }

    // Method to get number of bank customers
    public void numberOfCustomers() {
        System.out.println("\nThe number of customer in Bank " + name + " are " + countCustomers);
    }

}

class Customer {
    private String name;
    private int balance;
    private String accountNumber;

    Customer(String name, int balance, String accountNumber) {
        this.name = name;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    // Check balance
    public void viewBalance() {
        System.out.println("\nCurrent Balance of "+name+": " + balance);
    }
}

public class BankAccountHolders {
    public static void main(String args[]) {


        // Create instance of bank class
        Bank bank1 = new Bank("State Bank of India");
        Bank bank2 = new Bank("Bank of Baroda");

        // Create Customers
        Customer customer1 = new Customer("Sahil", 9999999, "ABC123456");
        Customer customer2 = new Customer("mef", 929999, "ABG523456");
        Customer customer3 = new Customer("Shivam", 999999, "DBC323456");

        // opening account in bank1
        bank1.openAccount(customer1);
        bank1.openAccount(customer2);
        bank1.openAccount(customer3);

        //Opening account in bank2
        bank2.openAccount(customer3);

        // Check balance
        customer1.viewBalance();
        customer2.viewBalance();
        customer3.viewBalance();

        // number of customers in bank1
        bank1.numberOfCustomers();

        // number of customers in bank2
        bank2.numberOfCustomers();

    }
}