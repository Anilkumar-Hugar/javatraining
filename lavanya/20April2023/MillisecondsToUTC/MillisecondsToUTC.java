package com.work;

import java.util.Scanner;
import java.util.TimeZone;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MillisecondsToUTC {
	public static void main(String args[]) {
		Scanner in= new Scanner(System.in);
		Long milliSec = in.nextLong();
		//date from milliseconds
		Date resultdate = new Date(milliSec);
		System.out.println("Date"+resultdate);
		//get timezone of date
		SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yy HH:mm");
		dateformat.setTimeZone(TimeZone.getDefault());
		try {
			//get timezone of UTC
			SimpleDateFormat utcformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			utcformat.setTimeZone(TimeZone.getTimeZone("UTC"));
			//conversion of date to utc
			String utcdate=utcformat.format(resultdate);
			System.out.println("UTCTime of Milliseconds" + utcdate);
		} catch (Exception e) {
			e.printStackTrace();
		}	

	}
}
