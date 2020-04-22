package com.msc.shopqapom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BillingAddressPage {
	
	WebDriver ldriver;
	
	public BillingAddressPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//input[@id='billing_first_name']")
	private WebElement billingFirstName;
	
	@FindBy(xpath="//input[@id='billing_last_name']")
	private WebElement billingLastName;
	
	@FindBy(xpath="//input[@id='billing_company']")
	private WebElement billingCompanyName;
	
	@FindBy(xpath="//span[@id='select2-billing_country-container']")
	private WebElement billingCountry;
	
	@FindBy(xpath="//select[@id='billing_country']")
	private WebElement billingCountryDropdown;
	
	@FindBy(xpath="//input[@id='billing_address_1']")
	private WebElement billingAddress;
	
	@FindBy(xpath="//input[@id='billing_city']")
	private WebElement billingCity;
	
	@FindBy(xpath="//span[@id='select2-billing_state-container']")
	private WebElement billingState;
	
	@FindBy(xpath="//select[@id='billing_state']")
	private WebElement billingStateDropdown;
	
	@FindBy(xpath="//input[@id='billing_postcode']")
	private WebElement billingPostcode;
	
	@FindBy(xpath="//input[@id='billing_phone']")
	private WebElement billingPhone;
	
	@FindBy(xpath="//button[contains(@name,'save_address')]")
	private WebElement saveButton;
	
	public void enterFirstName(String firstName) {
		billingFirstName.clear();
		billingFirstName.sendKeys(firstName);
	}
	
	public void enterLastName(String lastName) {
		billingLastName.clear();
		billingLastName.sendKeys(lastName);
	}
	
	public void enterCompanyName(String companyName) {
		billingCompanyName.clear();
		billingCompanyName.sendKeys(companyName);
	}
	
	public void clickCountry() {
		billingCountry.click();
	}
	
	public void selectCountry(String country) {
		Select drpCountry = new Select(billingCountryDropdown);
		drpCountry.selectByVisibleText(country);
	}
	
	public void enterStreetAddress(String address) {
		billingAddress.clear();
		billingAddress.sendKeys(address);
	}
	
	public void enterCity(String city) {
		billingCity.clear();
		billingCity.sendKeys(city);
	}
	
	public void clickState() {
		billingState.click();
	}
	
	public void selectState(String state) {
		Select drpState = new Select(billingStateDropdown);
		drpState.selectByVisibleText(state);
	}
	
	public void enterPostcode(String postcode) {
		billingPostcode.clear();
		billingPostcode.sendKeys(postcode);
	}
	
	public void enterPhone(String phoneNo) {
		billingPhone.clear();
		billingPhone.sendKeys(phoneNo);
	}
	
	public EditAddress clickSaveButton() {
		saveButton.click();
		return new EditAddress(ldriver);
	}

}
