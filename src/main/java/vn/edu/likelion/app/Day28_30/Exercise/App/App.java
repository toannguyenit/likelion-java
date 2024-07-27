package vn.edu.likelion.app.Day28_30.Exercise.App;

import vn.edu.likelion.app.Day28_30.Exercise.Connection.Connect;
import vn.edu.likelion.app.Day28_30.Exercise.Entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Base64;

public class App {
    public static Connect connect = new Connect();

    public static void createAdmin(User user) {
        Connection connection = connect.openConnect();
        String fullName = user.getFullName();
        String password = user.getPassword();
        String username = user.getUsername();
        String encodePw = Base64.getEncoder().encodeToString(password.getBytes());
        String sql = "INSERT INTO tbl_users (username, fullname, password, role_id) VALUES (?, ?, ?, ?)";
        try (Connection conn = connect.openConnect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, username);
            stmt.setString(2, fullName);
            stmt.setString(3, encodePw);
            stmt.setInt(4, 1);
            int rowsInserted = stmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new admin was inserted successfully!");
            }
        } catch (SQLException e) {
            System.out.println("Error occurred while inserting admin: " + e.getMessage());
        } finally {
            connect.closeConnect();
        }



    }

    public static void init(){
        // Tao tai khoan admin
        User admin = new User("admin", "admin", "admin", 1);
        createAdmin(admin);




    }

    public static void main(String[] args) {
        // Init
        init();

        // Dang nhap


    }

}
