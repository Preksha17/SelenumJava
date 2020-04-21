package selprog;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_mouce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Preksha S Shriyan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		
		
		  WebElement Contribute= driver.findElement(By.xpath("//*[@id=\"global-nav\"]/nav/div/ul[2]/li[2]/a"));
		  WebElement Code= driver.findElement(By.xpath("//*[@id=\"global-nav\"]/nav/div/ul[2]/li[2]/ul/li[4]/a"));
		  Actions A_ref=new Actions(driver);
		  A_ref.moveToElement(Contribute).moveToElement(Code).build().perform();
		  
		 
		
		Actions A_ref1= new Actions(driver);
		
		/*
		 * WebElement contr=driver.findElement(By.xpath(xpathExpression)); Actions a =
		 * new Actions(driver); a.moveToElement(target).movet.build().perform();
		 * a.dragAndDrop(source, target) a.clickAndHold(contr).moveByOffset(100,
		 * 100).release().build().perform(); a.doubleClick().build().perform();
		 * a.contextClick(target).sendkeys(Keys.ARROW_DOWN).sendkeys(key.enetr)
		 */
		 

		WebElement Rightclick= driver.findElement(By.xpath("//*[@id=\"content\"]/p[2]/a"));
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("scroll(0,400)");
		A_ref1.doubleClick(Rightclick).build().perform();
		A_ref1.contextClick(Rightclick).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
		
		


	}

}
