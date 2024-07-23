package vn.edu.likelion.app.Day16.Lession.Thread;

public class Person2 extends Thread {

    private String name;

    public Person2(String name) {
      this.name = name;
    }

    @Override
    public void run() {
        System.out.println("T2");
        for (int i = 0; i < 50; i++) {
            System.out.println(name);
        }
    }

}
