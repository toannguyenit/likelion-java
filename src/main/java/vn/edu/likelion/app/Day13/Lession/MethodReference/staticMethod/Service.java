package vn.edu.likelion.app.Day13.Lession.MethodReference.staticMethod;

public class Service {
    public static int tinhTong(int x, int y) {
        return x + y;
    }
    public static void main(String[] args) {
        int x =5, y =10;
        int z = toDo(x, y, Service::tinhTong);
        System.out.println(z);

    }
    public static int toDo(int x, int y, MRInterface s) {
        return s.timXY(x, y);
    }
}
