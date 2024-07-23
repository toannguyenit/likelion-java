package vn.edu.likelion.app.Day8.Exercise.Bai2.Model;

import vn.edu.likelion.app.Day8.Exercise.Bai2.Service.Employee;

import java.math.BigDecimal;

public class ITEmployee extends Employee {
    private int overtimeHours = 0;
    private BigDecimal hourlyRate = BigDecimal.ZERO;


    public ITEmployee(String name) {
        super(name);
    }

    public ITEmployee(String name, BigDecimal salary) {
        super(name, salary);
    }

    public ITEmployee(String name, BigDecimal salary, BigDecimal bonus) {
        super(name, salary, bonus);
    }

    public int getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    public BigDecimal getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(BigDecimal hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public void calculateBonus() {
        BigDecimal bonus = hourlyRate.multiply(new BigDecimal(overtimeHours));
        this.setBonus(bonus);
    }

    @Override
    public void displayinfo() {
        System.out.println("Programmer Name: " + this.getName());
        System.out.println("Base Salary: $" + this.getSalary());
        System.out.println("Overtime Hours: " + this.getOvertimeHours());
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Total Salary: $" + (this.getSalary().add(this.getBonus()) ));

    }
}
