package com.arrays.twod;

public class SumofElements {

	public static void main(String[] args) {
		int arr[][] = {{1,2,3},{4,5,6},{8,7,9}};
		int sum =0;
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length; j++)
			{
				sum = sum+arr[i][j];
			}
		}
		System.out.println(sum);
	}

}
