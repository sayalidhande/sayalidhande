package selinium;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel2 {

	public static void main(String[] args)throws Exception {
		//Specify the location of excel file
		File src= new File("C:\\Users\\admin\\Documents\\ReadExcel.xlsx");
		
		//load file
		FileInputStream fis = new FileInputStream(src);
		
		//load workbook
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		//load worksheet
		XSSFSheet sh = wb.getSheet("Sheet1");
		
		//print the loaded sheet
		System.out.println(sh.getSheetName());
		
		//print username from excel
		System.out.println(sh.getRow(0).getCell(0).getStringCellValue());
		
		//print p4 from excel sheet
		System.out.println(sh.getRow(2).getCell(1).getStringCellValue());
		
		//print total no of rows
		System.out.println("Total rows:-"+sh.getPhysicalNumberOfRows());
		
		

	}

}
