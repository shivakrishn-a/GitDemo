package com.arrays;

public class BubbleSort {
  public static void main(String[] args) {
	int arr[] = {1,9,2,8,3,7,4,6,5,19,12,18,16,37,73,45};
	int temp;
	
	for(int i=0; i<arr.length; i++)
	{
		
		for(int j=0; j<arr.length-1-i; j++)
		{
			if(arr[j] > arr[j+1])
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
 }
}
