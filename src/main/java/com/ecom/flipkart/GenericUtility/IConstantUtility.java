package com.ecom.flipkart.GenericUtility;

public interface IConstantUtility {
	
	/**  
	 * 
	 * @author nikhil raj
	 * 
	 * it is used to get all the constant properties 
	 * 
	 * @param PropertyFilePath 
	 * @param ExcelFilePath 
	 * @param DatabaseUrl
	 * @param DatabaseUsername 
	 * @param Databasepassword 
	 * @param dateformat 
	 * @param implicitWait 
	 * @param explicitWait
	 * 
	 * 
	 * 
	 */
	
	String PropertyFilePath="./src/main/resources/commondata.property";
	String ExcelFilePath="./src/main/resources/flipkart.xlsx";
	
	String DatabaseUrl="jdbc:mysql://localhost:3306/sdet36";
	String Username="root";
	String password="root";
	String dateformat="yyyy/MM/dd HH:mm:ss";
	int implicitWait=20;
	int explicitWait=20;
	
}
