package com.loopnumbers;

public class FactorialNumber {

	public static void main(String[] args) {
		int num=6, fact=1;
		
		for(int i=0; i<num; i++)
		{
			fact = fact*i;
		}
		System.out.println(fact);
	}

}
