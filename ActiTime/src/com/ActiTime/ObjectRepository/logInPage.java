package com.ActiTime.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logInPage { 
	//declarartion
	@FindBy(id="username")
	private WebElement untbx;// always take webelemenet interface
	
	@FindBy (name="pwd")
	private WebElement pwtbx;
	@FindBy (xpath = "//div[.='Login ']")
	private WebElement lgbtn;
	
	//intilization
	public logInPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//utilization

	public WebElement getUntbx() {
		return untbx;
	}

	public WebElement getPwtbx() {
		return pwtbx;
	}

	public WebElement getLgbtn() {
		return lgbtn;
	}

}
