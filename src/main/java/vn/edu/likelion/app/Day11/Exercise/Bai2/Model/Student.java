package vn.edu.likelion.app.Day11.Exercise.Bai2.Model;

import java.time.LocalDate;
import java.util.UUID;

public class Student {
    private String id = "";
    private String name;
    private String citizenId;

    private LocalDate dateOfBirth;

    public Student() {
    }

    public Student( String name, String citizenId, LocalDate dateOfBirth) {
        this.name = name;
        this.citizenId = citizenId;
        this.dateOfBirth = dateOfBirth;
    }

    public Student(String name, String citizenId) {
        this.name = name;
        this.citizenId = citizenId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCitizenId() {
        return citizenId;
    }

    public void setCitizenId(String citizenId) {
        this.citizenId = citizenId;
    }

    @Override
    public String toString(){
        return "Student: Id: " + id
                + " name: " + name
                + " citizenId: " + citizenId;
    }

    private String getUUID(){
        UUID uuid = UUID.randomUUID();
        return uuid.toString().replace("-", "").substring(0, 8);
    }
}
