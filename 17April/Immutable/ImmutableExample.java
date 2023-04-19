package com.Java.Practice;

import java.util.HashMap;


final class ImmutableExample {
	private final int value;
	private final String name;
	private final HashMap<Integer, String> map ;
	
	public ImmutableExample(int value, String name, HashMap<Integer,String> map ) {
		this.value = value;
		this.name = name;
		this.map = map;
	}
	public int getValue() {
		return value;
	}

	public String getName() {
		return name;
	}	
	public HashMap<Integer,String> getMap(){
		map.put(1,"Ankit");
		map.put(2,"Srikar");
		return new HashMap<>(map);		
	}

}
