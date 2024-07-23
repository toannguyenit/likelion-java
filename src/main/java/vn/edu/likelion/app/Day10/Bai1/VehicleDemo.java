package vn.edu.likelion.app.Day10.Bai1;

import vn.edu.likelion.app.Day10.Bai1.Abstract.Vehicle;
import vn.edu.likelion.app.Day10.Bai1.Model.Bike;
import vn.edu.likelion.app.Day10.Bai1.Model.Car;

import java.util.ArrayList;

public class VehicleDemo {


    public static void main(String[] args) {

        // Khởi tạo đối tượng Car & Bike
        Car car = new Car(1);
        Bike bike = new Bike(1);

        // Tạo một mảng các đối tượng Vehicle bao gồm cả Car và Bike
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(bike);

        // Gọi phương thức move() cho từng đối tượng trong mảng để thể hiện tính đa hình;
        for (Vehicle vehicle : vehicles) {
            vehicle.move();
        }

        // Hiển thị số lượng Vehicle được tạo ra
        System.out.println("Số lượng Vehicle: " + Vehicle.getCount() + " vehicles");

    }
}
