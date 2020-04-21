package edureka;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HandleAllControls {
static WebDriver driver;
@Test
public static void EdurekaProfile() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Preksha S Shriyan\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.edureka.co/");
	System.out.println("page launched");
	Thread.sleep(1000);
	driver.manage().window().maximize();
	System.out.println("maximised");
	Thread.sleep(1000);	
	System.out.println("before dismiss alert");
	driver.switchTo().alert().dismiss();
	System.out.println("dismiss alert");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[@class='signin top-signup register-user giTrackElementHeader hidden-xs']")).click();
	Thread.sleep(1000);
	System.out.println("sign in button");
	WebElement Login= driver.findElement(By.linkText("Log In"));
	Login.click();
	//Actionobject.moveToElement(Login).click();
	WebDriverWait wait = new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("si_popup_email")));
	driver.findElement(By.id("si_popup_email")).sendKeys("spreksha17@gmail.com");
	driver.findElement(By.id("si_popup_passwd")).sendKeys("Admin");
	driver.findElement(By.linkText("Login")).click();
}

}
