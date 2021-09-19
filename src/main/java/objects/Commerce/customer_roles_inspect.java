package objects.Commerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class customer_roles_inspect {
	
	public static WebDriver driver;
	
	public  customer_roles_inspect(WebDriver driver)         //give (webdrive driver ) to invoke this method
	{
		this.driver=driver;
	}
	
	
	By customers =By.xpath("//ul[@class='nav nav-pills nav-sidebar flex-column nav-legacy']//li//i[@class='nav-icon far fa-user']");
	By customclk =By.xpath("//p[contains(text(),'Customer roles')]");
	By addnew =By.xpath("//i[@class='fas fa-plus-square']");
	By name =By.xpath("//input[@id='Name']");
	By sysname =By.xpath("//input[@id='SystemName']");

	
	By save =By.xpath("//div[@class='float-right']//button[@name='save']");
	
	
	public void btncustomer() {
		 driver.findElement(customers).click();
	}
	public void btncustomerclk() {
		 driver.findElement(customclk).click();
	}
	public WebElement clkadnew() {
		return driver.findElement(addnew);
	}
	public void keyname(String typename) {
		 driver.findElement(name).sendKeys(typename);
	}
	public void systemname(String sysna) {
		 driver.findElement(sysname).sendKeys(sysna);
	}
	public WebElement saveit() {
		 return driver.findElement(sysname);
	}
	
	
	

	
	
	
	
	
	
	
	
	

	
	

}
