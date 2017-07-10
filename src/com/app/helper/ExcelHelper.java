package com.app.helper;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHelper {
	public static Object[][] getdata(){
		Object[][] data=null;
		XSSFWorkbook wb = null;
		 try {
			 wb = new XSSFWorkbook(new FileInputStream("C:\\Users\\ompra\\AutomationFrameworkProject\\AutomationFramework\\Resources\\TestData\\Test_Data.xlsx"));
			XSSFSheet sheet= wb.getSheetAt(0);
			int rowCount =sheet.getLastRowNum();
		    data = new Object[rowCount][2];
		    Row toprow=sheet.getRow(0);
		    sheet.removeRow(toprow);
		    Iterator<Row> rows=sheet.iterator();
		    int i=0;
		    while(rows.hasNext()){
		    int j=0;
		    Row row=rows.next();
		    Iterator<Cell> cells=row.cellIterator();
		    while(cells.hasNext()){
		    	Cell cell= cells.next();
		    	data[i][j]=cell.getStringCellValue();
		    	j++;
		    }
		    i++;
		    }
		    return data;
		 }catch (IOException e) {
				e.printStackTrace();
		 }
		return null;
	}
	}
	
		   