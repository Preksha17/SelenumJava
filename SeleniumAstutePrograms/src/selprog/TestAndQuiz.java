package selprog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TestAndQuiz {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Preksha S Shriyan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.testandquiz.com/selenium/testing.html");
		 driver.manage().window().maximize();
		 WebElement Title= driver.findElement(By.xpath("/html/body/div/div[1]/div"));
		 System.out.println(Title.getText());
		 System.out.println(driver.getTitle());
		 WebElement Desc= driver.findElement(By.xpath("/html/body/div/div[3]/div/b"));
		 System.out.println(Desc.getText());
		 Thread.sleep(1000);
		 WebElement Link = driver.findElement(By.xpath("/html/body/div/div[4]/div/p/a"));
		 Link.click();
		 Thread.sleep(10000);
		 driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");
		 Thread.sleep(5000);
		 WebElement Textbox= driver.findElement(By.xpath("//*[@id=\"fname\"]"));
		 Textbox.sendKeys("My First Automation");
		 WebElement button= driver.findElement(By.xpath("//*[@id=\"idOfButton\"]"));
		 button.click();
		 Thread.sleep(1000);
		 WebElement gender_radiobutton =driver.findElement(By.id("female"));
		 gender_radiobutton.click();
		 Thread.sleep(1000);
		 WebElement Automation_checkbox =driver.findElement(By.xpath("/html/body/div/div[8]/div/form/input[1]"));
		 System.out.println(Automation_checkbox.isSelected());
		 System.out.println(Automation_checkbox.isEnabled());
		 Automation_checkbox.click();
		 Thread.sleep(1000);
		 WebElement Dropdown = driver.findElement(By.xpath("//*[@id=\"testingDropdown\"]"));
		 Dropdown.click();
		 Select D_down =new Select(Dropdown);
		 D_down.selectByIndex(2);
		// WebElement Doubleclick = driver.findElement(By.xpath("/html/body/div/div[10]/div/p/button"));
		// Actions A_ref1= new Actions(driver);
		// A_ref1.doubleClick().build().perform();
		 WebElement alertbox_click =driver.findElement(By.xpath("/html/body/div/div[11]/div/p/button"));
		 alertbox_click.click();
		 driver.switchTo().alert().accept();
		 WebElement alertconfirmbox_click =driver.findElement(By.xpath("/html/body/div/div[12]/div/p[1]/button"));
		 alertconfirmbox_click.click();
		 Thread.sleep(1000);
		 driver.switchTo().alert().accept();
		 Actions A_ref2= new Actions(driver);
		 WebElement source =driver.findElement(By.xpath("//*[@id=\"sourceImage\"]"));
		 WebElement target =driver.findElement(By.xpath("//*[@id=\"targetDiv\"]"));
		 A_ref2.dragAndDrop(source,target).build().perform();
		
		 
		 driver.quit();
		 
	
	}

}
