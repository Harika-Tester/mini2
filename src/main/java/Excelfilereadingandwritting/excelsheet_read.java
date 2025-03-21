package Excelfilereadingandwritting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelsheet_read {

	public static void main(String[] args) throws IOException 
	{
		String emailid="";
		
		String password="";
		
		String path="\"C:\\Users\\lucky\\OneDrive\\Documents\\test data adity.xlsx\"";
		
		FileInputStream fis=new FileInputStream(path);
		
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		
		/*XSSFSheet sheet=workbook.getSheetAt("test data");
		
		int rows = sheet.getLastRowNum();
		
		for(int i=1; i<=rows; i++)
		{
			//get the values from the sheet
			XSSFRow row = sheet.getRow(i);
			String browser =row.getCell(0).getStringCellValue();
			emailid = row.getCell(1).getStringCellValue();
			password= row.getCell(2).getStringCellValue();
			launchApplication(browser);*/
		}
		
		
	}


