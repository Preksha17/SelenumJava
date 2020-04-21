package Ecarttest;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import Ecartdesign.Ecart_design;


public class Ecart_test {
	WebDriver d;
	@Test
	public void get() throws InterruptedException
	{

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Preksha S Shriyan\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	BasicConfigurator.configure();
	Logger log = Logger.getLogger("Ecart_test");//logger for class
	PropertyConfigurator.configure("log.properties");	
		d=new ChromeDriver();
		d.get("https://www.saucedemo.com/");
		log.info("url launched");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		log.info("maximized browser");
		Ecart_design d1= new Ecart_design(d);
		d1.fuctionaltest();
		log.info("function called");
		System.out.println(d.getCurrentUrl());
		d1.addcarttest();
		d1.ContinueShopping();
		String Currenturl = d.getCurrentUrl();
		String Inventryurl ="https://www.saucedemo.com/inventory.html\r\n";
		if(Currenturl.equals(Inventryurl))
		{
			System.out.println("Navigated to Inventry screen to continue shopping");
		}
		d1.addcarttest();
		d1.RemovefromCart();
		String CheckoutUI = "https://www.saucedemo.com/checkout-step-one.html";
		String CurrentUrl = d.getCurrentUrl();
		if(CurrentUrl.equals(CheckoutUI))
			{
			System.out.println("In checkout UI");
			}
		log.warning(Inventryurl);
		
	}

}
