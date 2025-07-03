package com.ifelse;

public class BiggestOfThree {

	public static void main(String[] args) {
		int a=1;
		int b=2;
		int c=3;
		
		if(a>b && a>c)
		{
			System.out.println("a is bigger");
		}
		if(b>a && b>c)
		{
			System.out.println("b is bigger");
		}
		else {
			System.out.println("c is bigger");
		}
	}

}
