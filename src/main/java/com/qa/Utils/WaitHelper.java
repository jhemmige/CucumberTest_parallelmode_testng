package com.qa.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHelper {
	
	
	WebDriver driver;
	
	public WaitHelper(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	
	public void waitforElement ( WebElement element, long TimeOutinSeconds) {
		
		WebDriverWait wait = new WebDriverWait(driver,TimeOutinSeconds);	
		
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	
	

}
