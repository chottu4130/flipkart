package com.ecom.flipkart.GenericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

import com.ecom.flipkart.POMReposatory.HomePage;


public class BaseClass extends WebDriverUtility{
	public WebDriver driver;
	
	
	
	//Object Creation for Lib
	public JavaUtility jLib = new JavaUtility();
	public WebDriverUtility wLib = new WebDriverUtility();
	public FileUtiltiy fLib = new FileUtiltiy();
	public ExcelUtility eLib = new ExcelUtility();
	public static WebDriver sdriver;
	
	@BeforeSuite(alwaysRun = true)
	
	public void configBS()
	{
		
		System.out.println(" CONNECT TO DATABASE ");
	}
	//@Parameters("browser")
	@BeforeClass(alwaysRun = true)
	public void configBC() throws Throwable {
	System.out.println(" LAUNCH THE BROWSER ");
	//String browser = System.getProperty("browser");
	
	String browser =fLib.getPropertyKeyValue("browser");
	if(browser.equalsIgnoreCase("chrome")) {
		driver = new ChromeDriver();
	}
	else if (browser.equalsIgnoreCase("firefox")) {
		driver= new FirefoxDriver();
	}
	else if(browser.equalsIgnoreCase("edge")) {
		driver=new EdgeDriver();
	}
	else {
		driver=new ChromeDriver();
	}
	sdriver= driver;
	
	wLib.waitForElementInDOM(driver);
	driver.manage().window().maximize();

	
	}


	
	
	
	@BeforeMethod(alwaysRun = true)
	public void configBM() throws Throwable
	{
	System.out.println();
	
	driver.get("https://www.flipkart.com/");

	
	}
	
	@AfterMethod(alwaysRun = true)
	public void configAM()
	{
		
	HomePage homePage = new HomePage(driver);
	
	
	}
	@AfterClass(alwaysRun = true)
	public void configAC() {
	driver.quit();
	}
	@AfterSuite(alwaysRun = true)
	public void configAS() {
	System.out.println(" Close DataBase ");
	
}
}
