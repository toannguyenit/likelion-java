package vn.edu.likelion.app.Day8.Exercise.Bai2.Service;

import java.math.BigDecimal;

public abstract class Employee {
    private String name;
    private BigDecimal salary = BigDecimal.ZERO;
    private BigDecimal bonus = BigDecimal.ZERO;

    public Employee(String name) {
    }

    public Employee(String name, BigDecimal salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee(String name, BigDecimal salary, BigDecimal bonus) {
        this.name = name;
        this.salary = salary;
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public BigDecimal getBonus() {
        return bonus;
    }

    public void setBonus(BigDecimal bonus) {
        this.bonus = bonus;
    }

    public abstract void calculateBonus();

    public abstract void displayinfo();

}
