package selprog;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class redbussearch {

	
			public static void main(String[] args) throws InterruptedException {
				// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Preksha S Shriyan\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
				
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.redbus.in/");
				Thread.sleep(3000);
				//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	     		//driver.switchTo().alert().dismiss();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"src\"]")).click();
				driver.findElement(By.xpath("//*[@id=\"src\"]")).sendKeys("Udupi");
				driver.findElement(By.xpath("//*[@id=\"dest\"]")).sendKeys("Bangalore");
				


	}

}
