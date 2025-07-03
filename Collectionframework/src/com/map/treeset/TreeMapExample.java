package com.map.treeset;

import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		TreeMap tm = new TreeMap();
		
		tm.put(1, "shiva");
		tm.put(12, "krishna");
		tm.put(11, "bandewar");
		tm.put(187, 'b');
		tm.put(145, 100);
		
		System.out.println(tm);
		
		System.out.println(tm.ceilingKey(179));
		
		System.out.println(tm.keySet());
		
		System.out.println("first key is "+ tm.firstKey());
		System.out.println("last key is "+tm.lastKey());
		
		System.out.println("first entry is " + tm.firstEntry());
		System.out.println("last entry is : "+ tm.lastEntry());
	}

}
