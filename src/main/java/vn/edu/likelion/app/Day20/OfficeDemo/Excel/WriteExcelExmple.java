package vn.edu.likelion.app.Day20.OfficeDemo.Excel;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcelExmple {
    public static void main(String[] args) {

        // Tao ra 1 doi tuong xu ly file exxcel
        XSSFWorkbook workbook = new XSSFWorkbook();

        // Tao ra 1 sheet moi tuw work book
        XSSFSheet sheet = workbook.createSheet();

        // Tao ra 1 row
        XSSFRow row = sheet.createRow(0);

        // Tao ra 1 cell trong row
        XSSFCell cell = row.createCell(0);

        cell.setCellValue("Lan dau tien di hoc");

        XSSFCell cell2 = row.createCell(1);
        cell2.setCellValue("La thu hai di hoc");

        // Tao ra 1 file excel vat ly
        try {
            FileOutputStream fos = new FileOutputStream("output.xlsx");
            workbook.write(fos);
            workbook.close();
        } catch (IOException io) {
            io.printStackTrace();
        }


    }
}
