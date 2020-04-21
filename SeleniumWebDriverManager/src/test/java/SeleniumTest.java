import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {
public static void main(String[] args) {
	WebDriverManager.chromedriver().version("2.36").setup();
	 WebDriver driver = new ChromeDriver();
	 //driver.get("https://google.com");
	 
	//WebElement textbox = driver.findElement(By.id("fakebox-input"));
	// textbox.sendKeys("automation step by step");
	 driver.get("https://facebook.com");
	 String  tagName = "";
	tagName = driver.findElement(By.id("email")).getTagName(); 
	 System.out.println(tagName);
	// WebElement textbox = driver.findElement(By.xpath("//input[@id='email'"));
	 //textbox.sendKeys("preksha");
	 String expectedTitle = "Welcome: Mercury Tours";
	 
	 String actualTitle = "";
	 actualTitle = driver.getTitle();
	 if (actualTitle.contentEquals(expectedTitle)){
         System.out.println("Test Passed!");
     } else {
         System.out.println("Test Failed");
     }
    System.out.println(actualTitle); 
    
    driver.close();
    System.exit(0);
}
}