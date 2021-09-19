package testcases.Commerce;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import objects.Commerce.Orange_HRM_Login;
import objects.Commerce.customer_add_inspect;
import resorces.Commerce.Base;
import resorces.Commerce.ReadConfig;


public class LOGIN_Customer extends Base{
	
	@Test (dataProvider="getdata")
  public void log2(String txtuser,String txtpass) throws IOException, InterruptedException
	{
		
	  Orange_HRM_Login ok=new Orange_HRM_Login(driver);
	 
	logger.info("url opening");         //logs
	  ok.Username().clear();      //clearing default text
	  ok.Username().sendKeys(txtuser);
	  ok.Passcode().clear();
	  ok.Passcode().sendKeys(txtpass);
	  ok.btnlogin().click();
	  logger.info("url opened");   //logs
	 
	 
	  customer_add_inspect cs=new customer_add_inspect(driver);
	  
	  ReadConfig read = new ReadConfig();
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  cs.btncustomer();
	  cs.btncustomerclk();
	  cs.clkadnew().click();
	  String email=randomestring()+"@gmail.com";
	  cs.keyemail().sendKeys(email);
	  logger.info("mail typed");             //logs
	  cs.keypass().sendKeys(read.password());
	  cs.keyfirstname().sendKeys(read.frstname());
	  cs.keylastname().sendKeys(read.lastname());
	  cs.clkgender().click();
	  cs.adddob().sendKeys(read.dob());
	  cs.keycompany().sendKeys(read.cname());
	  cs.keytax().click();
	  cs.keyns().click();
	  logger.info("cmplted");        //logs
	  cs.keynsdrp().click();
//	 // cs.keycsrole().click();
//	 // cs.clkcrdrp().click();
		cs.keycomt().sendKeys(read.cmnt());
	  cs.clksave().click();
	  logger.info("my test is ");     
	captureScreen(driver,"ryhj");
	}
	
	
	@DataProvider
	public Object[][] getdata() {
		
		Object[][] data =new Object[1][2];  //object [2][3] 2 means it contains 2 data types 3 means in data type no of lines 
		data[0][0]="admin@yourstore.com";
		data[0][1]="admin";
		
		
		return data;
	}
	
	public void log2() throws IOException, InterruptedException
	{
		
	System.out.println("log2 method");
	logger.info("2nd method");
	}
}
