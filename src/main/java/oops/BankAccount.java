package oops;

public class BankAccount {
    private double balance;
    //constutr
    public BankAccount(double initalBalance){
        balance=initalBalance;
    }
    // Deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited: ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }
    // Withdraw money
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
        }
        else if (amount > balance) {
            System.out.println("Insufficient balance");
        }
        else {
            balance = balance - amount;
            System.out.println("Withdrawn: ₹" + amount);
        }
    }

    // Getter method
    public double getBalance() {
        return balance;
    }
}
