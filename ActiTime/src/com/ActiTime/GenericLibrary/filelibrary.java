package com.ActiTime.GenericLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * This is a generic library class which contains all the generic method
 * @author Pawan
 *
 */
public class filelibrary {
	/**
	 * This is a generic method which is used to read the data from property file
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String readDataFromPropertyFile(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./TestData/commondata.property");
		Properties p = new Properties();
		p.load(fis);
		String value = p.getProperty(key);
		return value;
	}
	/**
	 * This method is generic method which is used to data from excel file
	 * @param sheetname
	 * @param row
	 * @param cell
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String readdataFromExcel(String sheetname,int row, int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis1 = new FileInputStream("./TestData/TESTDATA.xlsx");
		Workbook wb = WorkbookFactory.create(fis1);//to get workbook we need to add apache.poi
		String value1 = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		return value1;
	}

}
