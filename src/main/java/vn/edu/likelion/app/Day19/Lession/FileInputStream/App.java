package vn.edu.likelion.app.Day19.Lession.FileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class App {

    public static void main(String[] args) {
        String sourceFile = "Class3.txt";

        FileInputStream fis = null;

        try {
            fis = new FileInputStream(sourceFile);

            byte[] buffer = new byte[1024];
            int byteRead;
            while ((byteRead = fis.read(buffer)) != -1) {
                System.out.println(new String(buffer, 0, byteRead));
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
