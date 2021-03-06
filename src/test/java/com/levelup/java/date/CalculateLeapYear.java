package com.levelup.java.date;

import static org.junit.Assert.assertFalse;

import java.time.LocalDate;
import java.time.Year;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.joda.time.DateTime;
import org.junit.Test;

/**
 * This java example will demonstrates how determine leap year in java.
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/examples/calculate-leap-year/'>Calculate leap year</a>
 * 
 */
public class CalculateLeapYear {

	@Test
	public void calculate_leap_year_in_java_with_calendar () {

		  Calendar cal = Calendar.getInstance();
		  cal.set(Calendar.YEAR, 2007);
		  
		  assertFalse(cal.getActualMaximum(Calendar.DAY_OF_YEAR) > 365);
	}
	
	@Test
	public void calculate_leap_year_in_java_with_gregorian_calendar () {

		GregorianCalendar cal = new GregorianCalendar();  
		assertFalse(cal.isLeapYear(2007));
	}
	
	@Test
	public void calculate_leap_year_in_java_with_java8_date_time () {
	
		boolean validLeapYear = Year.of(2007).isLeap();
		
		assertFalse(validLeapYear);

		// or 
		
		boolean isLeapYear = LocalDate.ofYearDay(2007, 1).isLeapYear();

		assertFalse(isLeapYear);
	}
	
	@Test
	public void calculate_leap_year_in_java_with_joda () {
		
		DateTime dateTime = new DateTime();
		boolean isLeapYear = dateTime.withYear(2007).year().isLeap();
		
		assertFalse(isLeapYear);
	}
	
}
