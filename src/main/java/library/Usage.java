package library;

public class Usage {
public static void main(String[] args) {
	Excel excel=new Excel("C:\\Users\\sudha\\OneDrive\\Documents\\GitHub\\Projects\\Proj-DS-ALGO\\src\\test\\resources\\PythonData.xlsx");
	excel.setSheet("Data");
	String code=excel.getCellData(1, "pythonCode");
	System.out.println(code);
	//excel.readSheetData();
	System.out.println("The column number is :"+excel.getColNumber("pythonCode"));
	System.out.println("Total number of rows in excel :"+excel.getRowCount());
	excel.close();
}
}
