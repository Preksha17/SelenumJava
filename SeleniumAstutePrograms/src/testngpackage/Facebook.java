package testngpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Facebook {
	WebDriver driver;
	
	
	/*
	 * @BeforeTest public void driver_init() {
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:\\Users\\Preksha S Shriyan\\Downloads\\chromedriver_win32\\chromedriver.exe"
	 * );
	 * 
	 * driver=new ChromeDriver(); driver.get("https://www.facebook.com/");
	 * driver.manage().window().maximize();
	 * driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS); }
	 */
	
	@Test
	public void input() throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Preksha S Shriyan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		WebElement first_name= driver.findElement(By.name("firstname"));
		first_name.sendKeys("Jira");
		Thread.sleep(1000);
		WebElement second_name= driver.findElement(By.name("lastname"));
		second_name.sendKeys("Tester");
		WebElement Email_id= driver.findElement(By.name("reg_email__"));
		Email_id.sendKeys("testjira50@gmail.com");
		Thread.sleep(1000);
		WebElement Email_id_confirmation= driver.findElement(By.name("reg_email_confirmation__"));
		Email_id_confirmation.sendKeys("testjira50@gmail.com");
		Thread.sleep(1000);
		WebElement pw= driver.findElement(By.xpath("//*[@id=\"u_0_w\"]"));
		pw.sendKeys("Admin123*");
		WebElement day1= driver.findElement(By.id("day"));
		day1.click();
		Select Day=new Select(day1);
		//Day.selectByValue(17);
		Day.selectByVisibleText("17");
		WebElement month1= driver.findElement(By.id("month"));
		month1.click();
		Select Month=new Select(month1);
		Month.selectByValue("4");
		Thread.sleep(1000);
		WebElement year1= driver.findElement(By.id("year"));
		year1.click();
		Select Year=new Select(year1);
		Year.selectByValue("1995");
		WebElement signup_button =driver.findElement(By.name("websubmit"));
		signup_button.click();
	}
	@AfterTest
	public void bye()
	{
		driver.quit();
	}

   
}
