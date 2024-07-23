package vn.edu.likelion.app.Day2.Exercise;

public class Bai4 {
    static class Vehicle {
        String brand;
        String model;
        int year;
        double fuel;
        double travaled;
        float speed;
        public Vehicle(String brand, String model, int year, double fuel, float speed, double travaled) {
            this.brand = brand;
            this.model = model;
            this.year = year;
            this.fuel = fuel;
            this.speed = speed;
            this.travaled = travaled;
        }



        public void getModel() {
            System.out.println("Model: " + model);
        }

        public void getEfficiency() {
            System.out.println("Efficiency: " + fuel + " mpg");
        }

        public void getTravaled() {
            System.out.println("Travaled: " + travaled + " miles");
        }

        public void getSpeed() {
            System.out.println("Max Speed: " + speed + " mph");        }

    }

    static class Car extends Vehicle {
        public Car(String brand, String model, int year, double fuel, float speed,  double travaled) {
            super(brand, model, year, fuel, speed,  travaled);
        }
        @Override
        public void getModel() {
            System.out.println("Car Model: " + model);
        }

        @Override
        public void getEfficiency() {
            System.out.println("Fuel Efficiency: " + fuel + " mpg");
        }

        @Override
        public void getTravaled() {
            System.out.println("Distance Travaled: " + travaled + " miles");
        }

        @Override
        public void getSpeed() {
            System.out.println("Max Speed: " + speed + " mph");
        }
    }

    static class Truck extends Vehicle {
        public Truck(String brand, String model, int year, double fuel, float speed,  double travaled) {
            super(brand, model, year, fuel, speed,  travaled );

        }
        @Override
        public void getModel() {
            System.out.println("Truck Model: " + model);
        }

        @Override
        public void getEfficiency() {
            System.out.println("Fuel Efficiency: " + fuel + " mpg");
        }

        @Override
        public void getTravaled() {
            System.out.println("Distance Travaled: " + travaled + " miles");
        }

        @Override
        public void getSpeed() {
            System.out.println("Max Speed: " + speed + " mph");
        }
    }

    static class Motorcycle extends Vehicle {
        public Motorcycle(String brand, String model, int year, double fuel, float speed, double travaled) {
            super(brand, model, year, fuel, speed,  travaled);
        }

        @Override
        public void getModel() {
            System.out.println("Motorcycle Model: " + model);
        }

        @Override
        public void getEfficiency() {
            System.out.println("Fuel Efficiency: " + fuel + " mpg");
        }

        @Override
        public void getTravaled() {
            System.out.println("Distance Travaled: " + travaled + " miles");
        }

        @Override
        public void getSpeed() {
            System.out.println("Max Speed: " + speed + " mph");
        }
    }





    public static void main(String[] args) {

        Truck truck = new Truck("TOYOTA","Tatra 810 4x4", 2024, 8.12134345435, 80.0F,  65.907437493);
        Car car = new Car("TOYOTA","Virtus", 2024, 2.355, 120.0F,  14.123123);
        Motorcycle motorcycle = new Motorcycle("SUZUKI","Warrior 200", 2024, 2.1, 80.0F,  4.41);

        truck.getModel();
        truck.getEfficiency();
        truck.getTravaled();
        truck.getSpeed();
        System.out.println("");
        car.getModel();
        car.getEfficiency();
        car.getTravaled();
        car.getSpeed();
        System.out.println("");
        motorcycle.getModel();
        motorcycle.getEfficiency();
        motorcycle.getTravaled();
        motorcycle.getSpeed();
    }
}
