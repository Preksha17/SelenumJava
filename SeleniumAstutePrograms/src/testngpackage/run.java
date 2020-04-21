package testngpackage;

import org.testng.annotations.Test;

public class run extends CrossBrowser {
	//public static void main(String[] args)
	
	CrossBrowser r1= new CrossBrowser();
	@Test
	public void g()
	{
	
	r1.get("firefox");
	r1.get("chrome");
	}
	

	

}
