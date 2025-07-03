package com.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {

	public static void main(String[] args) {
		 LinkedList list = new LinkedList();
		 
		 list.add(10);
		 list.add("shiva");
		 list.add(5.6);
		 list.add(true);
		 list.add(null);
		 
		 System.out.println(list);
		 
		 list.addFirst("bandewar");
		 list.addLast("krishna");
		 System.out.println(list);
		 
		 Iterator itr = list.iterator();
		 while(itr.hasNext())
		 {
			 System.out.println(itr.next());
		 }
	}

}
