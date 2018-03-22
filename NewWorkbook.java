package excelProjectTestbed;


import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFRow;

public class NewWorkbook {
	public static void main(String[] args) throws IOException 
	{
		//Locate path and file of input excel.
		File inputFile=new File("sample-xlsx-file.xlsx");
		FileInputStream fis=new FileInputStream(inputFile);
		XSSFWorkbook inputWorkbook=new XSSFWorkbook(fis);
		int inputSheetCount=inputWorkbook.getNumberOfSheets();
		
		
		//Locate path and file of output excel.
		File outputFile=new File("New work book.xlsx");
		FileOutputStream fos=new FileOutputStream(outputFile);
		
		//Creating workbook for output excel file.
		XSSFWorkbook outputWorkbook=new XSSFWorkbook();
		
		// Creating sheets with the same name as appearing in input file.
		for(int i=0;i<inputSheetCount;i++) 
                { 
                  XSSFSheet inputSheet=inputWorkbook.getSheetAt(i); 
                  String inputSheetName=inputWorkbook.getSheetName(i); 
                  XSSFSheet outputSheet=outputWorkbook.createSheet(inputSheetName); 

                 // Create and call method to copy the sheet and content in new workbook. 
                 copySheet(inputSheet,outputSheet); 
                }

               // Write all the sheets in the new Workbook(testData_Copy.xlsx) using FileOutStream Object
               outputWorkbook.write(fos); 
              
               //At the end of the Program close the FileOutputStream object. 
               fos.close(); 
          }

           public static void copySheet(XSSFSheet inputSheet,XSSFSheet outputSheet) 
           { 
              int rowCount=inputSheet.getLastRowNum(); 
              
                int currentRowIndex=0; if(rowCount>0)
		{
			Iterator rowIterator=inputSheet.iterator();
			while(rowIterator.hasNext())
			{
				int currentCellIndex=0;
				Iterator cellIterator=((XSSFRow) rowIterator.next()).cellIterator();
				while(cellIterator.hasNext())
				{
				//Creating new Row, Cell and Input value in the newly created sheet. 
					String cellData=cellIterator.next().toString();
					if(currentCellIndex==0)
						outputSheet.createRow(currentRowIndex).createCell(currentCellIndex).setCellValue(cellData);
					else
						outputSheet.getRow(currentRowIndex).createCell(currentCellIndex).setCellValue(cellData);
					
					currentCellIndex++;
				}
				currentRowIndex++;
			}
			
		}
	}
}
