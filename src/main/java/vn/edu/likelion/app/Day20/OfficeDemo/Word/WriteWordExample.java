package vn.edu.likelion.maven.Day20.OfficeDemo.Word;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteWordExample {




    public static void main(String[] args) {
        // Tạo 1 file word
        XWPFDocument document = new XWPFDocument();

        // Tạo 1 đoạn văn bản
        XWPFParagraph paragraph = document.createParagraph();

        // Tạo câu văn
        XWPFRun run = paragraph.createRun();
        run.setText("This is a test \n"); // Tương đương với append
        run.setText("This is a test 2 \n");


        try {
            FileOutputStream fos = new FileOutputStream("output.docx");
            document.write(fos);
            System.out.println("Đã tao file moi thanh cong");
            document.close();
            fos.close();
        }
        catch (IOException io) {
            io.printStackTrace();
        }



    }
}
