package resorces.Commerce;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import org.apache.commons.io.FileUtils;

public class Base {
	
	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	

	public WebDriver driver;
	public Properties prop;        //if u want to call this give at class level
    public  Logger logger;
	@BeforeTest
	public WebDriver initializeDriver() throws IOException {

		ReadConfig read = new ReadConfig();
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Omkar\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get(read.getApplicationURL());
			String titile =driver.getTitle();
			System.out.println("my titile is"+ titile);
			logger=Logger.getLogger("omkartest1");                 //logger class
			PropertyConfigurator.configure("Log4j.properties");
			
			return driver;
	}
	
	
	@AfterTest
	public WebDriver teaddown() {
		driver.close();
	return driver;
	}
		
	public File captureScreen(WebDriver driver, String tname) throws IOException {
	TakesScreenshot ts = (TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
	FileUtils.copyFile(source, target);
	System.out.println("Screenshot taken");
	return target;
}
	public static String randomestring() {
		String generatedString1 = RandomStringUtils.randomAlphabetic(5);
		return (generatedString1);
	}
	
	public static String randomestring1() {
		String generatedString2 = RandomStringUtils.randomAlphabetic(5);
		return (generatedString2);
	}
	public static String randomestring2() {
		String generatedString3 = RandomStringUtils.randomAlphabetic(5);
		return (generatedString3);
	}
}










