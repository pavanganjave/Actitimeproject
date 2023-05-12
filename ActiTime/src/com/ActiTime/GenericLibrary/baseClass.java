package com.ActiTime.GenericLibrary;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.ActiTime.ObjectRepository.homePage;
import com.ActiTime.ObjectRepository.logInPage;

public class baseClass {
	public static WebDriver driver;
	filelibrary f = new filelibrary();
	
	@BeforeSuite
	public void databaseconnection() {
		Reporter.log("database connected",true);
	}
	@BeforeClass
	public void launchbrowser() throws IOException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String URL = f.readDataFromPropertyFile("url");
		driver.get(URL);
		//driver.get("https://demo.actitime.com/"); 1ST step before getting data from property file
		
		Reporter.log("Browser launced",true);
	}
	@BeforeMethod
	public void login() throws IOException {
		logInPage lp = new logInPage(driver);
		String UN = f.readDataFromPropertyFile("username");
		String PWD = f.readDataFromPropertyFile("password");
		lp.getUntbx().sendKeys(UN);
		lp.getPwtbx().sendKeys(PWD);
		lp.getLgbtn().click();
		Reporter.log("logged in successfully",true);
	}
	@AfterMethod
	public void logout() {
		homePage hp = new homePage(driver);
		hp.getLgoutlnk();
		Reporter.log("logged out successfully",true);
	}
	@AfterClass
	public void closebrowser() {
		driver.close();
		Reporter.log("Browser closed ",true);
		}
	@AfterSuite
	public void databasedisconnection() {
		Reporter.log("database disconnected",true);
		
	}

}
