package com.msc.shopqapom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditAddress {
	
	WebDriver ldriver;
	
	public EditAddress(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//div[@class='u-column1 col-1 woocommerce-Address']//a[@class='edit'][contains(text(),'Add')]")
	private WebElement addBillingAddressLink;
	
	@FindBy(xpath="//a[contains(text(),'Edit')]")
	private WebElement editBillingAddressLink;
	
	@FindBy(xpath="//div[@class='woocommerce-message']")
	private WebElement billingAddressSavedMessage;
	
	public BillingAddressPage goToAddBillingAddress() {
		addBillingAddressLink.click();
		return new BillingAddressPage(ldriver);
	}
	
	public BillingAddressPage goToEditBillingAddress() {
		editBillingAddressLink.click();
		return new BillingAddressPage(ldriver);
	}
	
	public String getBillingAddressSavedMessage() {
		return billingAddressSavedMessage.getText();
	}

}
