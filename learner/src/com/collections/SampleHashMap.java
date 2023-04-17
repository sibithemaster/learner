package com.collections;

//import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SampleHashMap {
	public static void main(String[] args) {
		Map<Integer,String> m = new HashMap<Integer,String>();
		m.put(null, "Vijay");
		m.put(null, "Jhon");
		m.put(6, null);
		m.put(7, null);
		m.put(1, "Jhon");
		m.put(1, "Kane");
		m.put(2, "Anil");
		m.put(3, "Kumar");
		m.put(4, "Anil");
		m.put(5, "Krishna");
		
		System.out.println(m);
		
		Set<Map.Entry<Integer,String>> set =m.entrySet();
		for(Entry<Integer, String> map : set)
		{
		System.out.println(map);
		}
		
////		System.out.println(m);
		System.out.println(m.get(1));
		System.out.println(m.keySet());
		System.out.println(m.values());

	}

}
