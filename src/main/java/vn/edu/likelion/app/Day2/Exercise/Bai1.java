package vn.edu.likelion.app.Day2.Exercise;
public class Bai1 {
    static class Vehicle {
        String name;
        int speed;
        public Vehicle(String name, int speed){
            this.name = name;
            this.speed =speed;
        }
        public void speeUp( ){
            speed +=1;
        }
    }
    static class Car extends Vehicle {
        public Car(String name, int speed){
            super(name, speed);
        }
        @Override
        public void speeUp(){
            speed += 20;
        }
    }
    static class Bicycle extends Vehicle {
        public Bicycle(String name,int speed){
            super(name, speed);
        }
        @Override
        public void speeUp(){
            speed += 5;
        }
    }

    public static void main(String[] args) {
        Car car = new Car("Lexus",20);
        System.out.println("Toc do ban dau cua xe " + car.name + " : " + car.speed + " km/h");
        car.speeUp();
        System.out.println("Toc do sau khi tang toc cua xe " + car.name + " : " + car.speed + " km/h");

        Bicycle bicycle = new Bicycle("Winner X", 5);
        System.out.println("Toc do cua xe " + bicycle.name + " : " + bicycle.speed + " km/h");
        bicycle.speeUp();
        System.out.println("Toc do sau khi tang toc cua xe " + bicycle.name + " : " + bicycle.speed + " km/h");

    }
}