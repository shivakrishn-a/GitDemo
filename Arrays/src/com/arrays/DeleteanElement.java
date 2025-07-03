package com.arrays;

public class DeleteanElement {

	public static void main(String[] args) {
		int arr[] = {1,7,4,5,3,6,9,34,76,12,67,35,47,87,67};
		
		int del = 5;
		
		int newLength = 0;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] != del)
			{
				arr[newLength++] = arr[i];
			}
		}
		for(int i=0; i<newLength; i++)
		{
			System.out.println(arr[i]);
		}
	}

}
