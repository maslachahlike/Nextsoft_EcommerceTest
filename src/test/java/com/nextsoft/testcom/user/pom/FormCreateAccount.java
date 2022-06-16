package com.nextsoft.testcom.user.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.nextsoft.testcom.user.Tools;

public class FormCreateAccount {

	protected WebDriver driver;
	Tools tool = new Tools();
	
	// radio button
//	isSelected(): Checks whether a radio button is selected or not.
//	isDisplayed(): Checks whether a radion button is displayed on the web page or not.
//	isEnabled(): Checks whether a radion button is enabled or not
	
	
//	
	@FindBy(xpath = "//label[@for='id_gender1']")
	private WebElement radioBtnMr;
	//*[@id="uniform-id_gender1"]/span
//	//*[@id="uniform-id_gender1"]
	
	Select select;
	
	//xpath di pakai selectorhub di label radio button (text nya)
	@FindBy(xpath = "//label[@for='id_gender2']")
	private WebElement radioBtnMrs;
	
	//days
	@FindBy(id = "days")
	private WebElement dobDayDropList;
	//somehow pakai xpath selectorhub tidak terjadi no element found,
	//dan kalau pakai find by id jadi masuk
	//select[@id='days']
	
	public FormCreateAccount (WebDriver driver){
		this.driver = driver;
	}
	
	
	public boolean checkRadioButtonMr() {
		tool.stopForMoment();
		radioBtnMrs.click();
		return radioBtnMr.isSelected();
	}
	
	public boolean checkRadioButtonMrs() {
		tool.stopForMoment();
		return radioBtnMrs.isSelected();
	}
	
//	selectByIndex, selects the dropdown option by its index number. (int) 
//	selectByValue, selects the dropdown option by its value.(string)
//	selectByVisibleText, enables one to select one option 
//	from the dropdown or multi-select dropdown based on the dropdown text. (String) 
	
	public void testDropDown() {
		tool.scroolVerticalWindows(driver, 200);
		tool.stopForMoment(5000);
		
		//driver swicth to iframe
//		https://stackoverflow.com/questions/62337828/dropdown-menu-element-not-found-with-selenium-java
//		driver.switchTo().frame(driver.findElement(By.id("iFrameRezie")));
		
//		dobDayDropList.click();
		select = new Select(dobDayDropList);
		select.selectByValue("5");
		System.out.println(select.getFirstSelectedOption().getText());
		
		System.out.println("DoB Days: "+dobDayDropList.getText());
		
	}
	
	
}
