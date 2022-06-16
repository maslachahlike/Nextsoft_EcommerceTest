package com.nextsoft.testcom.user;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nextsoft.testcom.user.pom.HomePage;

public class CreateAccountTest {
	public WebDriver driver;
	protected Tools tool = new Tools();
	
	@BeforeClass
	public void initial() {
		System.setProperty("url", "http://automationpractice.com/index.php");
		System.setProperty("webdriver.chrome.driver", "C:\\Antoni\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(System.getProperty("url"));
		driver.manage().window().maximize();
	}
	
	
	@BeforeMethod
	public void cekSession() {
		driver.get(System.getProperty("url"));
		
	}
	
	@Test(enabled = false, priority = 0)
	public void createAccountValidEmail() {
		PageFactory.initElements(driver, HomePage.class).clickSignIn().inputEmail("yuninda@email.com").clickCreateAccount().goToFormCreateAccountPage();
		tool.stopForMoment();
		
		
	}
	
	@Test(enabled = false, priority = 1)
	public void cekEmailErrorInvalid() {
		String errMsg = PageFactory.initElements(driver, HomePage.class).clickSignIn().inputEmail("yuninda.com").clickCreateAccount().getMsgErrEmptyOrInvalidCreateEmail();
		assertEquals(errMsg, "Invalid email address.");
	}
	
	@Test(enabled = false, priority = 2)
	public void cekEmailErrorEmpby() {
		String errMsg = PageFactory.initElements(driver, HomePage.class).clickSignIn().inputEmail("").clickCreateAccount().getMsgErrEmptyOrInvalidCreateEmail();
//		PageFactory.initElements(driver, HomePage.class).clickSignIn().inputEmail("yuninda@email.com").clickCreateAccount().goToFormCreateAccountPage();
//		tool.scroolVerticalWindows(driver, 500);
		
		assertEquals(errMsg, "Invalid email address.");
	}
	
	@Test(priority = 10)
	public void testElement() {
//		boolean statusButton = PageFactory.initElements(driver, HomePage.class).clickSignIn().inputEmail("yuninda@email.com").clickCreateAccount().goToFormCreateAccountPage().checkRadioButtonMr();
//		System.out.println("Button status: "+statusButton);
		
		PageFactory.initElements(driver, HomePage.class).clickSignIn().inputEmail("yuninda@email.com").clickCreateAccount().goToFormCreateAccountPage().testDropDown();
	}
}
