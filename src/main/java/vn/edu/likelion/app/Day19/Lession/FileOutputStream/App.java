package vn.edu.likelion.app.Day19.Lession.FileOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        // Đường dẫn
        String nameFile = "Class3.txt";
        String content = "Hello";
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(nameFile);
            fos.write(content.getBytes());
            System.out.println("Đã tạo file thành công!!!");
        }
        catch (IOException ioException) {
            ioException.printStackTrace();
        }
        finally {
            try {
                // Phai close, cai nay rat quan trong
                fos.close();
            }
            catch (IOException ioException) {
                ioException.printStackTrace();
            }

        }
    }

}
