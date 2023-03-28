package com.collections;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class SampleTreemap {
	public static void main(String[] args) {		
		Map<String,Long> m = 
				new TreeMap<String,Long>();	
		m.put("si123@gmail.com", 9003691234l);
		m.put("india@gmail.com", 9503691234l);
		m.put("anil54@gmail.com", 9123691234l);
		m.put("kumar2@gmail.com", 963691234l);
		m.put("jerome@gmail.com", 983691234l);
		m.put("jack@gmail.com", 983591234l);
		m.put("jenny@gmail.com", 987691234l);	

		System.out.println(m);
		
		Set<Entry<String,Long>> s =m.entrySet();
		for(Entry<String,Long> x:s){
		System.out.println(x);
		}
	}

}
