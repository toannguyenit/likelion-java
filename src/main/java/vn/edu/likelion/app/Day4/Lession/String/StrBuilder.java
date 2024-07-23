package vn.edu.likelion.app.Day4.Lession.String;

public class StrBuilder implements Runnable{

    StringBuilderLession str = new StringBuilderLession();

    @Override
    public void run() {
//        str.append(Thread.currentThread().getName());
    }


    public static void main(String[] args) {
        Thread thread1 = new Thread(new StrBuilder(), "Thread 1");

        Thread thread2 = new Thread(new StrBuilder(), "Thread 2");
    }



}
