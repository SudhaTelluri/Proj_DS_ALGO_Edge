package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import org.testng.annotations.DataProvider;

public class LoginDataRead {
	

	@DataProvider(name="Credential Supplier")
public Object[][] dataSupplier() throws IOException
{
	File xlFile=new File("C:\\Users\\sudha\\OneDrive\\Documents\\GitHub\\Projects\\Proj-DS-ALGO\\src\\test\\resources\\exceldata\\xldata.xlsx");
	FileInputStream fis=new FileInputStream(xlFile);
	XSSFWorkbook workbook=new XSSFWorkbook(fis);
	XSSFSheet sheet = workbook.getSheet("loginData");
	int rowCount = sheet.getLastRowNum();
	int colCount = sheet.getRow(0).getLastCellNum();
	Object[][] data=new Object[rowCount][rowCount];
	//r=row
	for(int r=0;r<rowCount;r++)
	{
		XSSFRow row=sheet.getRow(r+1);
		//c=column
		for(int c=0;c<colCount;c++)
		{
			XSSFCell cell = row.getCell(c);
			CellType cellType = cell.getCellType();
			switch(cellType) {
			case STRING:
				data[r][c]=cell.getStringCellValue();
				break;
			case NUMERIC:
				data[r][c]=Integer.toString((int) cell.getNumericCellValue());
				break;
			case BOOLEAN:
				data[r][c]=cell.getBooleanCellValue();
				break;
				
			}
		}
	}
	return data;	
	}

}
