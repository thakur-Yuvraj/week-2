

class BankAccount {
    // Attributes
    static String bankName = "State Bank of India";
    String accountHolderName;
    final int accountNumber;
    static int totalAccounts = 0;

    // Constructor
    BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    // Static method to get total number of accounts
    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    // Method to display account details
    void displayDetails() {
        System.out.println("Acc. Holder Name: " + accountHolderName);
        System.out.println("Acc. Number: " + accountNumber);
        System.out.println("Bank: " + bankName);
    }

}

public class BankAccountSystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Rishi", 99887766);
        BankAccount account1 = new BankAccount("Rohan", 99884455);
        if (account instanceof BankAccount) {
            // Display the details of Account
            account.displayDetails();
            account1.displayDetails();

            // Display total number of Accounts
            BankAccount.getTotalAccounts();
        }
    }
}