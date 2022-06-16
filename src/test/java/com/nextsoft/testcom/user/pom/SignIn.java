package com.nextsoft.testcom.user.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn {
	protected WebDriver driver;
	
	@FindBy(xpath = "//input[@id='email_create']")
	private WebElement fieldCreateAccountEmail;
	
	@FindBy(xpath = "//span[normalize-space()='Create an account']")
	private WebElement btnCreateAnAccount;
	
	@FindBy(xpath = "//li[normalize-space()='Invalid email address.']")
	private WebElement msgErrEmptyOrInvalidCreateEmail;
	
	@FindBy(xpath = "//li[contains(text(),'An account using this email address has already be')]")
	private WebElement msgErrExistCreateEmail;
	
	
	public SignIn(WebDriver driver) {
		this.driver = driver;
	}
	
	public FormCreateAccount goToFormCreateAccountPage() {
		return PageFactory.initElements(driver, FormCreateAccount.class);
	}
	
	public SignIn inputEmail(String email) {
		fieldCreateAccountEmail.sendKeys(email);
		return PageFactory.initElements(driver, SignIn.class);
	}
	
	public SignIn clickCreateAccount() {
		btnCreateAnAccount.click();
		return PageFactory.initElements(driver, SignIn.class);
	}
	
	public String getMsgErrEmptyOrInvalidCreateEmail() {
		stopAmoment();
		return msgErrEmptyOrInvalidCreateEmail.getText();
	}
	
	public String getMsgErrExistCreateEmail() {
		stopAmoment();
		return msgErrExistCreateEmail.getText();
	}
	
	public void stopAmoment() {
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
