package com.list.stack;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		
		Stack s = new Stack();
		
		s.push("shiva");
		s.push(10);
		s.push(true);
		s.push('v');
		s.push(null);
		
		s.pop();
		
		
		System.out.println(s);
		System.out.println(s.peek());		
		System.out.println(s.search("shiva"));
		
	}

}
