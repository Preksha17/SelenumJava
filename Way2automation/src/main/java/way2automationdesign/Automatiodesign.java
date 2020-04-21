package way2automationdesign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Automatiodesign {
	
	@FindBy(xpath="//*[@id=\"load_form\"]/fieldset[1]/input")
	WebElement name;
	@FindBy(xpath="//*[@id=\"load_form\"]/fieldset[2]/input")
	WebElement usernumber;
	@FindBy(xpath="//*[@id=\"load_form\"]/fieldset[3]/input")
	WebElement usergmail;
	@FindBy(xpath="//*[@id=\"load_form\"]/fieldset[4]/select")
	WebElement countrylist;
	@FindBy(xpath="//*[@id=\"load_form\"]/fieldset[5]/input")
	WebElement City;
	@FindBy(xpath="//*[@id=\"load_form\"]/fieldset[6]/input")
	WebElement username;
	@FindBy(xpath="//*[@id=\"load_form\"]/fieldset[7]/input")
	WebElement password;
	public Automatiodesign(WebDriver d)
	{
		PageFactory.initElements(d, this);
	}
	public void register()
	{
		name.sendKeys("preksha");
		usernumber.sendKeys("9964524360");
		usergmail.sendKeys("spreksha17@gmail.com");
		Select Cntry= new Select(countrylist);
		Cntry.selectByVisibleText("India");
		
		
	}

}
