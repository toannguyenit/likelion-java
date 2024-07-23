package vn.edu.likelion.app.Day16.Exercise.Bai1;

public class EvenNumber extends Thread {
    static private int count = 2;
    @Override
    public void run() {
        while (count <= 20) {
            if (count % 2 == 0) {
                System.out.println("Even number from evenThread: " + count);
            }
            count+=2;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
