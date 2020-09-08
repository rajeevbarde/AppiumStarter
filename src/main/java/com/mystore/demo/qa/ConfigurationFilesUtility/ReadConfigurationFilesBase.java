package com.mystore.demo.qa.ConfigurationFilesUtility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfigurationFilesBase {

	private File file;
	private FileInputStream fileInputStream;
	private Properties properties;
	private String filepath;
	public ReadConfigurationFilesBase(String filepath) {
		try{
			this.filepath=filepath;
			this.file=new File(this.filepath);
			this.fileInputStream=new FileInputStream(this.file);
			this.properties=new Properties();
			this.properties.load(this.fileInputStream);
		}catch(Exception ae){
			ae.printStackTrace();
		}
	}
	
	public File getFile(){
		File file = null;
		try{
			file=this.file;
		}catch(Exception ae){
			ae.printStackTrace();
		}return file;}
	
	public FileInputStream getFileInputStream(){
		FileInputStream fileInputStream=null;
		try{
			fileInputStream=this.fileInputStream;
		}catch(Exception ae){
			ae.printStackTrace();
		}return fileInputStream;}
	
	public Properties getProperties(){
		Properties properties=null;
		try{
			properties=this.properties;
		}catch(Exception ae){
			ae.printStackTrace();
		}return properties;}
	
	public String getFilePath(){
		String FilePath="";
		try{
			FilePath=this.filepath;
		}catch(Exception ae){
			ae.printStackTrace();
		}return FilePath;}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
