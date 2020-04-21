package selprog;

//import org.openqa.selenium.Alert
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FB_Signup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Preksha S Shriyan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//WebElement first_name= driver.findElement(By.className("inputtext _58mg _5dba _2ph-"));
		//
		WebElement first_name= driver.findElement(By.name("firstname"));
		first_name.sendKeys("Jira");
		Thread.sleep(1000);
		WebElement second_name= driver.findElement(By.name("lastname"));
		second_name.sendKeys("Tester");
		Thread.sleep(1000);
		WebElement Email_id= driver.findElement(By.name("reg_email__"));
		Email_id.sendKeys("testjira50@gmail.com");
		Thread.sleep(1000);
		WebElement Email_id_confirmation= driver.findElement(By.name("reg_email_confirmation__"));
		Email_id_confirmation.sendKeys("testjira50@gmail.com");
		Thread.sleep(1000);
		WebElement pw= driver.findElement(By.xpath("//*[@id=\"u_0_w\"]"));
		pw.sendKeys("Admin123*");
		
		/* String Firstname_clear = first_name.getAttribute("Value");
		System.out.println(Firstname_clear);
		int firstname_length = Firstname_clear.length();
		for(int i=firstname_length; i>0; i--)
		{
			first_name.sendKeys(Keys.BACK_SPACE);
		} */
	
		
		
		
		
		WebElement day1= driver.findElement(By.id("day"));
		day1.click();
		Select Day=new Select(day1);
		//Day.selectByValue(17);
		Day.selectByVisibleText("17");
		WebElement month1= driver.findElement(By.id("month"));
		month1.click();
		Select Month=new Select(month1);
		Month.selectByValue("4");
		Thread.sleep(1000);
		WebElement year1= driver.findElement(By.id("year"));
		year1.click();
		Select Year=new Select(year1);
		Year.selectByValue("1995");
		Thread.sleep(1000);
		WebElement gender= driver.findElement(By.xpath("//*[@id=\"u_0_6\"]"));
		gender.click();
		WebElement signup_button =driver.findElement(By.name("websubmit"));
		signup_button.click();
		/*
		 * WebElement contr=driver.findElement(By.xpath(xpathExpression)); Actions a =
		 * new Actions(driver); a.moveToElement(target).movet.build().perform();
		 * a.dragAndDrop(source, target) a.clickAndHold(contr).moveByOffset(100,
		 * 100).release().build().perform(); a.doubleClick().build().perform();
		 * a.contextClick(target).sendkeys(Keys.ARROW_DOWN).sendkeys(key.enetr)
		 */
	}

}