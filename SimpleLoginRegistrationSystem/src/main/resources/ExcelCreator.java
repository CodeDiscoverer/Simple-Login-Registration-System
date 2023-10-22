package resources;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelCreator {

    public static void main(String[] args) {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Users");

        // Create a header row
        Row headerRow = sheet.createRow(0);
        headerRow.createCell(0).setCellValue("Username");
        headerRow.createCell(1).setCellValue("Password");
        headerRow.createCell(2).setCellValue("Role");

        // Example data - you can replace this with your data
        String[][] data = {
                {"admin", "admin123", "admin"},
                {"user", "user123", "user"}
        };

        // Add data rows
        for (int i = 0; i < data.length; i++) {
            Row row = sheet.createRow(i + 1);
            for (int j = 0; j < data[i].length; j++) {
                row.createCell(j).setCellValue(data[i][j]);
            }
        }

        // Write the output to a file
        try {
            FileOutputStream fileOut = new FileOutputStream("src/resources/users.xlsx");
            workbook.write(fileOut);
            fileOut.close();
            System.out.println("Excel file has been created successfully!");
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
