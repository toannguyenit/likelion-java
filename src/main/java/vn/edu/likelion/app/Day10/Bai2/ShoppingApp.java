package vn.edu.likelion.app.Day10.Bai2;

import vn.edu.likelion.app.Day10.Bai1.Model.Car;
import vn.edu.likelion.app.Day10.Bai2.Model.Cart;
import vn.edu.likelion.app.Day10.Bai2.Model.Product;

public class ShoppingApp {
    public static void main(String[] args) {
        // Khởi tại vài đối tượng Product
        Product product1 = new Product(1, "Banh Kep", 1.6);
        Product product2 = new Product(2, "Keo socola", 1.2);
        Product product3 = new Product(3, "Coca cola", 1.6);
        Product product4 = new Product(4, "Keo singum", 0.75);
        Product product5 = new Product(5, "Mitom Hao Hao", 0.69);


        // Tạo đối tượng Cart và thêm các sản phẩm vào giỏ
        Cart cart = new Cart();
        cart.addToCart(product1);
        cart.addToCart(product2);
        cart.addToCart(product3);
        cart.addToCart(product4);
        cart.addToCart(product5);

        // Hiển thị thông tin của từng sản phẩm trong giỏ hàng.
        System.out.println("Danh sách trong giỏ hàng");
        for (Product product : cart.getProducts()) {
            System.out.printf("%-5d %-20s %-10s %-15s%n",
                    product.getProductId(),
                    product.getProductName(),
                    String.format("%.2f", product.getPrice()) + "$",
                    Product.getStoreName());
        }

        // Tính và hiển thị tổng giá trị của giỏ hàng
        System.out.println("Tổng giá trị giỏ hàng: " + cart.totalPrice() + "$");

    }
}
