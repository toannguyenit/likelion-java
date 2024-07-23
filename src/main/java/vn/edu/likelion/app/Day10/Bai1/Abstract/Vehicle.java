package vn.edu.likelion.app.Day10.Bai1.Abstract;

public abstract class Vehicle {
    private String name;
    private final int id;
    static int count;

    public Vehicle(int id) {
        this.id = id;
        count++;
    }

    public abstract void move();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Vehicle.count = count;
    }
}