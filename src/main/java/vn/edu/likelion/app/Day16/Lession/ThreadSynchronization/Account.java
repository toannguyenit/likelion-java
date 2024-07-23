package vn.edu.likelion.app.Day16.Lession.ThreadSynchronization;

public class Account extends Thread {
    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public synchronized void withdraw(double amount) throws InterruptedException {
        if (amount < balance) {
            Thread.sleep(1000);
            balance -= amount;
            System.out.println(balance);
        } else System.out.println("Het tien");
    }

    @Override
    public void run() {
        try {
            this.withdraw(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
