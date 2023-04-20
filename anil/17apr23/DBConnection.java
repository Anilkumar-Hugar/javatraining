package com.databaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	private static Connection connection = null;

	private DBConnection() {

	}

	public static Connection connection() {
		if (connection == null) {
			try {
				connection = DriverManager.getConnection("jdbc:postgresql://localhost/postgres", "postgres", "1234");
			} catch (Exception e) {
				e.getMessage();
			}
		}
		return connection;

	}
}
