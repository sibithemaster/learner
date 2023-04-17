package com.wrapper;

public class Unboxing
{    
	public static void main(String args[])
	{    
		//Converting Integer to int    
		Integer id=new Integer(500);
		
		//converting Integer to int explicitly
		int explicit=id.intValue();
		
		//unboxing, now compiler will write a.intValue() internally
		int internal=id;    

		//System.out.println(a+" "+i+" "+j);  
		System.out.println("Object variable value =======> "+id);  
		System.out.println("Integer to int explicitly ===> "+explicit);
		System.out.println("Object to primitive =========> "+internal);
		
		
//		String s="Object variable value ";
//		System.out.println(s.toLowerCase());
//		System.out.println(s.toUpperCase());
//		String l=s.substring(2, 5);
//		System.out.println(l);
//		System.out.println(s.indexOf('a'));
//		System.out.println(s.lastIndexOf("e"));
//		String s1="hello";
//		System.out.println(s1.replace("hello", "sibi"));
//		
	}
} 
