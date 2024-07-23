package vn.edu.likelion.maven.Day20;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

import java.io.*;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

public class App {

    public static String encodeBase64(String str) {
        return Base64.getEncoder().encodeToString(str.getBytes());
    }

    public static String decodeBase64(String str) {
        return new String(Base64.getDecoder().decode(str));
    }

    public static void readAbsentStudent() throws IOException {
        FileInputStream inputStream = new FileInputStream(new File("outputStudent.docx"));
        XWPFDocument document = new XWPFDocument(inputStream);

        XWPFParagraph paragraph = document.getParagraphs().get(0);
        String arrStringCode = paragraph.getText();
        String[] arrStringArr = arrStringCode.split("\n");
        for (String code : arrStringArr) {
            try {
                System.out.println(decodeBase64(code));
            } catch (Exception e) {
                System.out.println("Giai ma bi loi");
            }
        }
        inputStream.close();
    }

    public static void readAvalibleStudent() throws IOException {
        FileInputStream inputStream = new FileInputStream(new File("outputStudent.xlsx"));
        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheetAt(0);
        for (Row row : sheet) {
            String stt = String.valueOf(row.getCell(0).getNumericCellValue());
            String name = decodeBase64(row.getCell(1).getStringCellValue());
            System.out.println("STT: " + stt + " Name: " + name);
        }
    }

    public static void writeToAbsentStudents(String fileName, List<String> students) throws IOException {
        // Tạo 1 tài liệu mới
        XWPFDocument document = new XWPFDocument();

        // Tạo một đoạn văn bản và thêm nội dung
        XWPFParagraph paragraph = document.createParagraph();
        XWPFRun run = paragraph.createRun();
        for (String student : students) {
            run.setText(student);
            run.addBreak();
        }

        // Ghi ra file output.docx
        FileOutputStream fos = new FileOutputStream(fileName);
        document.write(fos);
        document.close();
        System.out.println("Đã ghi file word thành công");

    }

    public static void writeToAvalibleStudents(String fileName, List<String> students) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("AvalibleStudents");
        for (int i = 0; i < students.size(); i++) {
            XSSFRow row = sheet.createRow(i);
            XSSFCell cell1 = row.createCell(0);
            cell1.setCellValue(i + 1);
            XSSFCell cell2 = row.createCell(1);
            cell2.setCellValue(students.get(i));
        }

        FileOutputStream fos = new FileOutputStream(fileName);
        workbook.write(fos);
        workbook.close();
        System.out.println("Đã tạo file excel thành công");
    }

    public static void main(String[] args) throws IOException {
        // Khai bao ten file
        String sourceFile = "StudentsList.txt";

        // Tạo mảng lưu giá trị các học sinh
        List<String> absentList = new ArrayList<>();
        List<String> avalibleList = new ArrayList<>();

        // Đoc file txt từ máy chủ và ghi vào vào bộ nhớ
        try {
            BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(new File(sourceFile))));
            String line, isAbsent, name;

            while ((line = bufferedReader.readLine()) != null) {
                String[] values = line.split("\t");
                name = values[1];
                isAbsent = values[2];
                if (isAbsent.equals("1")) {
                    absentList.add(encodeBase64(name));
                } else {
                    avalibleList.add(encodeBase64(name));
                }
            }
            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

//        writeToAbsentStudents("outputStudent.docx", absentList);
//        writeToAvalibleStudents("outputStudent.xlsx", avalibleList);

        readAbsentStudent();
//        readAvalibleStudent();

//        System.out.println(decodeBase64("TMOqIFRodSBIw6A="));
    }
}
