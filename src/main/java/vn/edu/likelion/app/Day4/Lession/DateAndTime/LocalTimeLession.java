package vn.edu.likelion.app.Day4.Lession.DateAndTime;

import java.time.LocalTime;

public class LocalTimeLession {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();

        int hour = currentTime.getHour();
        int minute = currentTime.getMinute();
        int second = currentTime.getSecond();
        int nano = currentTime.getNano();

        System.out.println("Current Time:");
        System.out.println("Hour: " + hour);
        System.out.println("Minute: " + minute);
        System.out.println("Second: " + second);
        System.out.println("Nano: " + nano);
    }
}
