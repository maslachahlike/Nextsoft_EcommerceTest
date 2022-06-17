package com.nextsoft.testcom.user.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {

	protected WebDriver driver;
	
	@FindBy(xpath = "//a[normalize-space()='Enter the Store']")
	private WebElement welcome;
	
	public WelcomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public CatalogActionPage clickEnterTheStore() {
		welcome.click();
		return PageFactory.initElements(driver, CatalogActionPage.class);
	}
}
