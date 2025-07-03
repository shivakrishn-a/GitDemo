package com.basic;

public class SwapInSingleLine {
  public static void main(String[] args) {
	int a = 1;
	int b = 2;
	
	a = a+b - (b=a);
	
	System.out.println(a + " "+b);
}
}
