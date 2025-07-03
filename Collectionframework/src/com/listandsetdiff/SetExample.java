package com.listandsetdiff;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		Set set = new HashSet();
		
		set.add(100);
		set.add(200);
		set.add(null);
		set.add("abc");
		set.add(50);
		set.add(400);
		set.add(50);
		set.add(null);
		
		//System.out.println(set);
		
		Iterator itr = set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	
	}

}
