package Codeing_Que_EXAM2_OOPS_Concepts;
//Bank Account Encapsulation
//Create a BankAccount class with private balance field. Implement deposit(), withdraw(), and getBalance() methods with proper validation.
public class Q4 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        account.deposit(500);
        account.withdraw(200);
        account.withdraw(1500); // Should show insufficient balance
        account.deposit(-100);  // Invalid deposit
        account.withdraw(-50);  // Invalid withdraw

        System.out.println("Current Balance: " + account.getBalance());
    }
}
class BankAccount {
    private double balance;

    // Constructor to initialize balance (optional)
    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be negative. Setting balance to 0.");
            this.balance = 0;
        }
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Withdraw amount must be positive.");
        }
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }
}

//Deposited: 500.0
//Withdrawn: 200.0
//Insufficient balance.
//Deposit amount must be positive.
//Withdraw amount must be positive.
//Current Balance: 1300.0

//Process finished with exit code 0