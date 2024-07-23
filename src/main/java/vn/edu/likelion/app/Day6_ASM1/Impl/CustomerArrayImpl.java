package vn.edu.likelion.app.Day6_ASM1.Impl;

import vn.edu.likelion.app.Day6_ASM1.Model.Book.Book;
import vn.edu.likelion.app.Day6_ASM1.Model.Customer.Customer;
import vn.edu.likelion.app.Day6_ASM1.Model.Customer.HireBook;
import vn.edu.likelion.app.Day6_ASM1.Service.InterfaceCustomer;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class CustomerArrayImpl implements InterfaceCustomer {
    static ArrayList<Customer> customers;

    public CustomerArrayImpl() {
    }

    public CustomerArrayImpl(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    @Override
    public void hireBook(String idNameCustomer, int quantity, String idNameBook, ArrayList<Book> bookArrayList, int daysQuantity) {
        Customer customer = findCustomerByIdName(idNameCustomer);
        if (customer.getFullName() == null) {
            System.out.println("Khach hang khong ton tai");
            return;
        }
        if (customer.getAge() < 16) {
            throw new ArithmeticException("The customer age must be at least 16 years");
        }
        ArrayList<HireBook> hireBooks = customer.getHireBooks();
        if (hireBooks == null) {
            hireBooks = new ArrayList<>();
            customer.setHireBooks(hireBooks); // Ensure the customer object is updated with the new list
        }

        for (Book book : bookArrayList) {
            if (book.getIdName().equals(idNameBook)) {
                HireBook hireBook = new HireBook();
                hireBook.setIdBook(book.getIdName());
                int quantityBookCurrent = book.getQuantity();
                if (quantityBookCurrent < quantity) {
                    throw new ArithmeticException("So luong thue qua muc ton kho, phai < " + quantityBookCurrent);
                }
                hireBook.setQuantity(quantity);
                hireBook.setDaysHire(daysQuantity);
                hireBook.setDateTime(LocalDateTime.now());
                hireBooks.add(hireBook);
            }
        }
        customer.setHireBooks(hireBooks);
        for (Customer customerCurrent : customers) {
            if (customerCurrent.getIdName().equals(idNameCustomer)) {
                System.out.println("Ma Sach: " + customer.getHireBooksToString());
                customerCurrent.setHireBooks(hireBooks);
            }
        }

        System.out.println("Da thue thanh cong!");
    }

    @Override
    public void addCustomer(Customer customerExample) {
        Customer customer = new Customer();
        if (customerExample.getIdName().length() > 5) {
            throw new ArithmeticException("Ten ID phai < 5 ky tu!");
        }
        if (customerExample.getFullName().length() > 25) {
            throw new ArithmeticException("Ten khach hang phai < 25 ky tu!");
        }

        customer.setIdName(customerExample.getIdName());
        customer.setFullName(customerExample.getFullName());
        customer.setAge(customerExample.getAge());
        customers.add(customer);
    }

    @Override
    public void showCustomersDisplay() {
        if (customers == null) {
            System.out.println("Khach hang khong ton tai");
            return;
        }
        int stt = 1;
        System.out.println("=---------------------------------------------------------------=");
        System.out.println("=                    DANH SACH KHACH HANG                       =");
        System.out.println("=---------------------------------------------------------------=");
        System.out.printf("%-5s %-10s %-25s %-5s %-20s %n", "STT", "Id", "FullName", "Age", "Hire Books");
        for (Customer customer : customers) {
            String hireBooks = customer.getHireBooksToString();
            System.out.printf("%-5d %-10s %-25s %-5d %-20s%n", stt, customer.getIdName(), customer.getFullName(), customer.getAge(), hireBooks);
            stt++;
        }
        System.out.println("=---------------------------------------------------------------=");
    }

    @Override
    public void updateCustomer(Customer customerExample) {
        for (Customer customersCurrent : customers) {
            if (customersCurrent.getIdName().equals(customerExample.getIdName())) {
                if (customerExample.getIdName().length() > 5) {
                    throw new ArithmeticException("Ten ID phai < 5 ky tu!");
                }
                if (customerExample.getFullName().length() < 25) {
                    throw new ArithmeticException("Ten khach hang phai < 25 ky tu!");
                }


                if (!(customerExample.getFullName().equals("0"))) {
                    customersCurrent.setFullName(customerExample.getFullName());
                }
                if (!(customerExample.getAge() == 0)) {
                    customersCurrent.setAge(customerExample.getAge());
                }
            }
        }
    }

    @Override
    public Customer findCustomerByIdName(String idName) {
        if (idName.length() > 5) {
            throw new ArithmeticException("Ten ID phai < 5 ky tu!");
        }
        Customer customer = new Customer();
        for (Customer c : customers) {
            if (c.getIdName().equals(idName)) {
                customer.setIdName(c.getIdName());
                customer.setFullName(c.getFullName());
                customer.setAge(c.getAge());
                customer.setHireBooks(c.getHireBooks());
            }
        }

        return customer;
    }

    @Override
    public void returnBook(String idNameCustomer, String idNameBook, ArrayList<Book> bookArrayList, int quantityReturn) {
        Customer customer = findCustomerByIdName(idNameCustomer);
        if (customer.getFullName() == null) {
            System.out.println("Khach hang khong ton tai");
            return;
        }
        ArrayList<HireBook> hireBooks = customer.getHireBooks();
        if (hireBooks == null) {
            hireBooks = new ArrayList<>();
            customer.setHireBooks(hireBooks); // Ensure the customer object is updated with the new list
        } else {
            for (HireBook hireBook : hireBooks) {
                if (hireBook.getIdBook().equals(idNameBook)) {
                    if (hireBook.getQuantity() < quantityReturn) {
                        throw new ArithmeticException("Loi: So luong sach tra phai < so luong sach da muon ");
                    }
                    int quantityChanged = hireBook.getQuantity() - quantityReturn;
                    hireBook.setQuantity(quantityChanged);
                }
            }
            ArrayList<HireBook> newHireBooks = new ArrayList<>();
            for (HireBook hireBook : hireBooks) {
                newHireBooks.add(hireBook);
            }

            for (HireBook hireBook : newHireBooks) {
                if (hireBook.getQuantity() == 0) {
                    hireBooks.remove(hireBook);
                }
            }
        }

        for (Customer customerCurrent : customers) {
            if (customerCurrent.getIdName().equals(idNameCustomer)) {
                customerCurrent.setHireBooks(hireBooks);
            }
        }

        System.out.println("Da tra thanh cong!");
    }
}
