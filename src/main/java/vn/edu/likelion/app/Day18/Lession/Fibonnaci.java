package vn.edu.likelion.app.Day18.Lession;

public class Fibonnaci {


    public static void main(String[] args) {

        int number = 10;
        for (int i = 0; i < number; i++) {
            System.out.println(fibonnaci(i));
        }
    }

    public static int fibonnaci(int n) {
        if (n <= 1) {
            return n;
        }

        return fibonnaci(n - 1) + fibonnaci(n - 2);

    }
}
