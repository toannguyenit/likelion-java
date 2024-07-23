package vn.edu.likelion.app.Day11.Lession.DefaultAndStatic;

public interface setColor2 {
    default void setColor() {
        System.out.println("This is setColor2");
    }

    static void run(){
        System.out.println("Running setColor2");
    }
}
