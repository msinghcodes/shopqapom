package com.msc.shopqapom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.msc.shopqapom.base.TestBase;



public class HomePage{
	
	WebDriver ldriver;
	
	public HomePage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	/*
	 * @FindBy(xpath="//a[contains(text(),'pink drop shoulder oversized t shirt')]")
	 * private WebElement pinkTShirtTitle;
	 * 
	 * @FindBy(xpath="//a[contains(@data-product-id,'1497')]") private WebElement
	 * pinkTShirtAddToWishlistHover;
	 * 
	 * @FindBy(xpath="//a[contains(text(),'black lux graphic t-shirt')]") private
	 * WebElement blackTShirtTitle;
	 * 
	 * @FindBy(xpath="//a[contains(@data-product-id,'1485')]") private WebElement
	 * blackTShirtAddToWishlistHover;
	 * 
	 * @FindBy(xpath="//a[contains(text(),'Tokyo Talkies')]") private WebElement
	 * tokyoTalkiesTitle;
	 */
	
	
	
	/*
	 * public ProductPage clickPinkTShirtTitle() { driver.findElement(By.
	 * xpath("//a[contains(text(),'pink drop shoulder oversized t shirt')]")).click(
	 * ); return new ProductPage(); }
	 * 
	 * public ProductPage clickBlackTShirtTitle() { driver.findElement(By.
	 * xpath("//a[contains(text(),'black lux graphic t-shirt')]")).click(); return
	 * new ProductPage(); }
	 * 
	 * public ProductPage clickTokyoTalkiesTitle() {
	 * driver.findElement(By.xpath("//a[contains(text(),'Tokyo Talkies')]")).click()
	 * ; return new ProductPage(); }
	 * 
	 * public void addPinkTShirtToWishlist() {
	 * driver.findElement(By.xpath("//a[contains(@data-product-id,'1497')]")).click(
	 * ); }
	 * 
	 * public void addblackTShirtToWishlist() {
	 * driver.findElement(By.xpath("//a[contains(@data-product-id,'1485')]")).click(
	 * ); }
	 */

}
