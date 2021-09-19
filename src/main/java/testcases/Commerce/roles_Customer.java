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
import objects.Commerce.customer_roles_inspect;
import resorces.Commerce.Base;
import resorces.Commerce.ReadConfig;


public class roles_Customer extends Base{
	
	@Test (dataProvider="getdata")
  public void log3(String txtuser,String txtpass) throws IOException, InterruptedException
	{
		
	  Orange_HRM_Login ok=new Orange_HRM_Login(driver);
	 
	       //logs
	  ok.Username().clear();      //clearing default text
	  ok.Username().sendKeys(txtuser);
	  ok.Passcode().clear();
	  ok.Passcode().sendKeys(txtpass);
	  ok.btnlogin().click();
	     //logs
	 
	 
	  customer_roles_inspect cu=new customer_roles_inspect(driver);
	  
	  cu.btncustomer();
	  cu.btncustomerclk();
	  cu.clkadnew().click();
	  String uname=randomestring1();
	  cu.keyname(uname);
	  Thread.sleep(3000);
	  String sname=randomestring2();
	  cu.systemname(sname);
	  Thread.sleep(2000);
	  
	  cu.keyname(sname);
	  cu.saveit().click();
	  captureScreen(driver,"savi");
	  logger.info("completed");
	  

	
	}
	
	
	@DataProvider
	public Object[][] getdata() {
		
		Object[][] data =new Object[1][2];  //object [2][3] 2 means it contains 2 data types 3 means in data type no of lines 
		data[0][0]="admin@yourstore.com";
		data[0][1]="admin";
		
		
		return data;
	}
	
}
