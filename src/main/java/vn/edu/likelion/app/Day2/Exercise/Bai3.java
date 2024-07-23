package vn.edu.likelion.app.Day2.Exercise;

import java.math.BigDecimal;

public class Bai3
{
    static class Employee{
        String name;
        int age;
        String address;
        BigDecimal salary;
        String postition;
        String performance;

        public Employee(int age, String name, String address, BigDecimal salary, String postition, String performance) {
            this.age = age;
            this.name = name;
            this.address = address;
            this.salary = salary;
            this.postition = postition;
            this.performance = performance;
        }

        public void getBonusSalary() {
            System.out.println("Bonus Salary: " + salary);
        }
        public void reportWork() {
            System.out.println("Performance report for Emloyee do: Normal");
        }
        public void description(){
            System.out.println("Employee is ... ");
        }
    }

    static class Manager extends Employee{

        public Manager(int age, String name, String address, BigDecimal salary, String postition, String performance) {
            super(age, name, address, salary, postition, performance);
        }

        @Override
        public void getBonusSalary() {
            System.out.println("Manager'Bonus Salary: $" + salary);
        }

        @Override
        public void reportWork(){
            System.out.println("Performance report for Manager "+ this.name +" do: " +this.performance);
        }

        @Override
        public void description(){
            System.out.println("Manager " +this.name+" is managing project ");
        }

    }

    static class Developer extends Employee{
        public Developer(int age, String name, String address, BigDecimal salary, String postition, String performance) {
            super(age, name, address, salary, postition, performance);
        }
        @Override
        public void getBonusSalary() {
            System.out.println("Developer'Bonus Salary: $" + salary);
        }

        @Override
        public void reportWork() {
            System.out.println("Performance report for Developer "+ this.name +" do: " + this.performance);
        }
        @Override
        public void description(){
            System.out.println("Developer " + this.name + " is code in Java ");
        }
    }

    static class Programmer extends Employee{

        public Programmer(int age, String name, String address, BigDecimal salary, String postition, String performance) {
            super(age, name, address, salary, postition, performance);
        }
        @Override
        public void getBonusSalary() {
            System.out.println("Programmer'Bonus Salary: $" + salary);
        }
        @Override
        public void reportWork() {
            System.out.println("Performance report for Programmer "+ this.name +" do: " + this.performance);
        }
        @Override
        public void description(){
            System.out.println("Programmer " +this.name+" is debugging code in Python ");
        }
    }

    public static void main(String[] args) {
        Manager manager = new Manager(28, "Toan", "Thu Duc", new BigDecimal("7000.0"), "Manager", "Excellent");
        Developer developer = new Developer(26, "Tan", "Tan Binh", new BigDecimal("4000.0"), "Developer", "Excellent");
        Programmer programmer = new Programmer(25, "Kien", "Thu Duc", new BigDecimal("4000.0"), "Programmer", "Excellent");

        manager.getBonusSalary();
        developer.getBonusSalary();
        programmer.getBonusSalary();
        System.out.println("");

        manager.reportWork();
        developer.reportWork();
        programmer.reportWork();
        System.out.println("");

        manager.description();
        developer.description();
        programmer.description();
        System.out.println("");
    }
}
