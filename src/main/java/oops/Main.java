package oops;

public class Main {

    public static void main(String[] args) {
        BankAccount account = new BankAccount(10000);

        System.out.println("Initial Balance: ₹" + account.getBalance());

        account.deposit(5000);

        System.out.println("Balance: ₹" + account.getBalance());

        account.withdraw(3000);

        System.out.println("Balance: ₹" + account.getBalance());

        // Trying to withdraw more than balance
        account.withdraw(20000);

        System.out.println("Final Balance: ₹" + account.getBalance());
    }
}
