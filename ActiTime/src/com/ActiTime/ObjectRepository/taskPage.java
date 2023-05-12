package com.ActiTime.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class taskPage {
	//declaration
	@FindBy (xpath ="//div[.='Add New']")
	private WebElement addnewbutton;
	
	
	@FindBy (xpath = "//div[.='+ New Customer']")
	private WebElement newcust;
	
	@FindBy (xpath ="(//input[@placeholder= 'Enter Customer Name'])[2]")
	private WebElement custname;
	
	@FindBy (xpath= "//textarea[@placeholder= 'Enter Customer Description']")
	private WebElement custdesp;
	
	
	@FindBy (xpath="//div[.='Create Customer']")
	private WebElement createcust;
	
	@FindBy (xpath= "//div[@class='greyButton cancelBtn']")
	private WebElement cancelbuttn;
	
	//initiolization
	
	public taskPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getAddnewbutton() {
		return addnewbutton;
	}

	public WebElement getNewcust() {
		return newcust;
	}

	public WebElement getCustname() {
		return custname;
	}

	public WebElement getCustdesp() {
		return custdesp;
	}

	public WebElement getCreatecust() {
		return createcust;
	}

	public WebElement getCancelbuttn() {
		return cancelbuttn;
	}
	
	

}
