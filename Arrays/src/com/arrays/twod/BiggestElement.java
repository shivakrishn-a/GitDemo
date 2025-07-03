package com.arrays.twod;

public class BiggestElement {

	public static void main(String[] args) {
		int arr[][] = {{2,3,1},{4,6,5},{8,7,9}};
		int big = arr[0][0];
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				if(arr[i][j] > big)
				{
					big = arr[i][j];
				}
			}
		}
		System.out.println(big);
	}

}
