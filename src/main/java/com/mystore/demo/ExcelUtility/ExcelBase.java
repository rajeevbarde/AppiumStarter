package com.mystore.demo.ExcelUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import com.aventstack.extentreports.utils.FileUtil;

public class ExcelBase {
	
	private String filepath="";
	private Workbook workbook;
	private Row row;
	private Cell cell;
	private CellType cellType;
	private Sheet sheet;
	private File file;
	private FileInputStream fileInputStream;
	private FileOutputStream fileOutputStream;
	private int TotalRowCount;
	private int TotalColumnCount;
	private int TotalSheetCount;
	private String ActiveSheetName="";
	private int sheetIndex;
	
	
	public ExcelBase(String filePath) {
		try{
			this.file=new File(filePath);
			this.fileInputStream=new FileInputStream(this.file);
			if(FileUtil.getExtension(this.file).equals(".xlsx")){
				this.workbook=new HSSFWorkbook(this.fileInputStream);
				
			}
			
		}catch(Exception ae){
			ae.printStackTrace();
		}
	}
	
	
	
	
	

}
