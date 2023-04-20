package com.immutable;

import java.util.ArrayList;

public class ImmutableMainClass {
	public static void main(String[] args) {
		ArrayList<Integer>lists=new ArrayList<Integer>();
		ImmutableClass immutableClass=new ImmutableClass(1,"anil",lists);
		lists.add(3);
		System.out.println(immutableClass.getList());
		lists.add(4);
		System.out.println(immutableClass.getList());
	}
}
