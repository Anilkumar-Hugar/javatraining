package com.Java.Practice;

import java.util.HashMap;

public class ImmutableMain {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		ImmutableExample immutableObj = new ImmutableExample(1,"Manas",map);
		System.out.println(immutableObj.getValue());
		immutableObj.getMap().put(3, "reethu");
		System.out.println(immutableObj.getName());
		System.out.println(immutableObj.getMap());
		
	}

}
