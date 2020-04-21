package udemypackage;

import java.io.IOException;

public class ExcelcallingClass  {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String projectpath= System.getProperty("user.dir");
		System.out.println(projectpath);
		ExcelData excel = new  ExcelData("C:\\Users\\Preksha S Shriyan\\eclipse-workspace\\Udemy\\Excel\\Exceldata.xlsx", "Sheet1");
		//excel.getrow();
		//excel.getCellData(0, 0);
		//excel.getNumericalCellData(1, 1);
		
		
	}

}
