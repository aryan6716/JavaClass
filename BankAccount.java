// ✅ QUES 1: Bank Account with Balance Security
// ✔️ What the Question is Asking:
// Create a class BankAccount with private fields:
// accountNumber
// balance
// The key point:
// Balance should not be modifiable directly.
// Instead, provide controlled methods to:
// Deposit money
// Withdraw money
// This ensures data encapsulation and avoids someone from directly changing the balance by accessing the field.

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public static void main(String[] args) {

        BankAccount account = new BankAccount("123456789", 1000.0);

        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Initial Balance: " + account.getBalance());

        account.deposit(500);
        System.out.println("Balance after deposit: " + account.getBalance());

        account.withdraw(300);
        System.out.println("Balance after withdrawal: " + account.getBalance());

        System.out.println("Final Balance: " + account.getBalance());
    }
}
