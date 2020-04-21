package selprog;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoItupload {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Preksha S Shriyan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://tinyupload.com/");
		 Thread.sleep(1000);
		 //driver.findElement(By.name("uploaded_file")).click();
		 WebElement browse =driver.findElement(By.xpath("/html[1]/body[1]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/table[1]/tbody[1]/tr[2]/td[1]/input[2]"));
		 browse.click();
		 Runtime.getRuntime().exec("‪C:\\\\Users\\\\Preksha S Shriyan\\\\Documents\\\\AutoIt_1.exe");
		 
		
	}

}
