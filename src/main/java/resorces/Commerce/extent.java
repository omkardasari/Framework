package resorces.Commerce;
//package resorces.OrangeHRM;
//
//import java.io.File;
//import java.io.IOException;
//import java.text.SimpleDateFormat;
//import java.util.Collection;
//import java.util.Date;
//import java.util.List;
//
//import org.testng.ITestContext;
//import org.testng.ITestNGMethod;
//import org.testng.ITestResult;
//import org.testng.TestListenerAdapter;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.Status;
//import com.aventstack.extentreports.markuputils.ExtentColor;
//import com.aventstack.extentreports.markuputils.MarkupHelper;
//import com.aventstack.extentreports.reporter.ExtentSparkReporter;
//import com.aventstack.extentreports.reporter.configuration.Theme;
//
//public class extent extends TestListenerAdapter {
//	public ExtentTest test;
//	public ExtentSparkReporter spark;
//	static public ExtentReports extent;
//	
//	@BeforeTest
//	public static ExtentReports getreportobject () {
//		ExtentTest test=extent.createTest("Login test");
//		ExtentReports extent =new ExtentReports();
//		extent.setSystemInfo("testing", "ommmmm");
//		ExtentSparkReporter spark = new ExtentSparkReporter("target/spark.html");
//		spark.config().setTheme(Theme.DARK);
//		spark.config().setDocumentTitle("ommreport");
//		spark.config().setReportName("extent demo");
//		extent.attachReporter(spark);
//		
//		return extent;
//	
//		
//	}
//	
//	@Test
//	public void  demo () {
//		ExtentTest test=extent.createTest("Login test");
//		ExtentReports extent =new ExtentReports();
//		extent.setSystemInfo("testing", "ommmmm");
//		ExtentSparkReporter spark = new ExtentSparkReporter("target/spark.html");
//		spark.config().setTheme(Theme.DARK);
//		spark.config().setDocumentTitle("ommreport");
//		spark.config().setReportName("extent demo");
//		extent.attachReporter(spark);
//		
//		extent.flush();
//		
//	
//	}
//}
//	
//
