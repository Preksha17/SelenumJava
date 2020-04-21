package selprog;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datepicker {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Preksha S Shriyan\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		d.get("https://demoqa.com/datepicker/");
		Thread.sleep(2000);
		d.manage().window().maximize();
		WebElement date=d.findElement(By.xpath("//input[@id='datepicker']"));
		date.click();

		String expMonth="March 2020";
		String currentMonth =d.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		System.out.println(currentMonth);

		if(expMonth.equals(currentMonth))
		{
		System.out.println("Month is selected");
		}
		else
		{
		for(int i=0;i<12;i++)
		{
		WebElement next = d.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']"));
		next.click();
		String currentmonth=d.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		if(currentmonth.equals(expMonth))
		{
		System.out.println("Month is selected");
		break;
		}
		}
		}
		WebElement Month=d.findElement(By.xpath("//table[@class='ui-datepicker-calendar']")); 
		List<WebElement> AllDates =Month.findElements(By.tagName("td"));
		for(WebElement dates:AllDates)
		{
		if(dates.getText().equals("25"))
		{
		dates.findElement(By.linkText("25")).click();
		break;
		}
		}
		Thread.sleep(1000);


		}



}