package com.listandsetdiff;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListExample {

	public static void main(String[] args) {
		
		List list = new ArrayList();

		list.add(0, 1);
		list.add(20);
		list.add(null);
		list.add(null);
		
		//System.out.println(list);
		
	   Iterator i = list.iterator();
	   
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		ListIterator litr = list.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		
		

	}

}
