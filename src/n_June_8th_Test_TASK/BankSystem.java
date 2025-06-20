package n_June_8th_Test_TASK;

//task: Create a basic system to manage two types of bank accounts – Savings Account and Current Account – using object-oriented programming concepts.

//Write a program where:
//
//A user can create both savings and current accounts.
//
//Perform deposits (with/without notes).
//
//Display account details using overridden methods.
//
//Demonstrate polymorphism by calling displayAccountDetails() through base class reference.



// Base class
class Account {
    // Encapsulated fields
    private int accountNumber;
    private String holderName;
    private double balance;

    // Constructor using 'this' keyword
    public Account(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Getter methods (Encapsulation)
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    // Setter methods
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Method Overloading
    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void deposit(double amount, String note) {
        this.balance += amount;
        System.out.println("Deposited: " + amount + " | Note: " + note);
    }

    // Method to be overridden
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }
}

// Derived class: SavingsAccount
class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(int accountNumber, String holderName, double balance, double interestRate) {
        // Use of super keyword to call parent constructor
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    // Method Overriding
    @Override
    public void displayAccountDetails() {
        // Call parent method using super
        super.displayAccountDetails();
        System.out.println("Interest Rate: " + this.interestRate + "%");
    }
}

// Derived class: CurrentAccount
class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(int accountNumber, String holderName, double balance, double overdraftLimit) {
        super(accountNumber, holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    // Method Overriding
    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Overdraft Limit: " + this.overdraftLimit);
    }
}

// Main class to test the functionality
public class BankSystem {
    public static void main(String[] args) {
        // Creating SavingsAccount object
        SavingsAccount savings = new SavingsAccount(1001, "Alice", 5000.0, 3.5);
        savings.deposit(1000);
        savings.deposit(500, "Monthly Savings");

        // Creating CurrentAccount object
        CurrentAccount current = new CurrentAccount(1002, "Bob", 3000.0, 1000.0);
        current.deposit(1500);

        System.out.println("\n--- Account Details (Polymorphism) ---");

        // Polymorphism: base class reference to subclass objects
        Account acc;

        acc = savings; // runtime polymorphism
        acc.displayAccountDetails();

        System.out.println();

        acc = current; // runtime polymorphism
        acc.displayAccountDetails();
    }
}

