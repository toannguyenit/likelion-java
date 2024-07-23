package vn.edu.likelion.app.Day4.Lession.DateAndTime;

import java.time.LocalDate;

public class LocalDateLession {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();

        int year = currentDate.getYear();
        int month = currentDate.getMonthValue();
        int day = currentDate.getDayOfMonth();

        System.out.println("Current Date:");
        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
    }


}
