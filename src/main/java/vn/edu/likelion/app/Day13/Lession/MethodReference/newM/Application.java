package vn.edu.likelion.app.Day13.Lession.MethodReference.newM;

public class Application {

    public static void main(String[] args) {
        SayHello ref = Hello::new;
        ref.display("Hello World!");
    }
}
