package com.ifelse;

public class SwitchCase {

	public static void main(String[] args) {
        char ch = 'a';
        
        switch (ch)
        {
         case 'a':
        	System.out.println("vowel");
        	break;
        	
         case 'b':
        	 System.out.println("consonant");
         default:
         	System.out.println("this is defult");
        }
        
	}

}
