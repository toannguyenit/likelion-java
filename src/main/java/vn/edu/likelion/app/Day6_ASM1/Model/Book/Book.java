package vn.edu.likelion.app.Day6_ASM1.Model.Book;

public class Book {
    private String idName;
    private String title;
    private String name;
    private String author;
    private String description;
    private int quantity;

    public Book() {}

    public Book(String idName, String title, String name, String author, String description, int quantity) {
        this.idName = idName;
        this.title = title;
        this.name = name;
        this.author = author;
        this.description = description;
        this.quantity = quantity;
    }

    public String getIdName() {
        return idName;
    }

    public void setIdName(String idName) {
        this.idName = idName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return description;
    }

    public void setPublisher(String publisher) {
        this.description = publisher;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void showInformation(){
        System.out.println("=---------------------------------------------------------------=");
        System.out.println("=                          CHI TIET SACH                        =");
        System.out.println("=---------------------------------------------------------------=");
        System.out.printf("%-3s %-8s %-25s %-15s %-10s%n", "STT", "IdBook", "BookName", "Author", "Quantity");
        System.out.printf("%-3d %-8s %-25s %-15s %-10d%n", 0, idName, name, author, quantity);
        System.out.println("=---------------------------------------------------------------=");
    }
}
