package vn.edu.likelion.app.Day6_ASM1.Model.Customer;

import java.time.LocalDateTime;

public class HireBook {

    String idBook;
    int daysHire;
    LocalDateTime dateTime;
    int quantity;

    public HireBook(){}

    public HireBook(String idBook, int daysHire, LocalDateTime dateTime, int quantity) {
        this.idBook = idBook;
        int daysHired = daysHire;
        this.dateTime = dateTime;
        this.quantity = quantity;
    }

    public int getDaysHire() {
        return daysHire;
    }

    public void setDaysHire(int daysHire) {
        this.daysHire = daysHire;
    }

    public String getIdBook() {
        return idBook;
    }

    public void setIdBook(String idBook) {
        this.idBook = idBook;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
