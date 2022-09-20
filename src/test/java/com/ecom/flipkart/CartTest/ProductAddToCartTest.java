package com.ecom.flipkart.CartTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ecom.flipkart.GenericUtility.BaseClass;
import com.ecom.flipkart.POMReposatory.CartPage;
import com.ecom.flipkart.POMReposatory.HomePage;
import com.ecom.flipkart.POMReposatory.ProductsInfoPage;

public class ProductAddToCartTest extends BaseClass{
@Test
	public void addToCartWinterHeaterTest() throws Throwable {
	HomePage home=new HomePage(driver);
	ProductsInfoPage productInfo=new ProductsInfoPage(driver);
	CartPage cart =new CartPage(driver);
	
	String val = eLib.getDataFromExcel("Sheet1", 0, 0);
	
	home.getCancelButton().click();
	home.getSearchField().sendKeys(val);
	home.getSearchButton().click();
	String pwh = driver.getWindowHandle();
	home.getProduct().click();
	
	wLib.swithToWindow(driver,pwh);
	String name = productInfo.getProductName().getText();
	productInfo.getAddToCartButton().click();
	productInfo.getHomePageLink().click();
	productInfo.getCancelButton().click();
	home.getCartPageLink().click();
	String pname = cart.getProductName().getText();
	Assert.assertEquals(name, pname);
	
	}
	
}
