package vn.edu.likelion.app.Day8.Exercise.Bai1.Model.Bank;


import vn.edu.likelion.app.Day8.Exercise.Bai1.Model.Customer.CurrentAccount;
import vn.edu.likelion.app.Day8.Exercise.Bai1.Model.Customer.SavingAccount;
import vn.edu.likelion.app.Day8.Exercise.Bai1.Service.BankService;

import java.util.ArrayList;
import java.util.List;

public class Bank implements BankService {

    private static List<CurrentAccount> currentAccounts = new ArrayList<>();
    private static List<SavingAccount> savingAccounts = new ArrayList<>();

    public Bank() {}

    public static List<SavingAccount> getSavingAccounts() {
        return savingAccounts;
    }

    public static void setSavingAccounts(List<SavingAccount> savingAccounts) {
        Bank.savingAccounts = savingAccounts;
    }

    @Override
    public void insertCurrentAccount(CurrentAccount currentAccount) {
        currentAccount.setId("ID" + (currentAccounts.size() + 1));
        currentAccounts.add(currentAccount);
    }

    @Override
    public void updateCurrentAccount(CurrentAccount currentAccount, String id) {
        for(CurrentAccount account : currentAccounts) {
            if (account.getId().equals(id)) {
                account.setName(currentAccount.getName());
                account.setAge(currentAccount.getAge());
                account.setAddress(currentAccount.getAddress());
            }
        }
    }

    @Override
    public void deleteCurrentAccount(String id) {
        List<CurrentAccount> currentAccountsExample = new ArrayList<>();
        for (CurrentAccount account : currentAccounts) {
            currentAccountsExample.add(account);
        }

        for (CurrentAccount account : currentAccountsExample) {
            if (account.getId().equals(id)) {
                currentAccountsExample.remove(account);
            }
        }
    }

    @Override
    public void showCurrentAccounts() {
        int stt = 1;
        System.out.printf("%-5s %-10s %-25s %-5s %-25s %-10s %-15s%n", "STT", "Id", "FullName", "Age", "Address", "Balance", "CreatedAt");
        for (CurrentAccount account : currentAccounts) {
            System.out.printf("%-5d %-10s %-25s %-5d %-25s %-10s %-15s%n", stt, account.getId(), account.getName(), account.getAge(), account.getAddress(), account.getBalance(), account.getCreated());
            stt++;
        }
    }

    @Override
    public CurrentAccount findCurrentAccount(String id) {
        CurrentAccount currentAccount = null;
        for (CurrentAccount account : currentAccounts) {
            if (account.getId().equals(id)) {
                currentAccount = account;
            }
        }
        return currentAccount;
    }
}
