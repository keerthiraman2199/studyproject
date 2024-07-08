package studyproject;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class fileprojectone {

	public static void main(String[] args) throws IOException {
		String filelocation = "C:\\Users\\keerthi\\eclipse-workspace\\test data\\readandwritefile.xlsx";
		XSSFWorkbook wb = new XSSFWorkbook(filelocation);
		XSSFSheet sheet= wb.getSheetAt(0);
		int lastRowNum = sheet.getLastRowNum();
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println("inclusion of file" +physicalNumberOfRows);
		System.out.println("no.of.rows:" +lastRowNum);
		short lastCellNum = sheet.getRow(1).getLastCellNum();
		System.out.println("No .of.cells:" +lastCellNum);
		for(int i =1 ;i<=lastRowNum;i++) {
		XSSFRow row = sheet.getRow(i);
		for (int j=0;j<lastCellNum;j++) {
	    XSSFCell cell= row.getCell(j);
		String value = cell.getStringCellValue();
		System.out.println(value);
							
							
							
							
							
						}
			
		}
		
		

	}

}
