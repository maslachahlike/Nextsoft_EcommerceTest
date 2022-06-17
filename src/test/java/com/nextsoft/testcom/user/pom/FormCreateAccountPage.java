package com.nextsoft.testcom.user.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.nextsoft.testcom.userLogin.Tools;

public class FormCreateAccountPage {

	protected WebDriver driver;
	//Tools tool = new Tools();
	Select select;
	
	@FindBy(xpath = "//input[@name='username']")
	private WebElement userId;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement newPassword;
	
	@FindBy(xpath = "//input[@name='repeatedPassword']")
	private WebElement repeatPassword;
	
	@FindBy(xpath = "//input[@name='account.firstName']")
	private WebElement firstName;
	
	@FindBy(xpath = "//input[@name='account.lastName']")
	private WebElement lastName;
	
	@FindBy(xpath = "//input[@name='account.email']")
	private WebElement email;
	
	@FindBy(xpath = "//input[@name='account.phone']")
	private WebElement phone;
	
	@FindBy(xpath = "//input[@name='account.address1']")
	private WebElement address_1;
	
	@FindBy(xpath = "//input[@name='account.address2']")
	private WebElement address_2;
	
	@FindBy(xpath = "//input[@name='account.city']")
	private WebElement city;
	
	@FindBy(xpath = "//input[@name='account.state']")
	private WebElement state;
	
	@FindBy(xpath = "//input[@name='account.zip']")
	private WebElement fieldZip;
	
	@FindBy(xpath = "//input[@name='account.country']")
	private WebElement fieldCountry;
	
	@FindBy(css = "input[value='Save Account Information']")
	private WebElement btsSaveAccount;
	
//	@FindBy(id = "days")
//	private WebElement dobDayDropList;
	//private Select se = new Select(driver.findElement(By.xpath("//select[@id='id_country']")));
	
	public FormCreateAccountPage (WebDriver driver){
		this.driver = driver;
	}
	
	public DashboardPage registerUser(String user_userID, String user_password, String user_repeatPsw,
			String user_firstName, String user_lastName, String user_email, String user_phone, String user_address1,
			String user_address2, String user_city, String user_state, String user_zipCode, String user_country) {

		userId.clear();
		userId.sendKeys(user_userID);
		newPassword.clear();
		newPassword.sendKeys(user_password);
		repeatPassword.clear();
		repeatPassword.sendKeys(user_repeatPsw);

		firstName.clear();
		firstName.sendKeys(user_firstName);
		lastName.clear();
		lastName.sendKeys(user_lastName);
		email.clear();
		email.sendKeys(user_email);
		phone.clear();
		phone.sendKeys(user_phone);
		address_1.clear();
		address_1.sendKeys(user_address1);
		address_2.clear();
		address_2.sendKeys(user_address2);
		city.clear();
		city.sendKeys(user_city);
		state.clear();
		state.sendKeys(user_state);
		fieldZip.clear();
		fieldZip.sendKeys(user_zipCode);
		fieldCountry.clear();
		fieldCountry.sendKeys(user_country);
//		Check profile information
		// select[@name='account.favouriteCategoryId']//
		btsSaveAccount.click();

		return PageFactory.initElements(driver, DashboardPage.class);
	}
	
	public CatalogActionPage clickSaveAccountInformation() {
		btsSaveAccount.click();
		return PageFactory.initElements(driver, CatalogActionPage.class);
	}
	
}
