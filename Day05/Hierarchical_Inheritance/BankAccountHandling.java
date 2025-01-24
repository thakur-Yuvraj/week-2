// Hierarchical Inheritance
// Sample Problem 1: Bank Account Types
// Description: Model a banking system with different account types using hierarchical inheritance. BankAccount is the superclass, with SavingsAccount, CheckingAccount, and FixedDepositAccount as subclasses.
// Tasks:
// Define a base class BankAccount with attributes like accountNumber and balance.
// Define subclasses SavingsAccount, CheckingAccount, and FixedDepositAccount, each with unique attributes like interestRate for SavingsAccount and withdrawalLimit for CheckingAccount.
// Implement a method displayAccountType() in each subclass to specify the account type.
// Goal: Explore hierarchical inheritance, demonstrating how each subclass can have unique attributes while inheriting from a shared superclass


// Define a base class BankAccount with attributes like accountNumber and balance.
class BankAccount {
    // attribute
    int accountNumber = -1;
    int balance = 0;

    // constructors
    public BankAccount(){};

    public BankAccount(int accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    };

    // display
    void display() {
        System.out.println("Account number is : "+ accountNumber + " and account balance is : "+ balance);
    }
    
}

// Defining subclasses SavingsAccount, CheckingAccount, and FixedDepositAccount, each with unique attributes like interestRate for SavingsAccount and withdrawalLimit for CheckingAccount.

class SavingsAccount extends BankAccount {
    // attribute
    int interestRate;
    // Implement a method displayAccountType() in each subclass to specify the account type.
    void displayAccountType() {
        System.out.println("It is a savings account");
    }
    public int getInterestRate() {
        return interestRate;
    }
    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }

    // constructors
    public SavingsAccount(int interestRate) {
        this.interestRate = interestRate;
    }
    public SavingsAccount(int accountNumber, int balance, int interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    
    // displaing the intrest rate
    @Override
    void display() {
        super.display();
        System.out.println("Intrest rate is : "+ interestRate);
    }
}

class CheckingAccount extends BankAccount {
    // attribute
    int withdrawalLimit;
    // Implement a method displayAccountType() in each subclass to specify the account type.
    void displayAccountType() {
        System.out.println("It is a Checking account");
    }
    
    public int getWithdrawalLimit() {
        return withdrawalLimit;
    }
    public void setWithdrawalLimit(int withdrawalLimit) {
        this.withdrawalLimit = withdrawalLimit;
    }

    // constructors
    public CheckingAccount(int withdrawalLimit) {
        this.withdrawalLimit = withdrawalLimit;
    }

    public CheckingAccount(int accountNumber, int balance, int withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Withdraw limit is : "+ withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    // attribute
    int fixedDepositAmount = 0;
    // Implement a method displayAccountType() in each subclass to specify the account type.
    void displayAccountType() {
        System.out.println("It is a Fixed deposite account");
    }
    public int getFixedDepositAmount() {
        return fixedDepositAmount;
    }
    public void setFixedDepositAmount(int fixedDepositAmount) {
        this.fixedDepositAmount = fixedDepositAmount;
    }

    // constructors
    public FixedDepositAccount(int fixedDepositAmount) {
        this.fixedDepositAmount = fixedDepositAmount;
    }
    public FixedDepositAccount(int accountNumber, int balance, int fixedDepositAmount) {
        super(accountNumber, balance);
        this.fixedDepositAmount = fixedDepositAmount;
    }
    @Override
    void display() {
        super.display();
        System.out.println("Fixed Deposit Amount limit is : "+ fixedDepositAmount);
    }


}

public class BankAccountHandling{
    public static void main(String[] args) {
        // creating the three different account

        SavingsAccount savingsAccount1 = new SavingsAccount(12, 1000, 3);
        CheckingAccount checkingAccount1 = new CheckingAccount(13, 2000, 99999);
        FixedDepositAccount fixedDepositAccount1 = new FixedDepositAccount(14, 3000, 1500);

        // printing the account information
        savingsAccount1.display();
        checkingAccount1.display();
        fixedDepositAccount1.display();

    }
    
}
