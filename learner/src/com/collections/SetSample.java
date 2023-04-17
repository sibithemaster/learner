package com.collections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetSample {
	public static void main(String[] args) {
		Set<String> s=new HashSet<String>();		
		s.add("deepak");
		s.add("roshini");
		s.add("geetha");
		s.add("nandha");
		s.add("arun");		
		s.add("arun");
		System.out.println(s);
		
//		for(int i=1;i<s.size();i++)
//		{
//			System.out.println(s.get(i));
//		}				
		//enhanced or for each loop
		for(String i:s)
		{
			System.out.println(i);
		}
		
        Set l=new HashSet();
		
        l.add(10);
		l.add(10);
		l.add(10.2);
		l.add(10000.500);
		l.add(9878);
		l.add(9003690139l);
		l.add('a');	
		l.add("hello");
		l.add(true);		
		l.add(1);
		l.add(2);		
		
		System.out.println(l);
				
		for(Object  i:l) 
		{	
			System.out.println(i);
		}		
	}
}
