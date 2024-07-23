package vn.edu.likelion.app.Day16.Exercise.Bai1;

public class App  {
    static private int step = 0;

    public static void main(String[] args) {
        Runnable runnable1 = new EvenNumber();
        Runnable runnable2 = new OddNumber();
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread2.start();
        thread1.start();


    }

}
