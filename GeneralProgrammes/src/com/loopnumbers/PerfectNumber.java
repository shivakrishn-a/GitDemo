package com.loopnumbers;

public class PerfectNumber {

	public static void main(String[] args)
	 {
	   int num = 6;
	   int sum = 0;
	  
	   for(int i=1;i<=num/2;i++)
	   {
	     if(num % i == 0)
	     {
	       sum = sum+i;
	     }
	  
	   }
	   if(num == sum)
	   {
	     System.out.println(num + " is a perfect number");
	   }
	   else
	   {
	     System.out.println(num +" is not a perfect number");
	   }

	 }

}
