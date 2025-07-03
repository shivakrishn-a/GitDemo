package com.loopnumbers;

public class FibanocciSeries {

	public static void main(String[] args) {
		int a = 0; int b =1; int c=0; int num=20;
		
		//System.out.println(a+" "+b+" ");
		
		for(int i=0; i<num; i++)
		{
			c = a+b;
			
			System.out.println(c+" ");
			
			a = b;
			b =c;
		}
	}

}
