package vn.edu.likelion.app.Day10.Bai1.Model;

import vn.edu.likelion.app.Day10.Bai1.Abstract.Vehicle;

public class Car  extends Vehicle {
    private int numberOfDoor;

    public Car(int id) {
        super(id);
    }

    @Override
    public void move() {
        System.out.println("Car is moving");
    }
}
