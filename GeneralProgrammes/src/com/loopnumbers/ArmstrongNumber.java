package com.loopnumbers;

public class ArmstrongNumber {
	 public static void main(String [] args)
	  {
		 int num = 153, rem, cube, sum, temp;
		 sum=0;
		 temp=num;
		 
		 while(num>0)
		 {
			 rem = num %10;
			 cube = rem*rem*rem;
			 sum = sum + cube;
			 num = num %10;		 
		 }
		 num = temp;
		 
		 if(num == sum)
		 {
			 System.out.println(num+"is an armstrong");
		 }
		 else {
		     System.out.println("not an armstrong");
		 }
		 
	  }
}
