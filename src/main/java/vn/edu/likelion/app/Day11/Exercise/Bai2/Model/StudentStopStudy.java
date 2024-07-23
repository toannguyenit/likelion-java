package vn.edu.likelion.app.Day11.Exercise.Bai2.Model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class StudentStopStudy {
    private String citizenId;
    private String reason;
    private LocalDate date;

    public StudentStopStudy() {}

    public StudentStopStudy(String citizenId, String reason, LocalDate date) {
        this.citizenId = citizenId;
        this.reason = reason;
        this.date = date;
    }

    public void setCitizenId(String citizenId) {

        this.citizenId = citizenId;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getCitizenId() {
        return citizenId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
