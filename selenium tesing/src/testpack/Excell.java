package testpack;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excell {
	public static void main (String[]args) throws EncryptedDocumentException, IOException 
	{
		// How to get data from Excel sheet (use any one method at a time)
		String path= "C:\\Users\\Dell\\OneDrive\\Desktop\\Book1.xlsx";
		FileInputStream file = new FileInputStream(path);
		
  //String value =WorkbookFactory.create(file).getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();	
   //System.out.println(value);

 //double data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(10).getCell(0).getNumericCellValue();
  //System.out.println(data);

   Date d = WorkbookFactory.create(file).getSheet("Sheet1").getRow(12).getCell(0).getDateCellValue();
   System.out.println(d);



}
}