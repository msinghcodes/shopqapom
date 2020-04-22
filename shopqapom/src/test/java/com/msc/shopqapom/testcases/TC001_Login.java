package com.msc.shopqapom.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.msc.shopqapom.base.TestBase;
import com.msc.shopqapom.pages.MyAccount;
import com.msc.shopqapom.utilities.XLUtils;

public class TC001_Login extends TestBase{
	
	
	@Test(dataProvider="Login")
	public void login(String username, String password) {
		if(topNav.isDismissLinkDisplayed()) {
			topNav.clickDismiss();
			log.info("Dismiss hero message clicked");
		}
		MyAccount ma = topNav.gotoMyAccount();
		log.info("Navigated to My Account page");
		ma.enterLoginEmail(username);
		log.info("Login username entered");
		ma.enterLoginPassword(password);
		log.info("Login password entered");
		ma.clickLoginButton();
		log.info("Login button clicked");
		
		if(ma.getValidLoginMessage().equals("Hello gyho (not gyho? Log out)")) {
			Assert.assertTrue(true);
			log.info("Login test is passed");
			ma.goToLogout();
			log.info("User has been logged out");
			driver.switchTo().defaultContent();
		} else {
			Assert.assertTrue(false);
			log.info("Login test is failed");
			driver.switchTo().defaultContent();
		}
		
	}
	
	@DataProvider(name="Login")
	String [][] getData() throws IOException {
		String path=System.getProperty("user.dir")+"/src/test/resources/testingdata/TestData.xlsx";
		
		int rownum=XLUtils.getRowCount(path, "login");
		int colcount=XLUtils.getCellCount(path,"login",1);
		
		String logindata[][]=new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				logindata[i-1][j]=XLUtils.getCellData(path,"login", i,j);//1 0
			}
				
		}
	return logindata;
	}

}
