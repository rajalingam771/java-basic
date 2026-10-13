package threads;

class BankAccount {

    private int balance = 1000;

    public synchronized void withdraw(int amount) {

        System.out.println(
                Thread.currentThread().getName() +
                        " is trying to withdraw ₹" + amount
        );

        if (balance >= amount) {

            System.out.println("Balance before withdrawal: ₹" + balance);

            balance = balance - amount;

            System.out.println(
                    Thread.currentThread().getName() +
                            " successfully withdrew ₹" + amount
            );

            System.out.println("Remaining balance: ₹" + balance);

        } else {

            System.out.println(
                    Thread.currentThread().getName() +
                            " - Insufficient balance"
            );
        }
    }
}

class WithdrawTask extends Thread {

    private BankAccount account;

    public WithdrawTask(BankAccount account, String name) {
        super(name);
        this.account = account;
    }

    @Override
    public void run() {
        account.withdraw(700);
    }
}

public class Synchronization {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        WithdrawTask t1 =
                new WithdrawTask(account, "Thread 1");

        WithdrawTask t2 =
                new WithdrawTask(account, "Thread 2");

        t1.start();
        t2.start();
    }
}

//Synchronization is used to control access to shared resources.
// It ensures that only one thread can execute the synchronized critical section at a time for the same object.