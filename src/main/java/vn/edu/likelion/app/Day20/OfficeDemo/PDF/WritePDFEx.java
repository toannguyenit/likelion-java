package vn.edu.likelion.maven.Day20.OfficeDemo.PDF;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;

import java.io.File;
import java.io.IOException;

public class WritePDFEx {
    public static void main(String[] args) {
        try {
            // Tao 1 doi tuong PDF
            PDDocument document = new PDDocument();

            // Tao ra 1 trang tu
            PDPage page = new PDPage();

            // Tao ra 1 cai lop cho phep ve van ban
            PDPageContentStream contentStream = new PDPageContentStream(document, page);

            contentStream.beginText();
            // Kiem tra toa do cua page
            System.out.println(page.getBleedBox());
            contentStream.newLineAtOffset(20, 772);
//            contentStream.setFont(new , 14.0);
            contentStream.showText("Day la file PDF");
            contentStream.endText();

            File file = new File("output.pdf");
            document.save(file);
            document.close();





        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
