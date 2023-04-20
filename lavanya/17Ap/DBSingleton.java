package com.java.practice;

public class DBSingleton {
	//private static field - It gets memory only once because of static, it contains the instance of the Singleton class.
	private static DBSingleton dbObject;
	
	//private constructor - this is to avoid creation of objects outside class
	//private constructor to restrict the clients from use of this constructor	   
	private DBSingleton() {	
		System.out.println("Constructor of DBSingleon class - as only single connection can be established");
	}
	//public static - we will create a condition that restricts us from creating more than one object.
	public static DBSingleton getinstance() {
		if(dbObject==null) {
			dbObject = new DBSingleton();
		}
		return dbObject;
	}
	
}