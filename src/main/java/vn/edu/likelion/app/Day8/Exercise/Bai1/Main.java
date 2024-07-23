package vn.edu.likelion.app.Day8.Exercise.Bai1;

import vn.edu.likelion.app.Day8.Exercise.Bai1.Model.Bank.Bank;
import vn.edu.likelion.app.Day8.Exercise.Bai1.Model.Customer.CurrentAccount;
import vn.edu.likelion.app.Day8.Exercise.Bai1.Model.Customer.SavingAccount;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    // Initial intance
    private static Bank bank = new Bank();
    private static Scanner scanner = new Scanner(System.in);

    // Method
    private static void showFunctionDisplay() {
        System.out.println("""
                =------------------------------------------=
                +         QUẢN LÝ NGÂN HÀNG                +
                =------------------------------------------=
                +           TÀI KHOẢN HIỆN TẠI
                + 11. Xem danh sách tài khoản hiện tại
                + 12. Thêm tài khoản hiện tại
                + 13. Xem chi tiết tài khoản hiện tại
                + 14. Gửi tiền
                + 15. Rút tiền
                + 16. Tính lãi
                +
                +          TÀI KHOẢN TIẾT KIỆM
                + 21. Xem danh sách tài khoản tiết kiệm
                + 22. Thêm tài khoản tiết kiệm
                + 23. Xem chi tiết tài khoản tiết kiệm
                + 24. Gửi tiền
                + 25. Rút tiền
                + 26. Tính lãi
                =------------------------------------------=
                
                + 30. Output
                + 0. Thoat
                """);
    }

    private static int inputFunctionCodeNumber() {
        try {
            int functionCodeNumber = Integer.parseInt(scanner.next());
            scanner.nextLine();
            return functionCodeNumber;
        } catch (RuntimeException e) {
            System.out.println("Loi: " + e.getMessage());
            return -1;
        }
    }

    /**
     *
     * All function for CurrentCustomer
     */
    private static void addCurrentCustomer(){

        System.out.print("Vui long nhap ten khach hang: ");
        String name = scanner.nextLine();

        System.out.print("Vui long nhap tuoi khach hang: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Vui long nhap dia chi: ");
        String address = scanner.nextLine();

        System.out.print("Vui long nhap so tien ban dau: ");
        BigDecimal balance = scanner.nextBigDecimal();

        CurrentAccount currentAccount = new CurrentAccount( name, age, address, balance );
        System.out.println("Thong tin khach hang moi: "
                           + currentAccount.getName() + " - "
                           + currentAccount.getAge() + " - "
                           + currentAccount.getAddress() + " - "
                           + currentAccount.getBalance() + "$");

        bank.insertCurrentAccount(currentAccount);
        System.out.println("Them khach hang moi thanh cong");
    }

    private static void showCurrentCustomerDisplay() {
        bank.showCurrentAccounts();
    }


    private static void showSavingCustomerDisplay() {

    }

    private static void addSavingAccount(){
        System.out.println("Vui long nhap ma khach hang: ");
        String id = scanner.nextLine();

        System.out.println("Vui long nhap so tien muon gui: ");
        BigDecimal balance = scanner.nextBigDecimal();

        System.out.println("Vui long nhap thoi gian muon gui (theo thang): ");
        int month = scanner.nextInt();
        scanner.nextLine();
    }


    private static void printOutput(){
        SavingAccount savingAccount =
                new SavingAccount(new BigDecimal(1000.00), 1.25F);

        System.out.println("Saving Account:");
        System.out.println("Inital Deposit: $" + savingAccount.getSavingBalance());
        System.out.println("Interest rate: " + savingAccount.getInterestRate() + "%");
        System.out.println();

        CurrentAccount currentAccount =
                new CurrentAccount("Song Toan", 28, "Thu Duc", new BigDecimal(5000.00));
        System.out.println("Current Account:");
        System.out.println("Inital Deposit: $" + currentAccount.getBalance());
        System.out.println("OverdraftLimit: $" + currentAccount.getOverdraftLimit());
        System.out.println();

        savingAccount.deposit(new BigDecimal(100));
        currentAccount.deposit(new BigDecimal(500));
        savingAccount.withdraw(new BigDecimal(150));
        System.out.println();

        System.out.println("Savings A/c and Current A/c.:");
        System.out.println("Account balance: $" + savingAccount.getSavingBalance());
        System.out.println("Account balance: $" + currentAccount.getBalance());
        System.out.println();

        System.out.println("After applying interest on Savings A/c for 1 year:");
        System.out.println("Savings A/c and Current A/c.:");
        BigDecimal savingInterestRate =
                savingAccount.getSavingBalance().
                        add(savingAccount.getSavingBalance()
                        .multiply(new BigDecimal(savingAccount.getInterestRate())
                                .divide(new BigDecimal(100))));
        System.out.println("Account balance: $" +  savingInterestRate);
        System.out.println("Account balance: $" + currentAccount.getBalance());
        System.out.println();
    }

    public static void main(String[] args) {
        // Init database
        bank.insertCurrentAccount(new CurrentAccount("Song Toan", 28, "Thu Duc", new BigDecimal(2000) ));


        int functionCodeNumber = -1;
        while (functionCodeNumber != 0) {
            showFunctionDisplay();
            System.out.print("Vui long chon chuc nang: ");
            int inputFunctionCodeNumber = inputFunctionCodeNumber();
            functionCodeNumber = inputFunctionCodeNumber;
            switch (functionCodeNumber) {
                case 11:
                    showCurrentCustomerDisplay();
                    break;
                case 12:
                    addCurrentCustomer();
                    break;
                case 13:
                    break;
                case 14:
                    break;
                case 15:
                    break;
                case 16:
                    break;


                case 21:
                    break;
                case 22:
                    addSavingAccount();
                    break;
                case 23:
                    break;
                case 24:
                    break;
                case 25:
                    break;
                case 26:
                    break;

                case 30:
                    printOutput();
                    break;


                case 0:
                    System.out.println("Dang thoat chuong trinh!!!!");
                    break;
                default:
                    functionCodeNumber = -1;
                    break;
            }
        }

    }
}
