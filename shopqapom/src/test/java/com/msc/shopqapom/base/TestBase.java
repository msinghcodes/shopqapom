package com.msc.shopqapom.base;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.google.common.io.Files;
import com.msc.shopqapom.utilities.ReadConfig;

public class TestBase {
	
	ReadConfig readConfig = new ReadConfig();
	
	public String baseurl = readConfig.getBaseUrl();
	public static WebDriver driver;
	public String username = readConfig.getLoginUsername();
	public String password = readConfig.getLoginPassword();
	public static TopNavigation topNav;
	public static Logger log  = LogManager.getLogger(TestBase.class);
	
	@Parameters("browser")
	@BeforeClass
	public void setUp(String br) {
		
		if(br.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",readConfig.getChromeDriverPath());
			driver = new ChromeDriver();
		} else if(br.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",readConfig.getGeckoDriverPath());
			driver = new FirefoxDriver();
		}
		
		
		
		
		driver.get(baseurl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		topNav = new TopNavigation(driver);
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		Files.copy(source, target);
		System.out.println("Screenshot taken");
	}

}
