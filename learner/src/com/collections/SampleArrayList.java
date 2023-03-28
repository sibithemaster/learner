package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SampleArrayList {

	public static void main(String[] args) 
	{
		List l=new ArrayList();
		
		l.add(100);
		l.add(10);
		l.add(10.2);
		l.add(10000.500);
		l.add(9003690139l);
		l.add('a');	
		l.add("hello");
		l.add(true);		
		l.add(1);
		l.add(2);		
		
		System.out.println(l);
		System.out.println(l.size());
		System.out.println(l.get(5));
		
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));
		}
		
		
	}

}
