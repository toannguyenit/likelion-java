package vn.edu.likelion.app.Day4.Lession.String;

public class StringBuilderLession {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World"); // Thay đổi trực tiếp đối tượng StringBuilder
        System.out.println(sb.toString()); // Output: Hello World


//        // Thay đổi nội dung thành "Welcome"
//        sb.setLength(0); // Xóa toàn bộ nội dung hiện tại
//        sb.append("Welcome"); // Thêm nội dung mới
//        System.out.println(sb.toString()); // Output: Welcome
//
//        // Thay đổi nội dung thành "Welcome"
//        sb.replace(0, sb.length(), "Welcome");
//        System.out.println(sb.toString()); // Output: Welcome
//
//        // Thay đổi nội dung thành "Welcome"
//        sb.delete(0, sb.length());
//        sb.append("Welcome");
//        System.out.println(sb.toString()); // Output: Welcome

        sb.delete(0, sb.length()); // Xóa toàn bộ nội dung hiện tại
        sb.insert(0, "Welcome"); // Chèn nội dung mới vào vị trí 0
        System.out.println(sb.toString()); // Output: Welcome

    }
}
