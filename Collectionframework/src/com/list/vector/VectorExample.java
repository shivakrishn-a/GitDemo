package com.list.vector;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		v.add(10);
		v.add("shiva");
		v.addElement("krishna");
		v.add(10);
		v.add("shiva");
		v.addElement("krishna");
		v.add(10);
		v.add("shiva");
		v.addElement("krishna");
		v.add(10);
		v.add("shiva");
		v.addElement("krishna");
		v.setElementAt("shiva krishna", 1);
	
		
		System.out.println(v.capacity());
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		System.out.println(v);
	}

}
