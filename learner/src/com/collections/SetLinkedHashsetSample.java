package com.collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetLinkedHashsetSample 
{
	public static void main(String[] args) 
	{
		Set s=new LinkedHashSet();		
		s.add(10);
		s.add(20.2);
		s.add(10000);
		s.add(9003690138l);
		s.add(true);		
		System.out.println(s);		
		
		for(Object i:s)	
		{
			System.out.println(i);
		}	
		Set ss=new LinkedHashSet();
		ss.add("hai");
		ss.add(25);
		ss.add(2500000);
		s.addAll(ss);
		s.remove(10);
		System.out.println(s);	
		
	    System.out.println(s.hashCode());
	    System.out.println(ss.hashCode());
	    s.removeAll(ss);
		System.out.println(s);
////////		System.out.println(s.removeAll(ss));
		s.clear();
		System.out.println(s);
		
	}

}
