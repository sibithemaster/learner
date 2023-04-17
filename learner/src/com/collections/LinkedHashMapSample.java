package com.collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class LinkedHashMapSample extends SampleTreemap{
	public static void main(String[] args) {
		
		Map<Integer,Double> m = 
				new LinkedHashMap<Integer,Double>();
		m.put(5, 10000.500);
		m.put(8, 5000.0);
		m.put(7, 22000.22);
		m.put(9, 15551.11);
		m.put(11, 55555.55);
		m.put(1, 6666.500);
		
		System.out.println(m);
		
		Set<Entry<Integer, Double>> s =m.entrySet();
		for(Entry<Integer, Double> x:s){
		System.out.println(x);
		}
		
		System.out.println(m.containsKey(1));
		
		m.put(5, 1111.234);
		
		System.out.println(m);
        
//		float a=1,b=2,c=a/b;
//		System.out.println(c);
	}

}
