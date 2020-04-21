import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class edurekaproject {

	public static void main(String[] args) throws InterruptedException {
		
			
	
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Preksha S Shriyan\\Downloads\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver= new ChromeDriver();
				//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Preksha S Shriyan\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
				//WebDriver driver = new FirefoxDriver();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.get("https://www.edureka.co/");
				System.out.println("page launched");
				Thread.sleep(1000);
				driver.manage().window().maximize();
				System.out.println("maximised");
				Thread.sleep(1000);	
				System.out.println("before dismiss alert");
				//driver.switchTo().alert().dismiss();
				System.out.println("dismiss alert");
				Thread.sleep(1000);
				System.out.println("sign in button");
				WebElement Login= driver.findElement(By.linkText("Log In"));
				Login.click();
				driver.findElement(By.id("si_popup_email")).sendKeys("spreksha17@gmail.com");
				driver.findElement(By.id("si_popup_passwd")).sendKeys("Admin");
				System.out.println("login");
				driver.findElement(By.linkText("Login")).click();
				System.out.println("login aytu");
			}

	}

