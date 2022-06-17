package com.nextsoft.testcom.user.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SignInPage {
	protected WebDriver driver;
	
	@FindBy(xpath = "//input[@name='signon']")
	private WebElement btnLogIn;
	
	@FindBy(xpath = "//a[normalize-space()='Register Now!']")
	private WebElement btnRegister;
	
	@FindBy(xpath = "//input[@id='stripes-776719626']")
	private WebElement fieldUsernameSigninPage;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement fieldPasswordSigninPage;
	
	public SignInPage (WebDriver driver){
		this.driver = driver;
	}
	
	public DashboardPage clickBtnLogIn() {
		btnLogIn.click();
		return PageFactory.initElements(driver, DashboardPage.class);
	}
	
	public FormCreateAccountPage clickRegister() {
		btnRegister.click();
		return PageFactory.initElements(driver, FormCreateAccountPage.class);
	}
	
	public DashboardPage clickUsernameSP() {
		fieldUsernameSigninPage.click();
		return PageFactory.initElements(driver, DashboardPage.class);
	}
	
	public DashboardPage clickPasswordSP() {
		fieldPasswordSigninPage.click();
		return PageFactory.initElements(driver, DashboardPage.class);
	}
}
