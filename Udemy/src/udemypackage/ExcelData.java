package udemypackage;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelData {
	static String projectpath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	public   ExcelData(String excelpath,String sheetname) {
		//projectpath= System.getProperty("user.dir");
		try {
			workbook=new XSSFWorkbook(excelpath);
			sheet=workbook.getSheet(sheetname);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String [] args) throws IOException
	{ 
		getrow();
		getCellData(0,0);
		getNumericalCellData(1,1 );
	}
	public static int getrow() 
	{
		int rowCount = 0;
		try {
		
	    rowCount = sheet.getPhysicalNumberOfRows();
		//System.out.println("Row count:"+rowCount);
		
	}catch(Exception e)
		{
		System.out.println(e);
		System.out.println(e.getMessage());
		System.out.println(e.getStackTrace());
		System.out.println(e.getCause());
		}
		return rowCount;
	}
	public static int getcol() 
	{
		int colCount = 0;
		try {
		
		colCount = sheet.getRow(0).getPhysicalNumberOfCells();
		//System.out.println("Row count:"+colCount);
		
		
	}catch(Exception e)
		{
		System.out.println(e);
		System.out.println(e.getMessage());
		System.out.println(e.getStackTrace());
		System.out.println(e.getCause());
		}
		return colCount;
	}
	public static String getCellData(int row_num, int col_num) throws IOException
	{
		String cellData= sheet.getRow(row_num).getCell(col_num).getStringCellValue();
		//System.out.println("CellData:"+cellData);
		return cellData;
		
	}
	public static double getNumericalCellData(int row_num, int col_num) throws IOException
	{
		Double numCellData= sheet.getRow(row_num).getCell(row_num).getNumericCellValue();
		System.out.println("NumCellData:"+numCellData);
		return numCellData;
		
	}
	
	

}
