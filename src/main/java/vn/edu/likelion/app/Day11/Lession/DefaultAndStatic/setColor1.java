package vn.edu.likelion.app.Day11.Lession.DefaultAndStatic;

public interface setColor1 {
    default void setColor() {
        System.out.println("This is setColor1");
    }

    static void run(){
        System.out.println("Running setColor1");
    }
}
