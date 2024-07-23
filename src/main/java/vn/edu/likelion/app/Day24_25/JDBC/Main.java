package vn.edu.likelion.app.Day24_25.JDBC;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
        // Thong tin dang nhap
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "admin";
        String password = "admin";
        Connection conn = null;
        String sql = "select * from help";

        PreparedStatement ps = null;
        ResultSet rs = null;
        // Tao Connection
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to database");

            // Gửi câu lệnh truy vấn tới database
            ps = conn.prepareStatement(sql);

            rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getString(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
