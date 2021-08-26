package testNGFirst;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	Sheet excelSheet;
	Cell cl;

	public Object[][] excelToTwoDArray(String fileName, String sheetName) throws IOException {
		// read excel file
		// 1. FileInputStream
		// 2. WorkBook
		// 3. Sheet
		// 4. for/row/cell
		// read each cell and put into array.
		// String s =Cell.getStrin();
		// Ojbect[][]

		// int []x;
		// x = new int[6];
		// x[0]=s;
		Object[][] tabArray;

		FileInputStream excelFileRead = new FileInputStream(fileName);
		Workbook excelWBook = new XSSFWorkbook(excelFileRead);

		excelSheet = excelWBook.getSheet(sheetName);

		int totalRows = excelSheet.getPhysicalNumberOfRows();
		int totalCols = excelSheet.getRow(0).getPhysicalNumberOfCells();

		// t[row][col]
		// deduct one row because of header row
		tabArray = new Object[totalRows - 1][totalCols];

		for (int row = 1; row < totalRows; row++) {
			for (int col = 0; col < totalCols; col++) {
				// add row+1 to get data after header row
				tabArray[row - 1][col] = getCellData(row, col);

			}
		}

		return tabArray;
	}

	public String getCellData(int row, int col) {

		Cell c = excelSheet.getRow(row).getCell(col);
		String s = "";
		if (c.getCellType() == Cell.CELL_TYPE_STRING) {
			 s = c.getStringCellValue();

		} else if (c.getCellType() == c.CELL_TYPE_NUMERIC) {
			if (c.getCellType() % 1 == 0) {
				int e = (int) c.getNumericCellValue();
				s = e + "";
			} else {
				double m = c.getNumericCellValue();
				s = m + "";
			}
		}
		return s;
	}

}
