package com.ecom.flipkart.GenericUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

/**
 * 
 * @author nikhil raj
 *
 */
public class DataBaseUtility implements IConstantUtility{
	
	static Driver driver;
	static Connection connection;
	static ResultSet result;
    
	/**
	 * This method will perform the mysql database connection
	 * @throws SQLException 
	 */
	public void connectDB() throws SQLException {
		try {
			driver=new Driver();
			DriverManager.registerDriver(driver);
			connection=DriverManager.getConnection(DatabaseUrl,Username,password);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	/**
	 * This method will close the mysql database
	 * @throws SQLException
	 */
	public void closeDB() throws SQLException {
		try {
		  connection.close();
		}catch (Exception e) {
		}


	}
	/**
	 * This method will execute the querry
	 * @param query
	 * @return
	 * @throws Throwable
	 */
	public ResultSet execyteQuery(String query) throws Throwable {	
			result = connection.createStatement().executeQuery(query);
			return result;		
	}
	
	/**
	 * This method will execute the querry
	 * @param query
	 * @return
	 * @throws Throwable
	 */
	public int execyteUpdate(String query) throws Throwable {
		
			int result = connection.createStatement().executeUpdate(query);
	
		return result;

	}
	/**
	 * This method will execute querry based on querry and it will verify the data. 
	 * @param querry
	 * @param columnName
	 * @param expectedData
	 * @return
	 * @throws Throwable
	 */
	public boolean executeQuerryAndVerify(String querry,int columnName,String expectedData) throws Throwable {
		boolean flag=false;
		result=connection.createStatement().executeQuery(querry);
		while(result.next()) {
			if(result.getString(columnName).equals(expectedData)) {
				flag=true;
				break;
			}
		}
		if(flag) {
			System.out.println(expectedData+"==>Data is verified in the data base table");
			return flag;
		}else {
			System.out.println(expectedData+"==>data is not verified in the database");
			return flag;
		}
         
	}
}

