package reuseablefns;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadExcelData {
	public File inputWorkbook;
	public Sheet sheet;
	public ReadExcelData(String fileName, String sheetName) throws BiffException, IOException 
	{
		inputWorkbook = new File(fileName);
		Workbook w;
		inputWorkbook.getAbsoluteFile();
		w = Workbook.getWorkbook(inputWorkbook);
		sheet = w.getSheet(sheetName);
	}
	public String readData(int i,int j) {
		Cell cell = sheet.getCell(i, j);
		return cell.getContents();
	}

}