package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLReader {
	
	public static void main(String [] args ) throws IOException {
		File aa = new File("D:/Anand/Test123.xlsx");
		//File aa = new File("D:/Anand/Test123.xlsx");
		FileInputStream fil = new FileInputStream(aa);
		
		XSSFWorkbook xlwb = new XSSFWorkbook(fil);
		XSSFSheet shname = xlwb.getSheetAt(0);
		XSSFRow row ;
		XSSFCell cell ;
		
		int lastrownum =shname.getLastRowNum();
		int columnnum = 2;
		System.out.println("The last row number is : "+lastrownum);
		
		for(int i=0;i<lastrownum;i++) {
			row = shname.getRow(i);
			for (int j = 0; j < columnnum; j++) {
				
				System.out.println("The data at row" +i+ ","+"column"+ j +":"+row.getCell(j));
				
			}
		}
		
		System.out.println("The xssf work book");
		
		
	}

}
