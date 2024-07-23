package vn.edu.likelion.app.Day10.Bai2.Model;

public class Product {
    private int productId;
    private String productName;
    private double price;
    private static final String storeName = "ABC store";

    public Product() {

    }

    public Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static String getStoreName() {
        return storeName;
    }

}
