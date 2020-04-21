package testngpackage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class windowhandles {
WebDriver driver;
	
	
	/*
	 * @BeforeTest public void driver_init() {
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:\\Users\\Preksha S Shriyan\\Downloads\\chromedriver_win32\\chromedriver.exe"
	 * );
	 * 
	 * driver=new ChromeDriver();
	 * driver.get("https://demoqa.com/automation-practice-switch-windows/");
	 * driver.manage().window().maximize();
	 * driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS); }
	 */
	
	@Test
	public void visitdemotab() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Preksha S Shriyan\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-switch-windows/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		WebElement Button1 = driver.findElement(By.id("button1"));
		Button1.click();
		String parent = driver.getWindowHandle();
		Set<String> s1= driver.getWindowHandles();//holds the window ID
		Iterator<String> i1=s1.iterator();
		while(i1.hasNext())
		{
		String child=i1.next();
		if(!parent.equals(child))
		{
		driver.switchTo().window(child);
		   driver.manage().window().maximize();
		   
		//Thread.sleep(1000);
		WebElement home =driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[1]/a/span/span"));
		Thread.sleep(2000);
		home.click();
	
		}
	
		{
		//	driver.close();
		}
		}
		driver.switchTo().window(parent);
		driver.close();
		}
	

}
