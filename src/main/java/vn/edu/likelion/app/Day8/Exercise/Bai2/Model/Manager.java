package vn.edu.likelion.app.Day8.Exercise.Bai2.Model;

import vn.edu.likelion.app.Day8.Exercise.Bai2.Service.Employee;

import java.math.BigDecimal;

public class Manager extends Employee {
    public Manager(String name) {
        super(name);
    }

    public Manager(String name, BigDecimal salary) {
        super(name, salary);
    }

    public Manager(String name, BigDecimal salary, BigDecimal bonus) {
        super(name, salary, bonus);
    }

    @Override
    public void calculateBonus() {

    }

    @Override
    public void displayinfo() {
        System.out.println("Manager Name: " + this.getName());
        System.out.println("Base Salary: $" + this.getSalary());
        System.out.println("Bonus: $" + this.getBonus());
        System.out.println("Total Salary: $" + (this.getSalary().add(this.getBonus()) ));
    }
}
