package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExelImport {
	
	
	/*private static int getColumnByName(org.apache.poi.ss.usermodel.Sheet worksheet, String name) {
		for (Cell cell : worksheet.getTopRow()) {
			if (name.equals(cell.getData$())) {
				return cell.getIndex();
			}
		}
		
	}
	
	public String getdata(String datasheetName, String fieldName){
		org.apache.poi.ss.usermodel.Sheet testDataWs = myworkbook.getWorksheet(datasheetName);
		int columnNum = getColumnByName(testDataWs, fieldName);
		String data = null;
		return data;
		
	}*/

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String filePath = System.getProperty("user.dir")+"\\Resources\\TestData.xlsx";
		File file = new File(filePath);
		FileInputStream inputstream = new FileInputStream(file);
		Workbook myworkbook = new XSSFWorkbook(inputstream);
		org.apache.poi.ss.usermodel.Sheet mysheet = myworkbook.getSheet("GeneralData");
		int rowcount = mysheet.getLastRowNum()-mysheet.getFirstRowNum();
	
		
		for(int i=0;i<rowcount+1;i++){
			Row row = mysheet.getRow(i);
			
			
			
			for(int j=0;j<row.getLastCellNum();j++){
				System.out.println(row.getCell(j).getStringCellValue());
			}
		}
		
		
	}

}
