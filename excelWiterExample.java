package excelWriterExample;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class FillsAndColors {
    public static void main(String[] args) throws IOException {
        try (Workbook wb = new XSSFWorkbook()) { //or new HSSFWorkbook();
            Sheet sheet = wb.createSheet("EmployeesDetails");

            // Create a row and put some cells in it. Rows are 0 based.
            Row row = sheet.createRow(0);

            CellStyle style = wb.createCellStyle();
            style.setFillForegroundColor(IndexedColors.BLUE.getIndex());
            style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            style.setBorderTop(BorderStyle.MEDIUM_DASHED);
            style.setTopBorderColor(IndexedColors.BLACK.getIndex());
            Cell cell = row.createCell(0);
            cell.setCellValue(new XSSFRichTextString("Roll Number"));
            cell.setCellStyle(style);
            style = wb.createCellStyle();
            style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
            style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            style.setBorderLeft(BorderStyle.MEDIUM_DASHED);
            style.setLeftBorderColor(IndexedColors.BLACK.getIndex());
            style.setBorderRight(BorderStyle.MEDIUM_DASHED);
            style.setRightBorderColor(IndexedColors.BLACK.getIndex());
            style.setBorderTop(BorderStyle.MEDIUM_DASHED);
            style.setTopBorderColor(IndexedColors.BLACK.getIndex());
            cell = row.createCell(1);
            cell.setCellValue(new XSSFRichTextString("Student Name"));
            cell.setCellStyle(style);
       
            style = wb.createCellStyle();
            style.setFillForegroundColor(IndexedColors.ORANGE.getIndex());
            style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            style.setBorderTop(BorderStyle.MEDIUM_DASHED);
            style.setTopBorderColor(IndexedColors.BLACK.getIndex());
            cell = row.createCell(2);
            cell.setCellValue(new XSSFRichTextString("Student address"));
            cell.setCellStyle(style);

            Row row1 = sheet.createRow(1);

            CellStyle style1 = wb.createCellStyle();
            style1.setFillForegroundColor(IndexedColors.RED.getIndex());
            style1.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            Cell cell1 = row1.createCell(0);
            cell1.setCellValue(new XSSFRichTextString("98239"));
            cell1.setCellStyle(style1);

            style1 = wb.createCellStyle();
            style1.setFillForegroundColor(IndexedColors.PINK.getIndex());
            style1.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            style1.setBorderLeft(BorderStyle.THICK);
            style1.setLeftBorderColor(IndexedColors.BLACK.getIndex());
            style1.setBorderRight(BorderStyle.THICK);
            style1.setRightBorderColor(IndexedColors.BLACK.getIndex());
            cell1 = row1.createCell(1);
            cell1.setCellValue(new XSSFRichTextString("Dikshit"));
            cell1.setCellStyle(style1);
            
            style1 = wb.createCellStyle();
            style1.setFillForegroundColor(IndexedColors.GREEN.getIndex());
            style1.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            cell1 = row1.createCell(2);
            cell1.setCellValue(new XSSFRichTextString("Panchkula"));
            cell1.setCellStyle(style1);
            
            Row row2 = sheet.createRow(2);

            CellStyle style2 = wb.createCellStyle();
            style2.setFillForegroundColor(IndexedColors.YELLOW.getIndex());
            style2.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            Cell cell2 = row2.createCell(0);
            cell2.setCellValue(new XSSFRichTextString("19832"));
            cell2.setCellStyle(style2);

            style2 = wb.createCellStyle();
            style2.setFillForegroundColor(IndexedColors.RED.getIndex());
            style2.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            style2.setBorderLeft(BorderStyle.THICK);
            style2.setLeftBorderColor(IndexedColors.BLACK.getIndex());
            style2.setBorderRight(BorderStyle.THICK);
            style2.setRightBorderColor(IndexedColors.BLACK.getIndex());
            cell2 = row2.createCell(1);
            cell2.setCellValue(new XSSFRichTextString("Rajesh"));
            cell2.setCellStyle(style2);
            
            style2 = wb.createCellStyle();
            style2.setFillForegroundColor(IndexedColors.ORANGE.getIndex());
            style2.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            cell2 = row2.createCell(2);
            cell2.setCellValue(new XSSFRichTextString("Jagadhri"));
            cell2.setCellStyle(style2);
            
            Row row3 = sheet.createRow(3);

        
            CellStyle style3 = wb.createCellStyle();
            style3.setFillForegroundColor(IndexedColors.BLUE.getIndex());
            style3.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            style3.setBorderBottom(BorderStyle.MEDIUM_DASHED);
            style3.setBottomBorderColor(IndexedColors.BLACK.getIndex());
            Cell cell3 = row3.createCell(0);
            cell3.setCellValue(new XSSFRichTextString("170032"));
            cell3.setCellStyle(style3);

           
            style3 = wb.createCellStyle();
            style3.setFillForegroundColor(IndexedColors.AQUA.getIndex());
            style3.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            style3.setBorderBottom(BorderStyle.MEDIUM_DASHED);
            style3.setBottomBorderColor(IndexedColors.BLACK.getIndex());
            style3.setBorderLeft(BorderStyle.THICK);
            style3.setLeftBorderColor(IndexedColors.BLACK.getIndex());
            style3.setBorderRight(BorderStyle.THICK);
            style3.setRightBorderColor(IndexedColors.BLACK.getIndex());
            cell3 = row3.createCell(1);
            cell3.setCellValue(new XSSFRichTextString("Pavan"));
            cell3.setCellStyle(style3);
            
     
            style3 = wb.createCellStyle();
            style3.setFillForegroundColor(IndexedColors.PINK.getIndex());
            style3.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            style3.setBorderBottom(BorderStyle.MEDIUM_DASHED);
            style3.setBottomBorderColor(IndexedColors.BLACK.getIndex());
            cell3 = row3.createCell(2);
            cell3.setCellValue(new XSSFRichTextString("Sadaura"));
            cell3.setCellStyle(style3);
            

            // Write the output to a file
            try (FileOutputStream fileOut = new FileOutputStream("fill_colors.xlsx")) {
                wb.write(fileOut);
            }
        }
    }
