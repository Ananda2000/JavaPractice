package FileHandling;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class xlwriter {
	
	
	
		
		public static void main(String [] args ) throws IOException {
			//System.setProperty("", value)
			/*File aa = new File("D:/Anand/Test1234.xlsx");
			//File aa = new File("D:/Anand/Test123.xlsx");
			FileInputStream fil = new FileInputStream(aa);
			FileOutputStream fou = new FileOutputStream(aa);
			XSSFWorkbook xlwb = new XSSFWorkbook(fil);
			XSSFSheet shname = xlwb.getSheetAt(0);
			//XSSFRow row ;
		//	XSSFCell cell ;
			
				shname.getRow(1).createCell(1).setCellValue("pass");
				shname.getRow(1).createCell(1).setCellValue("pass");
			
			xlwb.write(fou);
			fou.flush();
			fou.close();
		//SSS	fil.close();
			
			System.out.println("The xssf work book");
			
			
		}
*/
			
		File file1 = new File("D:\\Anand\\Test1234.xlsx");
		FileInputStream fis = new FileInputStream(file1);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		for(int i=0;i<6;i++) {
		Row row = sheet.createRow(i);
		for(int j=0;j<6;j++) {
		Cell name = row.createCell(j);
		System.out.println("Anand");
		name.setCellValue("Anand");
		}
		}
		//sheet.getRow(0).createCell(0).setCellValue("pass");
		//sheet.getRow(0).createCell(2).setCellValue("fail");
		
	FileOutputStream fos = new FileOutputStream(file1);
	wb.write(fos);
	
		}
	}	

