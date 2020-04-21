package way2automationtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import way2automationdesign.Automatiodesign;

public class Automationtest {
	
	WebDriver d;
	//public static ExtentReports extent;
	//@BeforeSuite
	//public void setextent()
	{

		//	extent = ExtentManager.createInstance("extent.html");
			//ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
			//extent.attachReporter(htmlReporter);
		
		
		
	}
	@Test
	public void get() 
	{

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Preksha S Shriyan\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		d=new ChromeDriver();
		d.get("http://way2automation.com/way2auto_jquery/index.php");
	
		WebElement loginUI= d.findElement(By.xpath("//*[@id=\\\"wrapper\\\"]/div[2]/div[2]/div[1]/ul/li[1]/a/figure"));
		loginUI.click();
		Automatiodesign D1=new Automatiodesign(d);
		D1.register();
		
	}

}
