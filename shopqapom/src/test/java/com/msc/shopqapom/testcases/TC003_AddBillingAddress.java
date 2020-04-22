package com.msc.shopqapom.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.msc.shopqapom.base.TestBase;
import com.msc.shopqapom.pages.BillingAddressPage;
import com.msc.shopqapom.pages.EditAddress;
import com.msc.shopqapom.pages.MyAccount;

public class TC003_AddBillingAddress extends TestBase{
	
	@Test
	public void addBillingAddress() throws InterruptedException {
		topNav.clickDismiss();
		MyAccount ma = topNav.gotoMyAccount();
		ma.enterLoginEmail(username);
		ma.enterLoginPassword(password);
		ma.clickLoginButton();
		EditAddress editadd = ma.goToAddress();
		BillingAddressPage billingAdd = editadd.goToEditBillingAddress();
		billingAdd.enterFirstName("Gye");
		billingAdd.enterLastName("Tonde");
		billingAdd.enterCompanyName("SG Group");
		billingAdd.clickCountry();
		billingAdd.selectCountry("India");
		Thread.sleep(3000);
		billingAdd.enterStreetAddress("Gopimath");
		billingAdd.enterCity("Mumbai");
		billingAdd.selectState("Maharashtra");
		billingAdd.enterPostcode("3224");
		billingAdd.enterPhone("9876543210");
		billingAdd.clickSaveButton();
		
		if(editadd.getBillingAddressSavedMessage().equals("Address changed successfully.")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

}
