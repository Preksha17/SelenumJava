package SeleniumjavaFramework.SeleniumjavaFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestJava {
	public static void main(String[] args) throws InterruptedException {
		String Projectpath = System.getProperty("user.dir");// getting project path
		System.out.println("Projectpath" + Projectpath);
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\Preksha S Shriyan\\eclipse-workspace\\SeleniumjavaFramework\\drivers\\geckodriver\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();

		// System.setProperty("webdriver.ie.driver","C:\\Users\\Preksha S
		// Shriyan\\eclipse-workspace\\SeleniumjavaFramework\\drivers\\IEDriver\\IEDriverServer.exe"
		// );
		// WebDriver driver = new InternetExplorerDriver();
				System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Preksha S Shriyan\\eclipse-workspace\\SeleniumjavaFramework\\drivers\\ChromeDriver\\ChromeDriver.exe");
				 WebDriver driver = new ChromeDriver();
				 
		driver.get("https://www.seleniumhq.org");
		Thread.sleep(3000);
		driver.close();
//	driver.quit();

	}
}
