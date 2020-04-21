import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().version(null).setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://google.com");
		driver.findElement(By.id("fakebox-input")).sendKeys("Welcome");;
		//id("fakebox-input");
		Thread.sleep(3000);
		

	}

}
