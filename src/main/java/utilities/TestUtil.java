package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFRow;

import base.TestBase;

public class TestUtil extends TestBase {

	public static Workbook wb;
	private static XSSFRow row = null;

		public TestUtil(String path) throws IOException{

		try {
			wb = WorkbookFactory.create(new FileInputStream(path));
		} catch (Exception e) {
		}
	}

	public static int getRowCount(String sheet) {
		int rowCount = 0;
		try {
			rowCount = wb.getSheet(sheet).getLastRowNum();
		} catch (Exception e) {
		}
		return rowCount;
	}

	public static int getColumnCount(String sheet) {

		row = (XSSFRow) wb.getSheet(sheet).getRow(0);

		if (row == null)
			return -1;
		return row.getLastCellNum();
	}

	public static String getCellValue(String sheet, int row, int column) {
		String value = "";
		try {
			value = wb.getSheet(sheet).getRow(row).getCell(column).toString();
			try {
				Double.parseDouble(value);
				value = Integer.toString((int) wb.getSheet(sheet).getRow(row).getCell(column).getNumericCellValue());
			} catch (NumberFormatException e) {
			}
		} catch (Exception e) {
		}
		return value;
	}
	
	public void switchToFrames() {
		driver.switchTo().frame("");
	}

}
