package testngpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {
	

     static WebDriver driver;
	@Parameters("Browser")
	@Test
	public static void get(String Browser) {
		
		if (Browser.equalsIgnoreCase("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Preksha S Shriyan\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(Browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Preksha S Shriyan\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
			 driver = new ChromeDriver();
			
		}
		driver.get("https://demoqa.com/datepicker/");
		
	}
}
	





