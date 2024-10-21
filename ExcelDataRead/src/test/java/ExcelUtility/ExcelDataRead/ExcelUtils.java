package ExcelUtility.ExcelDataRead;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	public static void main(String[] args) throws IOException {
		getRowCount();
		getCellValue();

	}
	
	public static void getRowCount() throws IOException {
		String excelPath = "./Data/TestData.xlsx";
		XSSFWorkbook workbook = new XSSFWorkbook(excelPath);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println("No of Rows : "+ rowCount);
	}

	public static void getCellValue() throws IOException {
		String excelPath = "./Data/TestData.xlsx";
		XSSFWorkbook workbook = new XSSFWorkbook(excelPath);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		DataFormatter formatter = new DataFormatter();
		Object val = formatter.formatCellValue(sheet.getRow(1).getCell(2)); //wont throw error irrespective of the string value
		System.out.println("Value with formatter is : "+ val);
		
		String value = sheet.getRow(1).getCell(0).getStringCellValue(); // this will throw error if cell value is not string
		System.out.println("Value of string is : "+ value);
	}
}
