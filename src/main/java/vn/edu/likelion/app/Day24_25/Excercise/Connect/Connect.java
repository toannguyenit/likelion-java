package vn.edu.likelion.app.Day24_25.Excercise.Connect;

import java.sql.*;

public class Connect {
    private final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
    private final String USER = "admin";
    private final String PASS = "admin";
    private Connection conn = null;

    public Connection openConnect() {
        try {
            conn = DriverManager.getConnection(URL, USER, PASS);
//            System.out.println("Connected to database");
        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
        }
        return conn;
    }

    public void closeConnect() {
        if (conn != null) {
            try {
                conn.close();
//                System.out.println("Connection closed successfully.");
            } catch (SQLException e) {
                System.out.println("Failed to close the connection.");
                e.printStackTrace();
            }
        }

    }

    public Connection getConn() {
        return conn;
    }
}
