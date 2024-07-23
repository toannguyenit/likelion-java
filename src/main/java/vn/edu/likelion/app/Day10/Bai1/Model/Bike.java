package vn.edu.likelion.app.Day10.Bai1.Model;

import vn.edu.likelion.app.Day10.Bai1.Abstract.Vehicle;

public class Bike extends Vehicle {

    private boolean hasGear;

    public Bike(int id) {
        super(id);
    }

    @Override
    public void move() {
        System.out.println("Bike is moving");
    }
}
