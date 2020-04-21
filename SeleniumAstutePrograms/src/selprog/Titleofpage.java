package selprog;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Titleofpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Preksha S Shriyan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://omsaicreche.blogspot.com/");
		driver.manage().window().maximize();
		WebElement logo = driver.findElement(By.className("title"));
		if (logo.isDisplayed())
		{
			System.out.println("Logo is displayed");	
			//System.out.println(logo.getAttribute("value"));
			System.out.println(logo.getText());
		}
		else
		{
			System.out.println("Logo is not displayed");		
		}	
		
		
		List<WebElement> links= driver.findElements(By.tagName("li"));
		System.out.println(links.size());
		for(int i=0; i<links.size();i++)
		{
			System.out.println(links.get(i).getText());
			links.get(i).click();
			driver.navigate().to("http://omsaicreche.blogspot.com/");;
			links= driver.findElements(By.tagName("li"));			
		}
		driver.close();
	}

}
