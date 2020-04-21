package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import Design.Design_class;

public class test_class {
WebDriver d;
@Test
public void get1()
{

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Preksha S Shriyan\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
	d=new ChromeDriver();
	d.get("https://facebook.com/");
	Design_class d1= new Design_class(d);
	d1.get();
}

}