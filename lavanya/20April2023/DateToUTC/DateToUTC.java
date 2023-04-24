package com.work;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;
public class DateToUTC {
	
    public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the date in the format dd/mm/yy hh:mm");
		String datestr = in.next();  
		SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yy HH:mm");
		dateformat.setTimeZone(TimeZone.getDefault());
		try {
			Date date = dateformat.parse(datestr);
			SimpleDateFormat utcformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			utcformat.setTimeZone(TimeZone.getTimeZone("UTC"));
			String utcdate=utcformat.format(date);
			System.out.println(utcdate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
    }

}