 package com.ecom.flipkart.GenericUtility;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

/**
 * 
 * @author nikhil raj
 *
 */
public class JavaUtility implements IConstantUtility{
	/**
	 * it is used to generate random number
	 * @return int data
	 */

	public int getRanDomNumber() {
		Random random = new Random();
		int intRandom = random.nextInt (10000);
		return intRandom;
	}
	/**
	 * used to get system date in YYYY-MM-DD format
	 * @return System Date
	 */

	public String getSystemDate() {
		LocalDate date = java.time.LocalDate.now();
		return date.toString();
	}
	/**
	 * used to get system date and time in YYYY/MM/DD HH:mm:ss format
	 * @return System date and time with  YYYY/MM/DD HH:mm:ss format
	 */
	public String getSystemDateWithFormate() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(dateformat);  
		   LocalDateTime now = LocalDateTime.now();  
		   Object finalformate = dtf.format(now);
		


		return (String) finalformate;
	}
}
