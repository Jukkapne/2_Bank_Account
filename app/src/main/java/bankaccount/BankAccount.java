package bankaccount;

public class BankAccount {
    private String accountNumber;
    private double balance;

    // Constructor to initialize accountNumber and balance
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Default constructor (optional, but may be needed)
    public BankAccount() {
        this.accountNumber = "";
        this.balance = 0.0;
    }

    // Other methods...

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    public void displayBalance() {
        System.out.println("Current balance: " + balance);
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
