package vn.edu.likelion.app.Day10.Bai2.Model;

import java.util.ArrayList;

public class Cart {
    private ArrayList<Product> products;

    public Cart() {
        this.products = new ArrayList<>();
    }

    public Cart(ArrayList<Product> products) {
        this.products = products;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public void addToCart(Product product) {
        products.add(product);
    }

    public double totalPrice(){
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }
}
