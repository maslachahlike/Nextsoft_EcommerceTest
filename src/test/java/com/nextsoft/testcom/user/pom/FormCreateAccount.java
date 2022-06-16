package com.nextsoft.testcom.user.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class FormCreateAccount {

	protected WebDriver driver;
	
	
	//@FindBy(xpath = "//select[@id='id_country']")
	//private WebElement selectCountry;
	private Select se = new Select(driver.findElement(By.xpath("//select[@id='id_country']")));
	
	
	@FindBy(xpath = "//select[@id='id_country']")
	private WebElement dragListCountryEmpty;
	
	
	@FindBy(xpath = "//input[@id='postcode']")
	private WebElement fieldPostalCodeEmpty;
	
	
	public FormCreateAccount (WebDriver driver){
		this.driver = driver;
	}
	
	
	public void getCountry() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
//		jse.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		se.selectByIndex(1);
	}
	
}
