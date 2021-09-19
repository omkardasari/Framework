package objects.Commerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class customer_add_inspect {
	
	public static WebDriver driver;
	
	public  customer_add_inspect(WebDriver driver)         //give (webdrive driver ) to invoke this method
	{
		this.driver=driver;
	}
	
	
	By customers =By.xpath("//ul[@class='nav nav-pills nav-sidebar flex-column nav-legacy']//li//i[@class='nav-icon far fa-user']");
	By customclk =By.xpath("//p[text()=' Customers']");
	By addnew =By.xpath("//i[@class='fas fa-plus-square']");
	By email =By.xpath("//input[@id='Email']");
	By passw =By.xpath("//input[@id='Password']");
	By first =By.xpath("//input[@id='FirstName']");
	By last =By.xpath("//input[@id='LastName']");
	By gender =By.xpath("//input[@id='Gender_Male']");
	By dob =By.xpath("//input[@id='DateOfBirth']");
	By company =By.xpath("//input[@id='Company']");
	By tax =By.xpath("//input[@id='IsTaxExempt']");
	By newsletteer =By.xpath("//body/div[3]/div[1]/form[1]/section[1]/div[1]/div[1]/nop-cards[1]/nop-card[1]/div[1]/div[2]/div[9]/div[2]/div[1]/div[1]/div[1]/div[1]");
	By nsdrp =By.xpath("//li[contains(text(),'Test store 2')]");
	By customerrole =By.xpath("//body/div[3]/div[1]/form[1]/section[1]/div[1]/div[1]/nop-cards[1]/nop-card[1]/div[1]/div[2]/div[10]/div[2]/div[1]/div[1]/div[1]/div[1]");
	By crdrp =By.xpath("//li[contains(text(),'Guests')]");
	By commnet =By.xpath("//textarea[@id='AdminComment']");
	
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
	public WebElement keyemail() {
		return driver.findElement(email);
	}
	public WebElement keypass() {
		return driver.findElement(passw);
	}
	public WebElement keyfirstname() {
		return driver.findElement(first);
	}
	public WebElement keylastname() {
		return driver.findElement(last);
	}
	public WebElement clkgender() {
		return driver.findElement(gender);
	}
	public WebElement adddob() {
		return driver.findElement(dob);
	}
	public WebElement keycompany() {
		return driver.findElement(company);
	}
	public WebElement keytax() {
		return driver.findElement(tax);
	}
	public WebElement keyns() {
		return driver.findElement(newsletteer);
	}
	public WebElement keynsdrp() {
		return driver.findElement(nsdrp);
	}
	public WebElement keycsrole() {
		return driver.findElement(customerrole);
	}
	public WebElement clkcrdrp() {
		return driver.findElement(crdrp);
	}
	public WebElement keycomt() {
		return driver.findElement(commnet);
	}
	public WebElement clksave() {
		return driver.findElement(save);
	}
	
	

	
	
	
	
	
	
	
	
	

	
	

}
