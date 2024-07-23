package vn.edu.likelion.app.Day19.Exercise.ReadAndWrite;

import java.io.File;

public class DeleteFile extends Thread{

    @Override
    public void run() {
        String sourceFile = "StudentsList.txt";
        try {
            File file = new File(sourceFile);
//            if (file.delete()) {
//                System.out.println(file.getName() + " is deleted!");
//            } else {
//                System.out.println("Delete operation is failed.");
//            }

            System.out.println(file.getName() + " is deleted!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
