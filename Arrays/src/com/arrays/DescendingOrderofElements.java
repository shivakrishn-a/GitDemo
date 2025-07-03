package com.arrays;

public class DescendingOrderofElements {

	public static void main(String[] args) {
		int arr[] = {1,9,5,3,7,6,8,2};
		int temp;
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length-1-i; j++)
			{ 
				if(arr[j] < arr[j+1])
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("biggest element is = " + arr[0]);
	}

}
