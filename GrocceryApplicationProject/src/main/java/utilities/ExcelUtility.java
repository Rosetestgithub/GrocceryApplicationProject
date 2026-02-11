package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	static FileInputStream f;
	static XSSFWorkbook w;
	static XSSFSheet s;
	public static String getStringData(int a, int b, String sheet) throws IOException {
		f=new FileInputStream("C:\\Users\\HOME\\git\\GrocceryApplicationProject\\GrocceryApplicationProject\\src\\test\\resources\\TestData.xlsx");
		w=new XSSFWorkbook(f);
		s=w.getSheet(sheet);
		XSSFRow row=s.getRow(a);
		XSSFCell cell=row.getCell(b);
		return cell.getStringCellValue();
	}
}
//"C:\Users\HOME\git\GrocceryApplicationProject\GrocceryApplicationProject\src\test\resources\TestData.xlsx"