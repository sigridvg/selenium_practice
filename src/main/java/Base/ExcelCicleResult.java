package Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCicleResult {
	
	@SuppressWarnings("null")
	public void writeData(String excelPath, String sheetName, int rowNumber, int columnNumber, String[] data) throws IOException {
		File file = new File(excelPath);
		FileInputStream fis = new FileInputStream(file);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		Row row = sheet.getRow(rowNumber);
		for (int i = 0; i<=columnNumber; i++){
			row.createCell(i).setCellValue(data[i]);
		}
		FileOutputStream fio = new FileOutputStream(file); 
		wb.write(fio);
		wb.close();
		
		
	}

	public void writeResult(String excelPath, String sheetName, int rowNumber, int columnNumber, String[] data) throws IOException {
		String result = "";
		int resultCol = -1;

		File file = new File(excelPath);
		FileInputStream fis = new FileInputStream(file);

		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet(sheetName);

		int TotalRow = sheet.getLastRowNum();
		XSSFRow headerRow = sheet.getRow(rowNumber);

		for (Cell cell : headerRow){
			result = cell.getStringCellValue();
			if(result.equals("DATOS")){
				resultCol = cell.getColumnIndex();
				break;
			}
		}
		if (resultCol == -1){
			System.out.println("Result column not found in sheet");
			return;
		}
		System.out.println("row " + TotalRow +  " col " );


		// Loop through all rows in the sheet
		// Start at row 1 as row 0 is our header row
		for(int count = 0;count<=sheet.getLastRowNum();count++){
			XSSFRow row = sheet.getRow(count);
			System.out.println("Running test case " + row.getCell(0).toString() +  " " +  row.getCell(1).toString());
			XSSFCell xSSFCell = row.getCell(resultCol);
			String value = count + "aa";
			//XSSFCell.setCellValue(String.valueOf(Boolean.parseBoolean(value)));
			}
		// }
		fis.close();
		FileOutputStream outputStream = new FileOutputStream(file);
		wb.write(outputStream);
		outputStream.close();
	}
	
	public static void main(String args[]) throws IOException {

	}

}
