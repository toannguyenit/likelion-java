package vn.edu.likelion.app.Day28_30.Exercise.Entity;

public class User {
    private String username;
    private String password;
    private String fullName;
    private String phoneNumber;
    private int role_id;

    public User() {}

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User(String username, String password, String fullName, String phoneNumber) {
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
    }

    public User(String username, String password, String fullName) {
        this.username = username;
        this.password = password;
        this.fullName = fullName;
    }

    public User(String username, String password, String fullName, int role_id) {
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.role_id = role_id;
    }

    public User(String username, String password, String fullName, String phoneNumber, int role_id) {
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.role_id = role_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }
}
