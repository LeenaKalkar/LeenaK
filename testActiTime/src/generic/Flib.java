package generic;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


	public class Flib {
		public String readExcelData(String excelPath,String sheetName,int rowIndex,int cellIndex) throws EncryptedDocumentException, IOException
		{
			FileInputStream fis =new FileInputStream(excelPath);
			Workbook wb =WorkbookFactory.create(fis);
			Sheet sh=wb.getSheet(sheetName);
			Row row=sh.getRow(rowIndex);
			Cell cell=row.getCell(cellIndex);
			String value=cell.getStringCellValue();
			return value;
		}
		
		public int getRowCount(String excelPath,String sheetName) throws EncryptedDocumentException, IOException
		{
			FileInputStream fis =new FileInputStream(excelPath);
			Workbook wb =WorkbookFactory.create(fis);
			Sheet sh=wb.getSheet(sheetName);
			int rc=sh.getLastRowNum();
			return rc;
			
		}
		
		public String readPropertyData(String propPath,String  key) throws EncryptedDocumentException, IOException {
			FileInputStream fis = new FileInputStream(propPath);
	Properties prop =new Properties();
	prop.load(fis);
	String value=prop.getProperty(key);
	return value;

	}

		public String readPropertyData1(String propPath, String key) throws IOException {
			FileInputStream fis = new FileInputStream(propPath);
			Properties prop =new Properties();
			prop.load(fis);
			String value=prop.getProperty(key);
			return value;
		}

		
}
