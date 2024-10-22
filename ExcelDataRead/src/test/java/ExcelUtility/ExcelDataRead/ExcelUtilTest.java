package ExcelUtility.ExcelDataRead;

import java.io.IOException;

public class ExcelUtilTest {

	public static void main(String[] args) throws IOException {
		
		String excelPath = "./Data/TestData.xlsx";
		String sheetName = "Sheet1";
		
		ExcelUtils excel = new ExcelUtils(excelPath, sheetName);
		
		excel.getRowCount();
		excel.getCellValue(1, 0);
		excel.getCellValue(1, 1);
		excel.getCellValue(1, 2);
	}

}
