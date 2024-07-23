package vn.edu.likelion.app.Day6_ASM1.Service;

import vn.edu.likelion.app.Day6_ASM1.Model.Book.Book;
import vn.edu.likelion.app.Day6_ASM1.Model.Customer.Customer;

import java.util.ArrayList;

public interface InterfaceCustomer {

    public void hireBook(String idNameCustomer, int quantity, String idNameBook, ArrayList<Book> bookArrayList, int daysQuantity);

    public  void addCustomer(Customer customers);

    public void showCustomersDisplay();

    public void updateCustomer(Customer customer);

    public Customer findCustomerByIdName(String idName);

    public void returnBook(String idNameCustomer, String idNameBook, ArrayList<Book> bookArrayList, int quantityReturn);

}
