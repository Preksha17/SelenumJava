package selprog;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshots {
	public static void main(String[] args) throws IOException  {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Preksha S Shriyan\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
		TakesScreenshot screenshot_ref_1 =(TakesScreenshot)driver;
		File source = screenshot_ref_1.getScreenshotAs(OutputType.FILE);
		File Dest= new File("E:\\Screenshotsjava\\screen.png");
		FileHandler.copy(source,Dest);
		//Thread.sleep(1000);
		
		
	}

}