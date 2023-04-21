package com.secToUtc;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class MillisecToUTC {

	public static void main(String[] args) {
		final TimeZone zone = TimeZone.getTimeZone("UTC");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the milli secs to convert into UTC: ");
		long millSecs = scanner.nextLong();
		SimpleDateFormat format = new SimpleDateFormat();
		format.setTimeZone(zone);
		String date = format.format(new Date(millSecs));
		System.out.println("millisecs to UTC: " + date);

		scanner.close();
	}
}
