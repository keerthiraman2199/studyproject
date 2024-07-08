package studyproject;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class files {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
String location = "C:\\Users\\keerthi\\eclipse-workspace\\test data\\readandwritefile.xlsx";
XSSFWorkbook wbook = new XSSFWorkbook(location);
XSSFSheet sheet = wbook.getSheetAt(0);

for (int i = 1; i <=4; i++) {
	XSSFRow row = sheet.getRow(i);
	for (int j = 0; j < 4; j++) {
		XSSFCell cell = row.getCell(j);
		String value = cell.getStringCellValue();
		System.out.println(value);
	}
}
wbook.close();
	}

}
