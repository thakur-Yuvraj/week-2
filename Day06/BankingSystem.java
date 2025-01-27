// 4. Banking System
// Description: Create a banking system with different account types:
// Define an abstract class BankAccount with fields like accountNumber, holderName, and balance.
// Add methods like deposit(double amount) and withdraw(double amount) (concrete) and calculateInterest() (abstract).
// Implement subclasses SavingsAccount and CurrentAccount with unique interest calculations.
// Create an interface Loanable with methods applyForLoan() and calculateLoanEligibility().
// Use encapsulation to secure account details and restrict unauthorized access.
// Demonstrate polymorphism by processing different account types and calculating interest dynamically.


// Create an interface Loanable with methods applyForLoan() and calculateLoanEligibility().
interface Loanable {
    void applyForLoan();
    boolean calculateLoanEligibility();
}

// Define an abstract class BankAccount with fields like accountNumber, holderName, and balance.
abstract class BankAccount implements Loanable{
    // attributes
    private int accountNumber;
    String holderName;
    private double balance;

    // constructors
    public BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }
    // Adding methods like deposit(double amount) and withdraw(double amount) (concrete) and calculateInterest() (abstract).
    
    void deposit(double amount) {
        if (amount > 0)
            balance += amount;
    }

    double withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Not enough Balance");
            return -1;
        }
        balance -= amount;
        return amount;
    }

    abstract double calculateInterest(int years);
    void accountDetails() {
        System.out.println("The account number is : "+ accountNumber+ " Has balance of : "+ balance);
    }
    // getter for getting balance
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

// Implement subclasses SavingsAccount and CurrentAccount with unique interest calculations.
class SavingsAccount extends BankAccount {
    double intresetRate = 0.06;
    
    // in savings account the intreset is added to the balance and can be withdrawn by client
    @Override
    double calculateInterest(int years) {
        double intreset = getBalance()* intresetRate * years;
        setBalance(getBalance() + intreset);
        return intreset;
    }

    @Override
    public void applyForLoan() {
        if (calculateLoanEligibility()) {
            System.out.println("You have applied to get loan sucessfully");
        }
        
    }
    // if statement to check loan eligibility
    @Override
    public boolean calculateLoanEligibility() {
        if (getBalance() > 100000) { // Collateral
            return true;
        }
        return false;
    }
    

    public SavingsAccount(int accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }
    
}

class CurrentAccount extends BankAccount{
    double intresetRate = 0.08;
    
    // in this account the intreset is added to the debt 
    @Override
    double calculateInterest(int years) {
        double intreset = getBalance()* intresetRate * years;
        return intreset;
    }

    public CurrentAccount(int accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public void applyForLoan() {
        if (calculateLoanEligibility()) {
            System.out.println("You have applied to get loan sucessfully");
        }
        
    }

    // if statement to check loan eligibility
    @Override
    public boolean calculateLoanEligibility() {
        if (getBalance() > 100000) { // Collateral
            return true;
        }
        return false;
    }
    
    
}

public class BankingSystem {
    public static void main(String[] args) {
        // example
        BankAccount savingsAccount1 = new SavingsAccount(9483, "sahil", 200000);
        BankAccount currentAccount1 = new CurrentAccount(435, "Sagar", 1000000);

        // checking for loan eligible
        if (currentAccount1.calculateLoanEligibility()) {
            System.out.println("Account is eligible for loan");
        }else {
            System.out.println("Account is not eligible for loan");
        }

        // appliying for loan
        currentAccount1.applyForLoan();

        // savings account intrest calculation for 5 years
        System.out.println(savingsAccount1.calculateInterest(5));
    }
}