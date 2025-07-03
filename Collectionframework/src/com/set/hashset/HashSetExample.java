package com.set.hashset;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		
		hs.add("shiva");
		hs.add('b');
		hs.add(true);
		hs.add(10);
		hs.add(null);
		
		//we can iterate on it
		
		System.out.println(hs);
		
		hs.remove("shiva");
		
		System.out.println(hs);
	}

}
