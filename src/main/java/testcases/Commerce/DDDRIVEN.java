package testcases.Commerce;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import objects.Commerce.Orange_HRM_Login;
import resorces.Commerce.Base;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DDDRIVEN extends Base {
	

	@Test
	  public void log() throws IOException, InterruptedException
		{
			
		  Orange_HRM_Login ok=new Orange_HRM_Login(driver);
		
		    FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/datadrivern/excel/testit.xlsx");
			XSSFWorkbook wb = new XSSFWorkbook(file); // ref variable store as file and to connect excel
			XSSFSheet sheet = wb.getSheet("Sheet1"); // to connect sheet and naming sheet no

			int rowcount = sheet.getLastRowNum();
			for (int i = 1; i <= rowcount; i++) {

				// this for loop used to read each row
				XSSFRow row = sheet.getRow(i);

				String txtuser = row.getCell(0).getStringCellValue();
				String txtpass = row.getCell(1).getStringCellValue();
				

	   	                logger.info("url opening");                                          //logs
		                ok.Username().clear();                                              //clearing default text
		                ok.Username().sendKeys(txtuser);
		                  
		                ok.Passcode().clear();
		                ok.Passcode().sendKeys(txtpass);
		              
		                ok.btnlogin().click();
		                Thread.sleep(2000);
		               
		                driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		                captureScreen(driver,"omkar1142");
		                logger.info("loged ");  
		                
		                
		        
}
		}
}