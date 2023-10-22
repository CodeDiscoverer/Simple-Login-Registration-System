package model;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelHandler {

    private String filePath;

    public ExcelHandler(String filePath) {
        this.filePath = filePath;
    }

    public void writeDataToExcel(String[] data) {
        try {
            FileInputStream file = new FileInputStream(filePath);
            Workbook workbook = new XSSFWorkbook(file);
            Sheet sheet = workbook.getSheetAt(0);
            int rowCount = sheet.getLastRowNum();
            Row row = sheet.createRow(++rowCount);
            int columnCount = 0;
            for (String field : data) {
                Cell cell = row.createCell(columnCount++);
                cell.setCellValue(field);
            }
            file.close();
            FileOutputStream outputStream = new FileOutputStream(filePath);
            workbook.write(outputStream);
            workbook.close();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readDataFromExcel() {
        try {
            FileInputStream file = new FileInputStream(filePath);
            Workbook workbook = new XSSFWorkbook(file);
            Sheet sheet = workbook.getSheetAt(0);
            for (Row row : sheet) {
                for (Cell cell : row) {
                    System.out.print(cell.getStringCellValue() + "\t\t");
                }
                System.out.println();
            }
            file.close();
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
