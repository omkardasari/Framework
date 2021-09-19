package objects.Commerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resorces.Commerce.Base;

public class Orange_HRM_Login {
	
	public static WebDriver driver;           //must give public static method to invoke driver for another class
	
	public  Orange_HRM_Login(WebDriver driver)         //give (webdrive driver ) to invoke this method
	{
		this.driver=driver;
	}
	
	By login =By.xpath("//input[@id='Email']");
	By password = By.xpath("//input[@id='Password']");
	By clklogin  =By.xpath("//button[contains(text(),'Log in')]");
	
	
	
	public WebElement Username()
	{
		return driver.findElement(login);
	}
	public WebElement Passcode()
	{
		return driver.findElement(password);
	}
	public WebElement btnlogin() 
	{
	return driver.findElement(clklogin);
	}
	
	

}
