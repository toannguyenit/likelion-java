package vn.edu.likelion.app.Day11.Lession.ThisAndSuper;

public class Dog extends Animal {
    public Dog() {
//        super();
        System.out.println("Dog");
    }

    @Override
    void showRun() {
        System.out.println("Run Run");
    }
}
