package com.msc.shopqapom.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.msc.shopqapom.pages.CartPage;
import com.msc.shopqapom.pages.HomePage;
import com.msc.shopqapom.pages.MyAccount;
import com.msc.shopqapom.pages.WishlistPage;

public class TopNavigation {
	
	WebDriver ldriver;
	
	public TopNavigation(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'My Wishlist')]")
	private WebElement myWishlistLink;
	
	@FindBy(xpath="//a[contains(text(),'My Account')]")
	private WebElement myAccountLink;
	
	@FindBy(className="custom-logo")
	private WebElement logo;
	
	@FindBy(xpath="//a[contains(text(),'Dismiss')]")
	private WebElement dismissLink;
	
	@FindBy(xpath="//a[contains(text(),'Checkout')]")
	private WebElement checkoutLink;
	
	public WishlistPage gotoMyWishlist() {
		myWishlistLink.click();
		return new WishlistPage();
	}
	
	public MyAccount gotoMyAccount() {
		myAccountLink.click();
		return new MyAccount(ldriver);
	}
	
	public HomePage gotoHome() {
		logo.click();
		return new HomePage(ldriver);
	}
	
	public void clickDismiss() {
		dismissLink.click();
	}
	
	public CartPage goToCheckout() {
		checkoutLink.click();
		return new CartPage(ldriver);
	}
	
	public boolean isDismissLinkDisplayed() {
		return dismissLink.isDisplayed();
	}

}
