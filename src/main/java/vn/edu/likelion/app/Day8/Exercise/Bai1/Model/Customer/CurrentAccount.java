package vn.edu.likelion.app.Day8.Exercise.Bai1.Model.Customer;

import vn.edu.likelion.app.Day8.Exercise.Bai1.Service.CustomerService;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class CurrentAccount implements CustomerService {
    private String id;
    private String name = "No Name";
    private int age = 0;
    private String address = "No Address";
    private BigDecimal balance = BigDecimal.ZERO;
    private BigDecimal overdraftLimit = new BigDecimal(1000);
    private List<SavingAccount> currentSavingAccounts;
    private LocalDateTime created = LocalDateTime.now();

    public CurrentAccount() {
    }


    public CurrentAccount(String name, int age, String address, BigDecimal balance) {
        this.id =
                this.name = name;
        this.age = age;
        this.address = address;
        this.balance = balance;
    }

    public CurrentAccount(String id, String name, int age, String address, BigDecimal balance, LocalDateTime created) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.balance = balance;
        this.created = created;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(BigDecimal overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }


    @Override
    public void withdraw(BigDecimal money) {
        System.out.println("Now withdraw $" + money + " to Current Account.");
        this.balance = balance.subtract(money);
    }

    public void deposit(BigDecimal money) {
        System.out.println("Now deposit $" + money + " to Current Account.");
        this.balance = balance.add(money);
    }


    public void interestRate() {

    }

    public void transfer(String id, BigDecimal money) {

    }

    public void showDetail() {
        System.out.println("""
                                   Thong tin chi tiet khach hang:
                                   ID:  """ + id + """
                                   Tên:  """ + name + """
                                   Tuổi:  """ + age + """
                                   Địa chỉ:  """ + address + """
                                   Balance:  """ + balance + """
                                   Danh sách tài khoản tiết kiệm
                                   """);
        int stt = 1;
        System.out.printf("%-5s %-10s %-25s%n", "STT", "Balance", "CreatedAt");
        for (SavingAccount account : currentSavingAccounts) {
            System.out.printf("%-5d %-10s %-25s%n", stt, account.getSavingBalance());
            stt++;
        }
    }

    public void addSavingAccount(SavingAccount savingAccount, String id) {
        String idSavingAccount = id + "-S" + (currentSavingAccounts.size() + 1);
        savingAccount.setId(idSavingAccount);
        currentSavingAccounts.add(savingAccount);
    }


}
