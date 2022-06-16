package com.nextsoft.testcom.user;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Tools {

	
	
	public void stopForMoment() {
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void stopForMoment(int miliSec) {
		try {
			Thread.sleep(miliSec);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void scroolVerticalWindows(WebDriver driver, int y) {
		//positive y for going down, negative y for going up
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,"+y+")", "");
	}
	
}
