package library;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	String excelPath = "C:\\Users\\sudha\\OneDrive\\Documents\\GitHub\\Projects\\Proj-DS-ALGO\\src\\test\\resources\\PythonData.xlsx";
	XSSFWorkbook wb;
	XSSFSheet sheet;
	HashMap<String, Integer> colNums = null;
	FileInputStream fis = null;
	int rowCount = 0;

	public Excel(String xlFilePath) {
		// File file=new File(this.excelPath);
		try {
			this.excelPath = xlFilePath;
			fis = new FileInputStream(new File(this.excelPath));
			System.out.println("FileInputStream created successfully...");
			wb = new XSSFWorkbook(fis);
			sheet = wb.getSheetAt(0);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void setSheet(String SheetName) {
		XSSFSheet sheet = wb.getSheet(SheetName);
		populateColumnNums();
		// *******to count number of rows
		rowCount = sheet.getLastRowNum();
	}

//In APACHE POI row or column index starts with 0
	public int getRowCount() {
		rowCount = rowCount + 1;
		return rowCount;
	}

	public void populateColumnNums() {
		colNums = new HashMap<String, Integer>();
		int colIndex = 0;
		Row row = sheet.getRow(0);
		Iterator<Cell> cells = row.cellIterator();
		while (cells.hasNext()) {
			Cell cell = cells.next();
			String colName = cell.getStringCellValue();
			colNums.put(colName, colIndex);
			colIndex++;
		}
	}

	public int getColNumber(String colName) {
		return colNums.get(colName);
	}

	public String getCellData(int rowNum, String colName) {
		String ret = "";
		int colNum = getColNumber(colName);
		ret = getCellData(rowNum, colNum);
		return ret;
	}

	public String getCellData(int rowNum, int colNum) {
		String ret = "";
		try {
			Row row = sheet.getRow(rowNum);
			Cell cell = row.getCell(colNum);
			if (cell.getCellType() == CellType.STRING) {
				ret = cell.getStringCellValue();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ret;
	}

//******************reading entire sheet*************//
	public void readSheetData() {
		Iterator<Row> rows = sheet.iterator();
		while (rows.hasNext()) {
			Row currRow = rows.next();
			Iterator<Cell> cells = currRow.cellIterator();
			while (cells.hasNext()) {
				Cell currCell = cells.next();
				CellType ctype = currCell.getCellType();
				String value = "";
				if (ctype == CellType.STRING) {
					value = currCell.getStringCellValue();
				} else if (ctype == CellType.NUMERIC) {
					value = "" + currCell.getNumericCellValue();
				}

				System.out.println("Value for Cell:" + value);
			}
		}
	}

	public void close() {
		try {
			if (fis != null) {
				fis.close();
				wb.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
