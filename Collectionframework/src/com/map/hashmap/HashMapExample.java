package com.map.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap();
		
		map.put(1, "shiva");
		map.put(2, "krishna");
		map.put(3, "bandewar");
		map.put(3, "Bandewar");  //last order 
		
		
		System.out.println(map);

		System.out.println(map.remove(1));
		System.out.println(map);
		
		map.replace(2, "kitty");
		System.out.println(map);
		
		Set set = map.entrySet();
		System.out.println(set);
		
		Iterator itr = set.iterator();
		
//		for(Map.Entry me : map.entrySet())
//		{
//			System.out.println(me.getKey()+"   "+me.getValue());
//		}
		
//		while(itr.hasNext())
//		{
//			Map.Entry entry =  (Entry) itr.next();
//			System.out.println(entry.getKey()+ "   "+ entry.getValue());
//		}
				
		
		
	}

}
