package com.strings;

import java.util.ArrayList;
import java.util.List;

public class SampleArrayList {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		list.add(1001);
		list.add(1001);
		list.add("RajKumar");
		list.add(123455.55);
		list.add(25.5f);
		list.add(9009009001l);
		list.add('a');
		list.add(true);
		list.add(20);
		list.add(123);
		
		
		System.out.println(list);
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
		System.out.println(list.get(0));
		System.out.println(list.contains("RajKumar"));
		System.out.println(list.lastIndexOf(123));
		
		list.add(1, "Chennai");
		System.out.println(list);
	}

}
