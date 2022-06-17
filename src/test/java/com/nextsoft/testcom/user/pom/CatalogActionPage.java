package com.nextsoft.testcom.user.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CatalogActionPage {
	protected WebDriver driver;
	
	
	@FindBy(xpath = "//a[normalize-space()='Sign In']")
	private WebElement btnSignIn;
	
	
	public CatalogActionPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public SignInPage clickCreateAccount() {
		btnSignIn.click();
		return PageFactory.initElements(driver, SignInPage.class);
	}
	
	
}
