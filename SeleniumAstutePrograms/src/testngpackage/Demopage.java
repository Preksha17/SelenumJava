package testngpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demopage {
WebDriver driver;
	
	
	/*
	 * @BeforeTest public void driver_init() {
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:\\Users\\Preksha S Shriyan\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe"
	 * );
	 * 
	 * driver=new ChromeDriver(); driver.get("https://www.toolsqa.com/");
	 * driver.manage().window().maximize();
	 * driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS); }
	 */
	@Test
	public void visitdemotab()
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Preksha S Shriyan\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		WebElement Demosites = driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[6]/a/span/span"));
		WebElement Demo =driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[6]/ul/li[2]/a/span/span"));
		 Actions A_ref=new Actions(driver);
		  A_ref.moveToElement(Demosites).moveToElement(Demo).build().perform();
		  
		driver.close();
	}
	

}
