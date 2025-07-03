package com.strings;

public class MethodsOfStringClass {

	public static void main(String[] args) {
		String str = "welcome";
		
		char ch = str.charAt(0);
		System.out.println("char at index 0 "+ch);
		
		String s1 = "data";
		String s2 = "base";
		
		String s3 = s1.concat(s2);
		
		System.out.println("after concatination " + s3);
		
		boolean b = str.startsWith("wel");
		System.out.println("contains"+b);
		
		boolean b2 = str.endsWith("come");
		System.out.println("contains"+b2);
		
		String caps = new String("HELLO");
		String small = new String("hello");
		
		System.out.println(caps.hashCode());
		System.out.println(small.hashCode());
		
		System.out.println(caps.equals(small));
		System.out.println(caps.equalsIgnoreCase(small));
		
		int index = str.indexOf('m');
		System.out.println(index);
		
		System.out.println("weather it empty"+str.isEmpty());
		
		int n = str.length();
		System.out.println("lenget = "+n);
		
		String lang = "malayalam";
		
		String lang2 = lang.replace('a', '@');
		System.out.println(lang2);
		
		String sentence = "objecte oriented programming language";
		String senarr[] = sentence.split(" ");
		for(int i=0; i<senarr.length; i++)
		{
			System.out.println(senarr[i]);
		}
		
		String str2 = str.substring(3);
		System.out.println(str2);
		
		char []chararr = str.toCharArray();
		for(int i=0; i<chararr.length; i++)
		{
			System.out.println(chararr[i]);
		}
		
		String name = "shivaKriShNA";
		String lower = name.toLowerCase();
		System.out.println(lower);
		String upper = name.toUpperCase();
		System.out.println(upper);
	}

}
