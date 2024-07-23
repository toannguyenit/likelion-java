package vn.edu.likelion.app.Day8.Exercise.Bai1.Service;

import vn.edu.likelion.app.Day8.Exercise.Bai1.Model.Customer.CurrentAccount;

public interface BankService {
    void insertCurrentAccount(CurrentAccount currentAccount);
    void updateCurrentAccount(CurrentAccount currentAccount, String id);
    void deleteCurrentAccount(String id);
    void showCurrentAccounts();
    CurrentAccount findCurrentAccount(String id);
}
