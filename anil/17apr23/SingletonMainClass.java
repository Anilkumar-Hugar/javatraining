package com.singletonClass;

public class SingletonMainClass {
	public static void main(String[] args) {
		// Singleton single=new Singleton(); 
		//Here we will be getting error as we are using singleton method to create single object
		Singleton.instance();
		System.out.println(Singleton.instance().hashCode());
	}
}
