package com.arrays.twod;

public class InitializeAndTraverse {

	public static void main(String[] args) {
		int arr[][] = {{1,3,2},{6,4,5},{8,7,9}};
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length; j++)
			{
				System.out.print(" "+arr[i][j]);
			}
		}
	}

}
