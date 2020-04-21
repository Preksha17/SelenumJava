package testngpackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DateSelection {
WebDriver driver;
	
	
	@BeforeTest
	/*
	 * public void driver_init() throws InterruptedException {
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:\\Users\\Preksha S Shriyan\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe"
	 * );
	 * 
	 * driver=new ChromeDriver(); driver.get("https://demoqa.com/datepicker/");
	 * driver.manage().window().maximize();
	 * driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
	 * //Thread.sleep(3000); }
	 */
	
	@Test
	public void visitdemotab() throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Preksha S Shriyan\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/datepicker/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		WebElement date=driver.findElement(By.xpath("//input[@id='datepicker']"));
		date.click();
		String expMonth="March 2020";
		String currentMonth =driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		System.out.println(currentMonth);
		for(int i=0;i<12;i++)
		{
			WebElement next= driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e'] "));
			next.click();
			String currentMont =driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();

			if(expMonth.equals(currentMont))
			{
				System.out.println("Month slected");
				break;
			}
		}
		
			WebElement date1= driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table"));
			List<WebElement> AllDates =date1.findElements(By.tagName("td"));
			for(WebElement dates:AllDates)
			{
			if(dates.getText().equals("25"))
			{
			dates.findElement(By.linkText("25")).click();
			break;
			}
			}
			Thread.sleep(1000);
            driver.close();
		
	}

}
