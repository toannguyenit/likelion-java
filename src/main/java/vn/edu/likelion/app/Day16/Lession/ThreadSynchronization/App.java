package vn.edu.likelion.app.Day16.Lession.ThreadSynchronization;

public class App {

    public static void main(String[] args) {
        Account account = new Account("Thinh", 150);


        Thread thread1 = account;
        Thread thread2 = account;

        thread1.start();
        thread2.start();


    }

}
