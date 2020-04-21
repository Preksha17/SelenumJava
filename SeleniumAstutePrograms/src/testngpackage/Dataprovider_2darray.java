package testngpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider_2darray {
	
	//public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
	WebDriver driver ;
		 @Test(dataProvider="facebook")
		 public void readdata(String un, String pwd)
		 {
			 System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Preksha S Shriyan\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
			 driver = new ChromeDriver();
			 driver.get("https://www.facebook.com/");
			 driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
			 driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(un);
			 driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(pwd);
			 System.out.println(driver.getTitle());
			 System.out.println(driver.getCurrentUrl());
			 
		 }
		 @DataProvider(name="facebook")
		 public  Object[][] get()
		 {
			Object[][]data =new Object[2][2];
			data[0][0]="abc";
			data[0][1]="a123";
			data[1][0]="abcde@";
			data[1][1]="a12312@";
			return data;
		 }
		 
		 @AfterTest
		 public void close()
		 {
			 driver.close();
			 
		 }
    
}
