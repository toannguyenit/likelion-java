package vn.edu.likelion.app.Day6_ASM1.Impl;


import vn.edu.likelion.app.Day6_ASM1.Model.Book.Book;
import vn.edu.likelion.app.Day6_ASM1.Service.InterfaceBook;

import java.util.ArrayList;

public class BookArrayImpl implements InterfaceBook {

    ArrayList<Book> books;

    public BookArrayImpl() {
    }

    public BookArrayImpl(ArrayList<Book> books) {
        this.books = books;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    @Override
    public void addBook(Book book) {
        if (book.getIdName().length() > 5) {
            throw new IllegalArgumentException("Book ID phai < 5 characters");
        }
        if (book.getTitle().length() > 20) {
            throw new IllegalArgumentException("Title exceeds 20 characters");
        }
        if (book.getAuthor().length() > 15) {
            throw new IllegalArgumentException("Author exceeds 15 characters");
        }
        if (book.getQuantity() < 0 || book.getQuantity() > 150) {
            throw new IllegalArgumentException("Quantity > 0 and < 150");
        }
        if (book.getName().length() > 25) {
            throw new IllegalArgumentException("Name exceeds 25 characters");
        }
        books.add(book);
    }

    @Override
    public void showBooksDisplay() {
        if (books == null) {
            System.out.println("Book List is empty");
            return;
        }

        int stt = 1;
        System.out.println("=---------------------------------------------------------------=");
        System.out.println("=                         DANH SACH SACH                        =");
        System.out.println("=---------------------------------------------------------------=");
        System.out.printf("%-3s %-8s %-25s %-15s %-10s%n", "STT", "IdBook", "BookName", "Author", "Quantity");
        for (Book book : books) {
//            System.out.print(stt + ". " + " - idBook: " + book.getIdName() + " - bookName: "  + book.getName() + " - Author:" + book.getAuthor() +" - Quantity: " + book.getQuantity() + "\n");
            System.out.printf("%-3d %-8s %-25s %-15s %-10d%n", stt, book.getIdName(), book.getName(), book.getAuthor(), book.getQuantity());

            stt++;
        }
        System.out.println("=---------------------------------------------------------------=");
    }

    @Override
    public void updateBook(Book book) {
        for (Book bookCurrent : books) {
            if (bookCurrent.getIdName().equals(book.getIdName())) {
                if (book.getTitle().length() > 20) {
                    throw new IllegalArgumentException("Title exceeds 20 characters");
                }
                if (book.getAuthor().length() > 15) {
                    throw new IllegalArgumentException("Author exceeds 15 characters");
                }
                if (book.getQuantity() < 0 || book.getQuantity() > 150) {
                    throw new IllegalArgumentException("Quantity > 0 and < 150");
                }
                if (book.getName().length() > 25) {
                    throw new IllegalArgumentException("Name exceeds 25 characters");
                }


                if (!(book.getTitle().equals("0"))) {
                    bookCurrent.setTitle(book.getTitle());
                }
                if (!(book.getName().equals("0"))) {
                    bookCurrent.setName(book.getName());
                }
                if (!(book.getDescription().equals("0"))) {
                    bookCurrent.setDescription(book.getDescription());
                }
                if (!(book.getAuthor().equals("0"))) {
                    bookCurrent.setAuthor(book.getAuthor());
                }
                if (!(book.getQuantity() == 0)) {
                    bookCurrent.setQuantity(book.getQuantity());
                }
            }
        }

    }

    @Override
    public void deleteBook(String idBook) {
        if (idBook.length() > 5) {
            throw new ArithmeticException("IdBook phai < 5 ky tu");
        }
        ArrayList<Book> tempBooks = new ArrayList<>();
        for (Book book : books) {
            tempBooks.add(book);
        }
        for (Book book : tempBooks) {
            if (book.getIdName().equals(idBook)) {
                books.remove(book);
            }
        }
        System.out.println("Deleted " + idBook);
    }

    @Override
    public void hireBook(String idBookName, int quantity) {
        for (Book book : this.books) {
            if (book.getIdName().equals(idBookName)) {
                int quantityBook = book.getQuantity() - quantity;
                System.out.println("So luong ban dau: " + book.getQuantity());
                book.setQuantity(quantityBook);
                System.out.println("So luong sau khi sua: " + book.getQuantity());
            }
        }
    }

    @Override
    public Book findBookByIdName(String idBookName) {
        if (idBookName.length() > 5) {
            throw new ArithmeticException("IdBook phai < 5 ky tu");
        }
        Book book = new Book();
        for (Book bookCurrent : books) {
            if (bookCurrent.getIdName().equals(idBookName)) {
                book.setIdName(bookCurrent.getIdName());
                book.setTitle(bookCurrent.getTitle());
                book.setName(bookCurrent.getName());
                book.setAuthor(bookCurrent.getAuthor());
                book.setDescription(bookCurrent.getDescription());
                book.setQuantity(bookCurrent.getQuantity());
            }
        }
        return book;
    }

    @Override
    public void returnBook(String idBook, int quantity) {
        for (Book book : this.books) {
            if (book.getIdName().equals(idBook)) {
                int quantityBook = book.getQuantity() + quantity;
                book.setQuantity(quantityBook);
            }
        }
    }


}
