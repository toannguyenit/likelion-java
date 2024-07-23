package vn.edu.likelion.app.Day19.Exercise.ReadAndWrite;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws IOException {
        // Đường dẫn đến file nguồn A
        String sourceFile = "StudentsList.txt";

        // Tạo đối tượng để đọc file A
        BufferedReader reader = null;

        // Mở file nguồn bằng FileReader và BufferedReader
        reader = new BufferedReader(new FileReader(sourceFile));

        // Biến để lưu trữ dòng đọc được
        List<String> list = new ArrayList<>();
        String line;

        // Đọc từng dòng từ file và in ra màn hình
        while ((line = reader.readLine()) != null) {
            line = line.replaceAll("\\d+\\t", "");
            list.add(line);
//            System.out.println(line);
        }

        reader.close();

        // Tao 2 luong song song
        Thread thread1 = new DeleteFile();

        Runnable runnable = new WriteFile(list);
        Thread thread2 = new Thread(runnable);

        thread2.start();
        thread1.start();

    }
}
