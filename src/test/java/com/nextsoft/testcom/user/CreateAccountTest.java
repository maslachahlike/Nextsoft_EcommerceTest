package com.nextsoft.testcom.user;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nextsoft.testcom.user.pom.HomePage;

public class CreateAccountTest {
	public WebDriver driver;

	@BeforeClass
	public void initial() {
		System.setProperty("url", "http://automationpractice.com/index.php");
		System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(System.getProperty("url"));
		driver.manage().window().maximize();
	}

	@BeforeMethod
	public void cekSession() {
		driver.get(System.getProperty("url"));

	}

	@Test(priority = 0)
	public void createAccountValidEmail() {
		PageFactory.initElements(driver, HomePage.class).clickSignIn().inputEmail("yuninda@email.com")
				.clickCreateAccount().goToFormCreateAccountPage().getCountry();
		try {
			Thread.sleep(5000);
		} catch (Exception e) {

		}

	}

//	@Test(priority = 1)
	public void cekEmailErrorInvalid() {
		String errMsg = PageFactory.initElements(driver, HomePage.class).clickSignIn().inputEmail("yuninda.com")
				.clickCreateAccount().getMsgErrEmptyOrInvalidCreateEmail();
//		assertEquals(errMsg, "Invalid email address.");
	}

//	@Test(priority = 2)
	public void cekEmailErrorEmpby() {

	}
}
