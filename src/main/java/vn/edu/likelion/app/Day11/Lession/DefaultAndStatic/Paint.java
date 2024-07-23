package vn.edu.likelion.app.Day11.Lession.DefaultAndStatic;

public class Paint implements setColor1{

    @Override
    public void setColor() {
        setColor1.super.setColor();
    }

    public static void main(String[] args) {
//        Paint paint = new Paint();

        setColor1.run();
    }
}
