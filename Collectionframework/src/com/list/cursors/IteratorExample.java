package com.list.cursors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

	public static void main(String[] args) {
		List list = new ArrayList();
		
		list.add("shiva");
		list.add("krishna");
		
		System.out.println(list);
		
		Iterator itr = list.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
