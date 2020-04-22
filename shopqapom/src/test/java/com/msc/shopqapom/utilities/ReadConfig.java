package com.msc.shopqapom.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties prop;
	
	public ReadConfig() {
		try {
			FileInputStream fis = new FileInputStream("./src/test/resources/properties/config.properties");
			prop = new Properties();
			prop.load(fis);
		} catch (Exception e) {
			
			System.out.println("Exception is " + e.getMessage());
		}
	}
	
	public String getBrowser() {
		String browser = prop.getProperty("browser");
		return browser;
	}
	
	public String getBaseUrl() {
		String baseurl = prop.getProperty("baseurl");
		return baseurl;
	}
	
	public String getChromeDriverPath() {
		String chromePath = prop.getProperty("chromedriver");
		return chromePath;
	}
	
	public String getGeckoDriverPath() {
		String geckoPath = prop.getProperty("geckodriver");
		return geckoPath;
	}
	
	public String getLoginUsername() {
		String username = prop.getProperty("loginemail");
		return username;
	}
	
	public String getLoginPassword() {
		String password = prop.getProperty("loginpassword");
		return password;
	}

}
