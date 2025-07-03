package com.list.arraylist;

import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add(10);
		list.add(20);
		
		System.out.println(list.contains(10));
		System.out.println(list);
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		System.out.println(list.remove(1));
		
		
		
		ArrayList list2 = new ArrayList();
		
		list2.add("aaa");
		list2.add("bbb");
		
		
		list.addAll(list2);
		System.out.println(list);
		
		list.clear();
		System.out.println(list);

	}

}
