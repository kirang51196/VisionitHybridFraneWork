package visionIt.Hrmmanagement.Utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExceldataDataProvider {
	XSSFWorkbook workbook;
	
	public ExceldataDataProvider() {

      try {
		File fs = new File("./Testdata/Testdata.xlsx");
		FileInputStream fins = new FileInputStream(fs);
		workbook = new XSSFWorkbook(fins);
		
	}
	
	catch(Exception e) {
		System.out.println("File not found :"+ e);
		
	}
	}
      
public String getStrinCellData(String sheetname ,int row, int col ) {
	XSSFSheet sheet = workbook.getSheet(sheetname);
	return sheet.getRow(row).getCell(col).getStringCellValue();
	}

public String getStrinCellData(int sheetIndex ,int row, int col ) {
	XSSFSheet sheet = workbook.getSheetAt(sheetIndex);
	return sheet.getRow(row).getCell(col).getStringCellValue();
	}

public int getNumricCellData(String sheetname ,int row, int col ) {
	XSSFSheet sheet = workbook.getSheet(sheetname);
	return (int)sheet.getRow(row).getCell(col).getNumericCellValue();
	}

public int getNumricCellData(int sheetIndex ,int row, int col ) {
	XSSFSheet sheet = workbook.getSheetAt(sheetIndex);
	return (int) sheet.getRow(row).getCell(col).getNumericCellValue();
	}

  // Excel DataProvider
  public Object[][] getExcelData(String sheetname) {
		XSSFSheet sheet = workbook.getSheet(sheetname);
		
		int totalRow = sheet.getLastRowNum();
		short totalCols = sheet.getRow(0).getLastCellNum();
		
		Object[][] data = new Object[totalRow][totalCols];

		for(int i=0; i < totalRow; i++) {
			for(int j=0;j<totalCols; j++) {
			
				data[i][j] = sheet.getRow(i+1).getCell(j).toString();
				
			}
		}
      return data;
  }
}


