package com.nextsoft.testcom.user.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

	protected WebDriver driver;

	@FindBy(xpath = "//a[normalize-space()='Sign Out']")
	private WebElement btnSignOut;
	
	@FindBy(xpath = "//a[normalize-space()='My Account']")
	private WebElement btnMyAcc;
	
	public DashboardPage (WebDriver driver){
		this.driver = driver;
	}
	
	public CatalogActionPage clickSignOut() {
		btnSignOut.click();
		return PageFactory.initElements(driver, CatalogActionPage.class);
	}
	
	public CatalogActionPage clickMyAccount() {
		btnMyAcc.click();
		return PageFactory.initElements(driver, CatalogActionPage.class);
	}
}
