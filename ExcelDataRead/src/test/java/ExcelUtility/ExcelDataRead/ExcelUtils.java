package ExcelUtility.ExcelDataRead;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public ExcelUtils(String excelPath, String sheetName) throws IOException {
		
		workbook = new XSSFWorkbook(excelPath);
		sheet = workbook.getSheet(sheetName);
		
	}
	
	public static void getRowCount() throws IOException {
		
		int rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println("No of Rows : "+ rowCount);
	}

	public static void getCellValue(int rowNum, int cellNum) throws IOException {
		
		DataFormatter formatter = new DataFormatter();
		Object val = formatter.formatCellValue(sheet.getRow(rowNum).getCell(cellNum)); //wont throw error irrespective of the string value
		System.out.println("Value with formatter is : "+ val);
		
		//String value = sheet.getRow(1).getCell(0).getStringCellValue(); // this will throw error if cell value is not string
		//System.out.println("Value of string is : "+ value);
	}
}
