package vn.edu.likelion.app.Day6_ASM1.Model.Customer;

import java.util.ArrayList;
public class Customer {
    private String idName;
    private String fullName;
    private int age;
    private ArrayList<HireBook> hireBooks;

    public Customer() {}

    public Customer(String idName, String fullName, int age) {
        this.idName = idName;
        this.fullName = fullName;
        this.age = age;
    }

    public Customer(String idName, String fullName, int age, ArrayList<HireBook> hireBooks) {
        this.idName = idName;
        this.fullName = fullName;
        this.age = age;
        this.hireBooks = hireBooks;
    }

    public String getIdName() {
        return idName;
    }

    public void setIdName(String idName) {
        this.idName = idName;
    }

    public void showInfomation(){
        System.out.println("Full Name: " + fullName);
        System.out.println("Age: " + age);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<HireBook> getHireBooks() {
        return hireBooks;
    }

    public void setHireBooks(ArrayList<HireBook> hireBooks) {
        this.hireBooks = hireBooks;
    }

    public void showInformation(){
        System.out.println("=---------------------------------------------------------------=");
        System.out.println("=                    CHI TIET KHACH HANG                        =");
        System.out.println("=---------------------------------------------------------------=");
        System.out.printf("%-5s %-10s %-25s %-5s %-10s%n", "STT", "Id", "FullName", "Age", "HireBooks");
        System.out.printf("%-5s %-10s %-25s %-5d %-10s%n", 0, idName, fullName, age, this.getHireBooksToString());
        System.out.println("=---------------------------------------------------------------=");
    }

    public String getHireBooksToString(){
        String returnString = "";
        if (hireBooks != null && !hireBooks.isEmpty()){
            for (HireBook hireBook : hireBooks) {
                returnString += hireBook.getIdBook() + "-"+ hireBook.getQuantity()+",";
            }
        }
        else {
            returnString = "Chưa thuê";
        }
        return returnString;
    }
}
