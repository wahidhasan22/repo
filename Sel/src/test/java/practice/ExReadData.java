package practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ExReadData {
Sheet excelSheet;
	public Object[][] TwoDArray(String fileName,String sheetName) throws IOException{
		Object[][] tabArray;
		FileInputStream fis= new FileInputStream(fileName);
		Workbook wb=new HSSFWorkbook(fis);
		excelSheet=wb.getSheet(sheetName);
		int totalRows=excelSheet.getPhysicalNumberOfRows();
		int totalCol=excelSheet.getRow(0).getPhysicalNumberOfCells();
		
		tabArray=new Object[totalRows-1][totalCol];
		
		for(int row=1;row<totalRows;row++) {
			for(int col=0;col<totalCol;col++) {
				tabArray[row-1][col]= getCellData(row, col);
			}
		}
		return tabArray;
		
	}
	
	public String getCellData(int row, int col) {
		Cell cell=excelSheet.getRow(row).getCell(col);
		String cellData=cell.getStringCellValue().trim();
		return cellData;
	}
	
	
}
