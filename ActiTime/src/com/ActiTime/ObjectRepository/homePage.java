package com.ActiTime.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {
	//declaration
	@FindBy (xpath = "//div[.='Tasks']")
	private WebElement tasktab;
	
	@FindBy (xpath= "//div[.='Reports']")
	private WebElement reporttab;
	
	@FindBy (xpath= "//div[.='Users']")
	private WebElement userstab;
	
	@FindBy (id = "logoutLink")
	private WebElement lgoutlnk;
	
	//initilization
	public homePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//utilization

	

	public WebElement getTasktab() {
		return tasktab;
	}

	public WebElement getReporttab() {
		return reporttab;
	}

	public WebElement getUserstab() {
		return userstab;
	}

	public WebElement getLgoutlnk() {
		return lgoutlnk;
	}

}
