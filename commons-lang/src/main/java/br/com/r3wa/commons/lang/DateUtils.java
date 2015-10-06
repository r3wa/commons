package br.com.r3wa.commons.lang;

import static java.time.format.DateTimeFormatter.BASIC_ISO_DATE;
import static org.apache.commons.lang3.StringUtils.isBlank;
import static org.apache.commons.lang3.time.DateUtils.parseDate;
import static org.apache.commons.lang3.time.DateUtils.setHours;
import static org.apache.commons.lang3.time.DateUtils.setMilliseconds;
import static org.apache.commons.lang3.time.DateUtils.setMinutes;
import static org.apache.commons.lang3.time.DateUtils.setSeconds;

import java.time.LocalDate;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class DateUtils {



	public static Date firstHourDay(Date date) {
		return setTime(date, 0 , 0 ,0);
	}



	public static Date lastHourDay(Date date) {
		return setTime(date, 23 , 59 , 59);
	}






	private static Date setTime(Date date, int hour, int minutes, int seconds) {
		date = setHours(date, hour);
		date = setMinutes(date, minutes);
		date = setSeconds(date, seconds);
		date = setMilliseconds(date, 0);
		return date;
	}



	public static Date toDate(String date, String pattern) {

		if(isBlank(date)){
			return null;
		}

		try {
			return parseDate(date, pattern);
		} catch (Exception e) {
			throw new R3WACommonsLangException("The date [ " + date + " ] is not in formart -->  [ " + pattern + " ]");
		}

	}




	public static String now() {
		return LocalDate.now().format(BASIC_ISO_DATE);
	}





	public static XMLGregorianCalendar xmlDate(Date date) {

		try {


			if(date == null){
				return null;
			}

			GregorianCalendar calendar = new GregorianCalendar();
			calendar.setTime(date);

			return DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar);

		} catch (Exception e) {
			throw new R3WACommonsLangException("One problem occurred when create xml date -- > " + e.getMessage());
		}

	}


























}
