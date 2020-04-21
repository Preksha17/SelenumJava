package udemypackage;

import java.io.IOException;

public class ExcelDataProvider {

	public static Object[][] testdata(String excelpath,String sheetname) throws IOException
	{
		ExcelData ex = new  ExcelData(excelpath,sheetname);
		int rowcount= ex.getrow();
		int colcount= ex.getcol();
		System.out.println(rowcount);
		System.out.println(colcount);
		Object data[][]= new Object[rowcount-1][colcount];
		
		for(int i=1;i<rowcount;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				String CellData= ex.getCellData(i, j);
				System.out.println(CellData+":");
				data[i-1][j]=CellData;
			
			}
			System.out.println();
		}
		return data;
		
	} 

	public static void main(String[] args) throws IOException  {
		String aexcelpath="C:\\Users\\Preksha S Shriyan\\eclipse-workspace\\Udemy\\Excel\\Exceldata.xlsx";
		String asheetname= "Sheet1";
		testdata( aexcelpath,asheetname);
		
	}

}
