package com.krn.actitime.testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DemoexcelLibrary {
	public String getExceldata(String sheetName, int rownum, int cellnum)
	{
		String retval=null;
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("../Data.xlsx");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
Workbook wb = null;
try {
	wb = WorkbookFactory.create(fis);
} catch (EncryptedDocumentException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}		
Sheet st=wb.getSheet(sheetName);
		Row r=st.getRow(rownum);
		Cell c=r.getCell(cellnum);
		retval=c.getStringCellValue();
	
		return retval;

	}
	public int getLastRow(String sheetName)
	{
		int retval=0;

		FileInputStream fis = null;
		try {
			fis = new FileInputStream("../Data.xlsx");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
Workbook wb = null;
try {
	wb = WorkbookFactory.create(fis);
} catch (EncryptedDocumentException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}		
Sheet st=wb.getSheet(sheetName);
int retval1=st.getLastRowNum();
		return retval1;

}
}