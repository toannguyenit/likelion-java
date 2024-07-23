package vn.edu.likelion.maven.Day20.OfficeDemo.Word;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadWordExmaple {
    public static void main(String[] args) {
        // Đọc file vật lý
        File file = new File("output.docx");

        try{
            InputStream is = new FileInputStream(file);
            XWPFDocument doc = new XWPFDocument(is);
            for (XWPFParagraph paragraph : doc.getParagraphs()) {
                System.out.println("paragraph: " + paragraph.getText());
            }
            is.close();


        } catch (IOException ioException){
            ioException.printStackTrace();
        }
    }
}
