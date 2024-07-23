package vn.edu.likelion.app.Day24_25.Excercise.Entity;

public class Teacher {
    private int id;
    private String fullName;
    private String username;
    private String password;

    public Teacher(){}


    public Teacher( String fullName, String username) {
        this.fullName = fullName;
        this.username = username;
    }

    public Teacher( String fullName, String username, String password) {
        this.fullName = fullName;
        this.username = username;
        this.password = password;
    }


    public Teacher(int id, String fullName, String username, String password) {
        this.id = id;
        this.fullName = fullName;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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
}
