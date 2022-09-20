 package com.ecom.flipkart.POMReposatory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecom.flipkart.GenericUtility.WebDriverUtility;

public class ProductsInfoPage extends WebDriverUtility {
	WebDriver driver;
	public ProductsInfoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	@FindBy(xpath ="//div[@class='aMaAEs']/descendant::span[@class='B_NuCI']" )
	private WebElement productName;
	@FindBy(name =  "q" )
	private WebElement searchField;
	@FindBy(xpath =  "//*[name()='svg' and @class='_1KOMV2']" )
	private WebElement addToCartButton;
	@FindBy(xpath =  "//img[@class='_2xm1JU']" )
	private WebElement homePageLink;
	@FindBy(xpath ="//button[text()='✕']")
	private WebElement cancelButton;
	
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getProductName() {
		return productName;
	}
	public WebElement getSearchField() {
		return searchField;
	}
	public WebElement getAddToCartButton() {
		return addToCartButton;
	}
	public WebElement getHomePageLink() {
		return homePageLink;
	}
	public WebElement getCancelButton() {
		return cancelButton;
	}
	
		
		
		
		
}
