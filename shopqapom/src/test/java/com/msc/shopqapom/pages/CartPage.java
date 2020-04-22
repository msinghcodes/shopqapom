package com.msc.shopqapom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class CartPage{
	
	WebDriver ldriver;
	
	public CartPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//p[@class='cart-empty woocommerce-info']")
	WebElement cartEmptyMessasge;

}
