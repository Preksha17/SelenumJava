package Ecartdesign;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import bsh.commands.dir;


public class Ecart_design {
	
		
	@FindBy(id="user-name")
	WebElement Username;
	@FindBy(id="password")
	WebElement Password;
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/form[1]/input[3]")
	WebElement Loginbutton;
	@FindBy(xpath="//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")
	WebElement Addtocart;
	@FindBy(id="shopping_cart_container")
	WebElement Cart_icon;
	@FindBy(xpath="//*[@id=\"contents_wrapper\"]/div[2]")
	WebElement Yourcart;
	@FindBy(xpath="//*[@id=\"cart_contents_container\"]/div/div[2]/a[1]")
	WebElement ContinueShoppingbutton;
	@FindBy(xpath= "//*[@id=\"cart_contents_container\"]/div/div[1]/div[3]/div[2]/div[2]/button")
	WebElement RemoveItem;
	@FindBy(xpath="//*[@id=\"cart_contents_container\"]/div/div[2]/a[2]")
	WebElement Checkout;
	
	
	public Ecart_design(WebDriver d)
	{
		PageFactory.initElements(d, this);
	}
	
	public void fuctionaltest()
	{
		Username.sendKeys("standard_user");
		Password.sendKeys("secret_sauce");
		Loginbutton.click();
		
	}
	public void addcarttest()
	{
		Addtocart.click();
		Cart_icon.click();
		System.out.println(Yourcart.getText());
		String Your_cart = Yourcart.getText();
		Assert.assertEquals(Your_cart, "Your Cart");
		{
			System.out.println("Cart screen tested");
		}
		
	}
	public void ContinueShopping()
	{
		ContinueShoppingbutton.click();
	}
	public void RemovefromCart()
	{
		RemoveItem.click();
		Checkout.click();
	}
	
	

}
