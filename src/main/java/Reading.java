import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Reading {
	public static void main(String[] args) throws IOException {
		File f= new File("Excel/dataread.xlsx");
		FileInputStream stream= new FileInputStream(f);
		Workbook w= new XSSFWorkbook(stream);
		Sheet s= w.getSheet("Sheet1");
		
		System.out.println(s.getRow(2).getCell(0).getNumericCellValue());

			
		
	}

}
