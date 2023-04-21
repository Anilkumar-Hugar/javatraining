package com.secToUtc;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class DateToUTC {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the date in the format dd/mm/yy hh:mm");
		String dateStr = input.nextLine();
		// converting string to date datatype
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yy HH:mm");
		dateFormat.setTimeZone(TimeZone.getDefault());
		try {
			Date date = dateFormat.parse(dateStr);
			SimpleDateFormat utcFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			utcFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
			String utcDateStr = utcFormat.format(date);
			System.out.println("UTC Date: " + utcDateStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		input.close();
	}
}
