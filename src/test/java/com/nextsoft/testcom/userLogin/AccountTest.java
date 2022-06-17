package com.nextsoft.testcom.userLogin;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nextsoft.testcom.user.pom.CatalogActionPage;
import com.nextsoft.testcom.user.pom.SignInPage;
import com.nextsoft.testcom.user.pom.WelcomePage;

public class AccountTest {
	public WebDriver driver;
	//protected Tools tool = new Tools();

	public void sleep(int inInt) {
		try {
			Thread.sleep(inInt);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	public String screenshoot() {
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
		String waktu = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		String namaFile = "D:\\TestScreenshoot\\" + waktu + ".png";
		File screenshoot = new File(namaFile);
		
		try {
			FileUtils.copyFile(srcFile, screenshoot); 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return namaFile;  
	
	}
	
	@BeforeClass
	public void initial() {
		System.setProperty("url", "https://petstore.octoperf.com/");
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(System.getProperty("url"));
		driver.manage().window().maximize();
	}

	@BeforeMethod
	public void cekSession() {
		driver.get(System.getProperty("url"));

	}
	
	//1
	@Test (priority = 1)
	public void testRegister_WithEmptyDatadUserInformation() {
		WelcomePage welcome = PageFactory.initElements(driver, WelcomePage.class);
		welcome.clickEnterTheStore().clickCreateAccount().clickRegister().registerUser(" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ");
		
		/*
		 * screenshot
		 */
		sleep(500);
		String file = "<img src = 'file://"+screenshoot()+"'height=\"350\" width=\"700\"/>"; 
		Reporter.log(file);
	}
	
	//2
	@Test (priority = 2)
	public void testRegisterWithInvalidUserID() {
		WelcomePage welcome = PageFactory.initElements(driver, WelcomePage.class);
		welcome.clickEnterTheStore().clickCreateAccount().clickRegister().registerUser("123%$#", "1234", "1234", "sia", "sibe", "sia@gmail.com", "12345678", "sice", "side", "jakarta", "Florida", "12345", "United State");
		
		/*
		 * screenshot
		 */
		sleep(500);
		String file = "<img src = 'file://"+screenshoot()+"'height=\"350\" width=\"700\"/>"; 
		Reporter.log(file);
	}
	
	//3
	@Test (priority = 3)
	public void testRegisterWithInvalidRepreatPassword() {
		WelcomePage welcome = PageFactory.initElements(driver, WelcomePage.class);
		welcome.clickEnterTheStore().clickCreateAccount().clickRegister().registerUser("sibee", "1234", "12", "sia", "sibe", "sia@gmail.com", "12345678", "sice", "side", "jakarta", "Florida", "12345", "United State");
		
		/*
		 * screenshot
		 */
		sleep(500);
		String file = "<img src = 'file://"+screenshoot()+"'height=\"350\" width=\"700\"/>"; 
		Reporter.log(file);
	}
	
	
	//4
	@Test (priority = 9)
	public void testRegisterWith_ValidUserInformation() {
		WelcomePage welcome = PageFactory.initElements(driver, WelcomePage.class);
		welcome.clickEnterTheStore().clickCreateAccount().clickRegister().registerUser("sibe", "1234", "1234", "sia", "sibe", "sia@gmail.com", "12345678", "sice", "side", "jakarta", "Florida", "12345", "United State");
		
	}
	
	//5
	@Test (priority = 4)
	public void testRegisterWith_invalidEmail() {
		WelcomePage welcome = PageFactory.initElements(driver, WelcomePage.class);
		welcome.clickEnterTheStore().clickCreateAccount().clickRegister().registerUser("sibe", "1234", "1234", "sia", "sibe", "sia.com", "12345678", "sice", "side", "jakarta", "Florida", "12345", "United State");
		
		/*
		 * screenshot
		 */
		sleep(500);
		String file = "<img src = 'file://"+screenshoot()+"'height=\"350\" width=\"700\"/>"; 
		Reporter.log(file);
	}
	
	//6
	@Test (priority = 5)
	public void testRegisterWith_invalidPhone_huruf() {
		WelcomePage welcome = PageFactory.initElements(driver, WelcomePage.class);
		welcome.clickEnterTheStore().clickCreateAccount().clickRegister().registerUser("sibe", "1234", "1234", "sia", "sibe", "sia.com", "hdbchbcdb", "sice", "side", "jakarta", "Florida", "12345", "United State");
		
		/*
		 * screenshot
		 */
		sleep(500);
		String file = "<img src = 'file://"+screenshoot()+"'height=\"350\" width=\"700\"/>"; 
		Reporter.log(file);
	}
	
	//7
	@Test (priority = 6)
	public void testRegisterWith_invalidPhone_symbol() {
		WelcomePage welcome = PageFactory.initElements(driver, WelcomePage.class);
		welcome.clickEnterTheStore().clickCreateAccount().clickRegister().registerUser("sibe", "1234", "1234", "sia", "sibe", "sia.com", "@#$%^$%", "sice", "side", "jakarta", "Florida", "12345", "United State");
		
		/*
		 * screenshot
		 */
		sleep(500);
		String file = "<img src = 'file://"+screenshoot()+"'height=\"350\" width=\"700\"/>"; 
		Reporter.log(file);
	}
	
	//8
	@Test (priority = 7)
	public void testRegisterWith_invalidZip_Huruf() {
		WelcomePage welcome = PageFactory.initElements(driver, WelcomePage.class);
		welcome.clickEnterTheStore().clickCreateAccount().clickRegister().registerUser("sibe", "1234", "1234", "sia", "sibe", "sia.com", "12345678", "sice", "side", "jakarta", "Florida", "ddcsi", "United State");
		
		/*
		 * screenshot
		 */
		sleep(500);
		String file = "<img src = 'file://"+screenshoot()+"'height=\"350\" width=\"700\"/>"; 
		Reporter.log(file);
	}
	
	//9
	@Test (priority = 8)
	public void testRegisterWith_invalidZip_symbol() {
		WelcomePage welcome = PageFactory.initElements(driver, WelcomePage.class);
		welcome.clickEnterTheStore().clickCreateAccount().clickRegister().registerUser("sibe", "1234", "1234", "sia", "sibe", "sia.com", "12345678", "sice", "side", "jakarta", "Florida", "!@#$%^&", "United State");
		
		/*
		 * screenshot
		 */
		sleep(500);
		String file = "<img src = 'file://"+screenshoot()+"'height=\"350\" width=\"700\"/>"; 
		Reporter.log(file);
	}
	
}
