package vn.edu.likelion.app.Day16.Lession.Thread;

public class App {

    private static Long getCurrentCPU() {
        return java.lang.management
                .ManagementFactory
                .getThreadMXBean()
                .getThreadCpuTime(Thread.currentThread().getId());
    }

    public static void main(String[] args) {

        Runnable run = new Person("Tan");
        Thread t1 = new Thread(run);
        Thread t2 = new Person2("Thinh");

        t1.setPriority(3);
        t1.start();
        t2.start();

//        System.out.println("Thread " + Thread.currentThread().getName()
//                           + " is running on CPU core: " + getCurrentCPU());



    }
}
