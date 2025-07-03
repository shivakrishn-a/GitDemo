package com.stars;
public class CenterMissingUpwardPyramid {

    public static void main(String[] args) {
       for(int i=1; i<=5; i++)
       {
    	   for(int j=5; j>=i; j--)
    	   {
    		   System.out.print(" ");
    	   }
    	   
    	   System.out.print("*");

    	   for(int k=1; k<= (i-1)*2; k++)
    	   {
    		   System.out.print(" ");
    	   }
    	   if(i>1)
    	   {
    		   System.out.print("*");
    	   }
    	   System.out.println();
       }
    }
}



