package com.immutable;

import java.util.ArrayList;

final class ImmutableClass {
	private final int id;
	private final String name;
	private final ArrayList<Integer> list;

	public ImmutableClass(int id, String name, ArrayList<Integer> list) {
		this.id = id;
		this.name = name;
		this.list = list;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public ArrayList<Integer> getList() {
		ArrayList<Integer> lists = new ArrayList<>();
		lists.add(1);
		lists.add(2);
		return new ArrayList<>(lists);
	}

	@Override
	public String toString() {
		return "ImmutableClass [id=" + id + ", name=" + name + ", list=" + list + "]";
	}

}
 