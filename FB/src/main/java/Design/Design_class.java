package Design;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Design_class {
	
	

	@FindBy(xpath="//*[@id=\"email\"]")
	WebElement email;
	@FindBy(id="pass")
	WebElement password;
	@FindBy(xpath="//*[@id=\"u_0_b\"]")
	WebElement loginbutton;
	public Design_class(WebDriver driver)
	{
		PageFactory.initElements(driver,this);	
	} 
	
	public void get()
	{
		email.sendKeys("testjira50@gmail.com");
		password.sendKeys("admin");
		loginbutton.click();
		
	}
	//}
}
