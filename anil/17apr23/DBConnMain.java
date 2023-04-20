package com.databaseConnection;

import java.sql.Connection;

public class DBConnMain {
	public static void main(String[] args) {
		Connection connection = DBConnection.connection();
		if (connection != null) {
			System.out.println("Connection created successfully");
		} else {
			System.out.println("Failed to create onnection");
		}
	}
}
