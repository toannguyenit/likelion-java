package vn.edu.likelion.app.Day4.Lession.DateAndTime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateLession {

        public static void main(String[] args) {
            // Lấy thời gian hiện tại
            Date currentDate = new Date();
            System.out.println("Current Date: " + currentDate);

            // Sử dụng SimpleDateFormat để hiển thị các giá trị ngày tháng
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");

            String formattedDate = dateFormat.format(currentDate);
            String formattedTime = timeFormat.format(currentDate);

            System.out.println("Current Date: " + formattedDate);
            System.out.println("Current Time: " + formattedTime);
        }

}
