package com.ActiTime.TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ActiTime.GenericLibrary.baseClass;
import com.ActiTime.GenericLibrary.filelibrary;
import com.ActiTime.ObjectRepository.homePage;
import com.ActiTime.ObjectRepository.taskPage;

public class Task extends baseClass {
	@Test
	public void createCustomer() throws EncryptedDocumentException, IOException {
		homePage hp = new homePage(driver);
		hp.getTasktab().click();
		taskPage tp = new taskPage (driver);
		tp.getAddnewbutton().click();
		tp.getNewcust().click();
		
		filelibrary f = new filelibrary();
		String createcustomer = f.readdataFromExcel("Sheet1", 1, 1);
		tp.getCustname().sendKeys(createcustomer);// enter customer name from excel file
		String desc = f.readdataFromExcel("Sheet1", 1, 2);
		tp.getCustdesp().sendKeys(desc);
		tp.getCreatecust().click();
		String expectedresult = createcustomer;
		driver.findElement(By.xpath("(//div[.='"+createcustomer+"'])[2]"));// concatenation
		SoftAssert s= new SoftAssert();
		s.assertEquals(expectedresult, false);
		
	}
}
	


