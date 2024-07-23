package vn.edu.likelion.app.Day16.Lession.Thread;

public class Person implements  Runnable{

    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("T1");
        for (int i = 0; i < 50; i++) {
            System.out.println(name);
        }
    }
}
