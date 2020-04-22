package com.msc.shopqapom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccount{
	
	WebDriver ldriver;
	
	public MyAccount(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath="//input[@id='username']")
	private WebElement loginEmail;
	  
	@FindBy(xpath="//input[@id='password']")
	private WebElement loginPassword;
	  
	@FindBy(xpath="//button[contains(@name,'login')]")
	private WebElement loginButton;
	  
	@FindBy(xpath="//div[@id='primary']//li[1]")
	private WebElement invalidLoginMessage;
	  
	@FindBy(xpath="//div[@id='primary']//p[1]")
	private WebElement validLoginMessage;
	 
	@FindBy(xpath="//a[contains(text(),'Logout')]")
	private WebElement logoutLink;
	
	@FindBy(xpath="//a[contains(text(),'Addresses')]")
	private WebElement addressesLink;
	
	
	public void enterLoginEmail(String email) {
		loginEmail.clear();
		loginEmail.sendKeys(email);
	}
	
	public void enterLoginPassword(String password) {
		loginPassword.clear();
		loginPassword.sendKeys(password);
	}
	
	public MyAccount clickLoginButton() {
		loginButton.click();
		return this;
	}
	
	public MyAccount doLogin(String email, String password) {
		enterLoginEmail(email);
		enterLoginPassword(password);
		clickLoginButton();
		return this;
		
	}
	
	public String getValidLoginMessage() {
		return validLoginMessage.getText();
	}
	
	public String getInvalidLoginMessage() {
		return invalidLoginMessage.getText();
	}
	
	public MyAccount goToLogout() {
		logoutLink.click();
		return this;
	}
	
	public EditAddress goToAddress() {
		addressesLink.click();
		return new EditAddress(ldriver);
	}
		
}
