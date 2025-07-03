package com.list.cursors;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		list.add("bandewar");
		list.add("sai");
		list.add("krishna");
		list.add(null);
		
		System.out.println(list);
		
		ListIterator litr = list.listIterator();
		
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		litr.next();
		litr.next();
		litr.next();
		litr.next();
		
		
		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
		}
		
		litr.add("shiva");
		System.out.println(list);
		
		litr.previous();
		
		litr.set("kitty");
		System.out.println(list);
	}
	
	

}
