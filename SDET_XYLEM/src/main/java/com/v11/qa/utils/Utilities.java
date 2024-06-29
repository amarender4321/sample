package com.v11.qa.utils;

import java.util.Date;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class Utilities {

	public static final int IMPLICIT_WAIT_TIME=10;
	public static final int PAGE_lOAD_TIME=5;


	public  static String qenerateEmailWithTimeStap() {

		Date date = new Date();
		String timestamp = date.toString().replace(" ","_").replace(":","_");
		return "amarender984"+timestamp+"@gmail.com";

		
	}
		
		public static Object[][] getTextDataFromExcel(String sheetName){


			File excelFile= new File(System.getProperty("user.dir")+"src\\main\\java\\com\\v11\\qa\\testdata\\v11TestData.xlsx");
			XSSFWorkbook workbook=null;
			try {


				FileInputStream fisExcel= new FileInputStream(excelFile);
				workbook=new XSSFWorkbook(excelFile);
			} catch(Throwable e) {
				e.printStackTrace();
			}

			XSSFSheet sheet = workbook.getSheet(sheetName);
			int rows = sheet.getLastRowNum();
			short cols = sheet.getRow(0).getFirstCellNum();

			Object[][] data=new Object[rows][cols];
			for(int i=0;i<rows;i++) {
				XSSFRow row = sheet.getRow(i+1);

				for(int j=0;j<cols;j++) {

					XSSFCell cell = row.getCell(j);
					CellType cellType = cell.getCellType();

					switch (cellType) {

					case STRING:
						data[i][j]=cell.getStringCellValue();
						break;

					case NUMERIC:
						data[i][j]=Integer.toString((int)cell.getNumericCellValue());
						break;
					case BOOLEAN:
						data[i][j]=cell.getBooleanCellValue();
						break;
					}
				}
			}


return data;

		}
	}


