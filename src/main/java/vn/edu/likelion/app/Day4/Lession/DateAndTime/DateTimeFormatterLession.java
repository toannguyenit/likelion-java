package vn.edu.likelion.app.Day4.Lession.DateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterLession {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today is " + today);

        System.out.println("");

        LocalTime todayTime = LocalTime.now();
        System.out.println("TodayTime is " + todayTime);
        System.out.println("");

        LocalDateTime todayDateTime = LocalDateTime.now();
        System.out.println("TodayDateTime is " + todayDateTime);
        System.out.println("");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = todayDateTime.format(formatter);
        System.out.println("TodayDate is " + formattedDate);
    }
}
