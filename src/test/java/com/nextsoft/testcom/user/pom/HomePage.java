package com.nextsoft.testcom.user.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {
	protected WebDriver driver;
	
	@FindBy(xpath = "//a[@title='Log in to your customer account']")
	private WebElement btnSignIn;
	
	public HomePage (WebDriver driver){
		this.driver = driver;
	}
	
	public SignIn clickSignIn() {
		btnSignIn.click();
		return PageFactory.initElements(driver, SignIn.class);
	}
}
