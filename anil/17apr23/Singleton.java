package com.singletonClass;

public class Singleton {
	private static Singleton instance;

	private Singleton() {
		System.out.println("object created using singleton class");
	}

	public static Singleton instance() {
		if(instance==null) {
			instance=new Singleton();
		}
		return instance;
	}
}
