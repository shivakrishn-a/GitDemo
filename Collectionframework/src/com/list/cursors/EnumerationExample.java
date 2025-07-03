package com.list.cursors;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationExample {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		v.add(10);
		v.add("shiva");
		v.add(true);
		
		Enumeration e = v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
	}

}
