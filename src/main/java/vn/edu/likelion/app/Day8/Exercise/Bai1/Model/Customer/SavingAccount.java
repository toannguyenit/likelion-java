package vn.edu.likelion.app.Day8.Exercise.Bai1.Model.Customer;

import vn.edu.likelion.app.Day8.Exercise.Bai1.Service.CustomerService;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class SavingAccount  {

    private String id;
    private BigDecimal savingBalance = BigDecimal.ZERO;
    private int month;
    private float interestRate;
    private LocalDateTime creationTime = LocalDateTime.now();

    public SavingAccount() {}

    public SavingAccount(BigDecimal savingBalance, float interestRate) {
        this.savingBalance = savingBalance;
        this.interestRate = interestRate;
    }

    public SavingAccount(BigDecimal savingBalance, int month, LocalDateTime creationTime) {
        this.savingBalance = savingBalance;
        this.month = month;
        this.creationTime = creationTime;
    }

    public SavingAccount(String id, BigDecimal savingBalance, int month, LocalDateTime creationTime) {
        this.id = id;
        this.savingBalance = savingBalance;
        this.month = month;
        this.creationTime = creationTime;
    }

    public float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getSavingBalance() {
        return savingBalance;
    }

    public void setSavingBalance(BigDecimal savingBalance) {
        this.savingBalance = savingBalance;
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(LocalDateTime creationTime) {
        this.creationTime = creationTime;
    }

    public void deposit(BigDecimal money) {
        System.out.println("Now deposit $" +money+ " to Savings Account.");
        this.savingBalance = savingBalance.add(money);
    }

    public void withdraw(BigDecimal money) {
        System.out.println("Now withdraw $" +money+ " to Savings Account.");
        this.savingBalance = savingBalance.subtract(money);
    }

}
