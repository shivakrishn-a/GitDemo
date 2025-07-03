package com.arrays;

public class AddMatrices {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		int b[] = {1,2,3,4,5};
		
		int c [] = new int[b.length];
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<b.length; j++)
			{
				c[i] = a[i]+b[i];
			}
		}
		
		for(int i=0; i<c.length; i++)
		{
			System.out.println(c[i]);
		}
	}

}
