package selprog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Passingstringtotextfield {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Preksha S Shriyan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement EmailId = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		EmailId.sendKeys("spreksha17@gmail.com");
		WebElement Password = driver.findElement(By.id("pass"));
		Password.sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id=\"u_0_2\"]")).click();
	
		
		//driver.close();
		

	}

}
