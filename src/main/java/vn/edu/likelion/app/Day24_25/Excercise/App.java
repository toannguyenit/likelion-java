package vn.edu.likelion.app.Day24_25.Excercise;

import vn.edu.likelion.app.Day24_25.Excercise.Connect.Connect;
import vn.edu.likelion.app.Day24_25.Excercise.Entity.Teacher;

import java.io.*;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Date;
import java.util.List;

public class App {

    private static Connect connect = new Connect();

    public static void register(Teacher teacher) {
        String fullName = teacher.getFullName();
        String password = teacher.getPassword();
        String username = teacher.getUsername();
        String encodePw = Base64.getEncoder().encodeToString(password.getBytes());
        String sql = "INSERT INTO teachers (username, fullname, password) VALUES (?, ?, ?)";
        try (Connection conn = connect.openConnect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, username);
            stmt.setString(2, fullName);
            stmt.setString(3, encodePw);
            int rowsInserted = stmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new teacher was inserted successfully!");
            }
        } catch (SQLException e) {
            System.out.println("Error occurred while inserting teacher: " + e.getMessage());
        } finally {
            connect.closeConnect();
        }
    }

    public static void login(String username, String password) throws SQLException {
        String encodedPassword = Base64.getEncoder().encodeToString(password.getBytes());
        String sql = "SELECT PASSWORD FROM teachers WHERE username = ?";

        try (Connection connection = connect.openConnect();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setString(1, username);
            ResultSet rs = null;
            rs = ps.executeQuery();

            if (rs.next()) {
                String storedPassword = rs.getString("password");
                if (storedPassword.equals(encodedPassword)) {
                    System.out.println("Dang nhap thanh cong");
                } else {
                    System.out.println("Dang nhap that bai");
                }
            } else {
                System.out.println("Dang nhap that bai");
            }

        } catch (SQLException e) {
            System.out.println("Error occurred while logging in: " + e.getMessage());
        } finally {
            connect.closeConnect();
        }
    }

    public static void insertStudentsToDatabase() {
        // Khai bao ten file
        String sourceFile = "StudentsList.txt";

        // Tạo mảng lưu giá trị các học sinh
        List<String> listStudents = new ArrayList<>();

        try {
            BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(new File(sourceFile))));
            String line, name;

            while ((line = bufferedReader.readLine()) != null) {
                String[] values = line.split("\t");
                name = values[1];
                listStudents.add(name);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String name : listStudents) {
            String sql = "INSERT INTO STUDENT (FULLNAME) VALUES (?)";

            try (Connection conn = connect.openConnect();
                 PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, name);
                int rowsInserted = stmt.executeUpdate();
                if (rowsInserted > 0) {
                    System.out.println("Student: " + name + " was inserted successfully!");
                }
            } catch (SQLException e) {
                System.out.println("Error occurred while inserting teacher: " + e.getMessage());
            } finally {
                connect.closeConnect();
            }
        }
    }

    public static void showAllStudents() throws SQLException {
        String sql = "SELECT * FROM STUDENT";
        try (Connection conn = connect.openConnect();) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String name = rs.getString("FULLNAME");
                System.out.println(name);
            }
        } catch (SQLException e) {
            System.out.println("Error occurred while showing all students: " + e.getMessage());
        } finally {
            connect.closeConnect();
        }
    }

    public static void showAbsentStudent() throws SQLException {
        int id = getCurrentDate();
        if (id == -1) {
            System.out.println("No such student");
            return;
        }
        String sql = "SELECT STUDENT_ID FROM ATTENDANCE WHERE DATEATTENDANCE_ID = ? AND IS_ACTIVE = 0";
        try (Connection conn = connect.openConnect();) {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int studentID = rs.getInt("STUDENT_ID");
                System.out.println(getStudentById(studentID));
            }
        } catch (SQLException e) {
            System.out.println("Error occurred while showing all students: " + e.getMessage());
        } finally {
            connect.closeConnect();
        }
    }

    public static void showPresentStudent() throws SQLException {
        int id = getCurrentDate();
        if (id == -1) {
            System.out.println("No such student");
            return;
        }
        String sql = "SELECT STUDENT_ID FROM ATTENDANCE WHERE DATEATTENDANCE_ID = ? AND IS_ACTIVE = 1";
        try (Connection conn = connect.openConnect();) {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int studentID = rs.getInt("STUDENT_ID");
                System.out.println(getStudentById(studentID));
            }
        } catch (SQLException e) {
            System.out.println("Error occurred while showing all students: " + e.getMessage());
        } finally {
            connect.closeConnect();
        }
    }

    public static void attendance() throws SQLException {
        int id = getCurrentDate();
        if (id == -1) {
            System.out.println("No such date");
            return;
        }

        // Khai bao ten file
        String sourceFile = "StudentsList.txt";

        // Tạo mảng lưu giá trị các học sinh
        List<String> absentList = new ArrayList<>();
        List<String> avalibleList = new ArrayList<>();

        try {
            BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(new File(sourceFile))));
            String line, isAbsent, name;

            while ((line = bufferedReader.readLine()) != null) {
                String[] values = line.split("\t");
                name = values[1];
                isAbsent = values[2];
                if (isAbsent.equals("1")) {
                    absentList.add((name));
                } else {
                    avalibleList.add((name));
                }
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String name : absentList) {
            insertAttendance(getIdStudent(name), 0);
        }

        for (String name : avalibleList) {
            insertAttendance(getIdStudent(name), 1);
        }

    }

    public static void insertAttendance(int student_id, int isActive) throws SQLException {
        int idDate = getCurrentDate();
        if (idDate == -1) {
            System.out.println("No such date");
        }
        String sql = "INSERT INTO ATTENDANCE (STUDENT_ID, DATEATTENDANCE_ID, IS_ACTIVE ) VALUES (?,?, ?)";
        try (Connection conn = connect.openConnect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, student_id);
            stmt.setInt(2, idDate);
            stmt.setInt(3, isActive);
            int rowsInserted = stmt.executeUpdate();
            if (rowsInserted > 0) {
//                System.out.println("Attendance inserted successfully!");
            }


        } catch (SQLException e) {
            System.out.println("Error occurred while inserting attendance: " + e.getMessage());
        } finally {
            connect.closeConnect();
        }
    }

    public static int getIdStudent(String name) {
        String sql = "SELECT id FROM STUDENT WHERE FULLNAME = ? " ;
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            connection = connect.openConnect();
            ps = connection.prepareStatement(sql);
            ps.setString(1, name);
            rs = ps.executeQuery();
            rs.next();
            int id = rs.getInt("id");
            System.out.println("Found record with ID: " + id);
            return id;

        } catch (SQLException e) {
            System.out.println("Error occurred: " + e.getMessage());
        } finally {
            connect.closeConnect();
        }
        return -1;
    }
    public static String getStudentById(int id) {
        String sql = "SELECT FULLNAME FROM STUDENT WHERE id = ? " ;
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            connection = connect.openConnect();
            ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            rs.next();
            String name = rs.getString("FULLNAME");
            return name;

        } catch (SQLException e) {
            System.out.println("Error occurred: " + e.getMessage());
        } finally {
            connect.closeConnect();
        }
        return "";
    }
    public static int getCurrentDate() throws SQLException {
        String sql = "SELECT id FROM DATEATTENDANCE WHERE TRUNC(DATEATTENDANCE) = TRUNC(SYSDATE)";
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            connection = connect.openConnect();
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
//                System.out.println("Found record with ID: " + id);
                return id;
            }

        } catch (SQLException e) {
            System.out.println("Error occurred: " + e.getMessage());
        } finally {
            connect.closeConnect();
        }
        return -1;
    }

    public static void main(String[] args) throws SQLException {
        // Init - Done
//        insertStudentsToDatabase();

        // Dang ky - Done
//        Teacher teacher1 = new Teacher("Anh Tuan", "anhtuan", "anhtuan");
//        Teacher teacher2 = new Teacher("Anh Duong", "anhduong", "anhduong");
//        register(teacher1);
//        register(teacher2);

        // Dang nhap - Done
//        login("anhtuan", "anhtuan");

        // Get current Date
//        int id = getCurrentDate();
//        System.out.println(id);

        // Diem danh - Done
//        attendance();

        // Show all students - Done
//        showAllStudents();

        // Show absent students - Done
//        showAbsentStudent();

        // Show present students - Done
//        showPresentStudent();

    }

}
