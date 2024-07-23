package vn.edu.likelion.app.Day19.Exercise.ReadAndWrite;

import vn.edu.likelion.app.Day11.Exercise.Bai1Ver2.Model.Student;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteFile extends Thread {

    List<String> list = new ArrayList<>();

    public WriteFile() {
    }

    public WriteFile(List<String> list) {
        this.list = list;
    }

    @Override
    public void run() {
        String sourceFileOutput = "Students.txt";
        BufferedWriter writer = null;
        int count = 0;
        try {
            writer = new BufferedWriter(new FileWriter(sourceFileOutput));
            for (String s : list) {
                if (count == 5) {
//                    throw new ArithmeticException("Qua trinh ghi bi gian doan");
                    System.out.println("Qua trinh ghi bi gian doan");
                    System.out.println("Press any key to continue");
                    Scanner scanner = new Scanner(System.in);
                    String sc = scanner.nextLine();
                    System.out.println("Qua trinh ghi duoc tiep tuc");
                }
                writer.write(s + "\n");
                count++;
//                writer.close();
            }

            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println("Press any key to continue");
            Scanner scanner = new Scanner(System.in);
            String sc = scanner.nextLine();
            System.out.println("Qua trinh ghi duoc tiep tuc");
        }

    }
}
