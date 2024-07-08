package studyproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class anotherprogram {
	public static void main(String[] args) throws IOException {
	File file = new File("C:\\Users\\keerthi\\eclipse-workspace\\test data\\readandwritefile.xlsx");
	FileInputStream inputstream = new FileInputStream(file);
	XSSFWorkbook wb= new XSSFWorkbook(inputstream);
	XSSFSheet sheet = wb.getSheet("Sheet1");
	XSSFRow row = sheet.getRow(1);
	XSSFCell cell = row.getCell(2);
	String address= cell.getStringCellValue();
	System.out.println("address:" + address);
	
	}
}
