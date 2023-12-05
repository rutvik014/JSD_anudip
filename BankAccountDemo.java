class BankAccount {
    private String accountHolderName;
    private String bankName;
    private double accountBalance;

    // Constructor
    public BankAccount(String accountHolderName, String bankName, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.bankName = bankName;
        this.accountBalance = initialBalance;
    }

    // Interface methods
    public double getBalance() {
        return accountBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            accountBalance += amount;
            System.out.println("Deposit successful. New balance: $" + accountBalance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= accountBalance) {
            accountBalance -= amount;
            System.out.println("Withdrawal successful. New balance: $" + accountBalance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    // Display account details
    public void displayAccountDetails() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Balance: $" + accountBalance);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        // Create three bank accounts with different account holders' names and ICICI, HDFC, SBI as bank names
        BankAccount account1 = new BankAccount("Virat Kohli", "ICICI", 1000);
        BankAccount account2 = new BankAccount("Rohit Sharma", "HDFC", 1500);
        BankAccount account3 = new BankAccount("M.S. Dhoni", "SBI", 2000);

        // Display initial account details
        System.out.println("Initial Account Details:");
        account1.displayAccountDetails();
        account2.displayAccountDetails();
        account3.displayAccountDetails();

        // Deposit and withdraw money for each account
        account1.deposit(500);
        account1.withdraw(200);
        account2.deposit(1000);
        account2.withdraw(300);
        account3.deposit(800);
        account3.withdraw(400);

        // Display updated account details
        System.out.println("Updated Account Details:");
        account1.displayAccountDetails();
        account2.displayAccountDetails();
        account3.displayAccountDetails();
    }
}
