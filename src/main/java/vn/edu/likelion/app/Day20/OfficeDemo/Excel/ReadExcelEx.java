package vn.edu.likelion.maven.Day20.OfficeDemo.Excel;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcelEx {
    public static void main(String[] args) {
        // Lay file excel vat ly
        try {
            FileInputStream fis = new FileInputStream(new File("output.xlsx"));
            XSSFWorkbook workbook = new XSSFWorkbook(fis);
            XSSFSheet sheet = workbook.getSheetAt(0);
            for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
                XSSFRow row = sheet.getRow(i);
                for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
                    XSSFCell cell = row.getCell(j);
                    System.out.println("cell " + j + ": " + cell.getStringCellValue());
                }
            }
            fis.close();
        }catch (IOException e) {
            e.printStackTrace();
        }



    }
}
