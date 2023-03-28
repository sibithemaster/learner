package com.wrapper;

public class Unboxing
{    
	public static void main(String args[])
	{    
		//Converting Integer to int    
		Integer a=new Integer(3);
		
		int i=a.intValue();//converting Integer to int explicitly
		
		int j=a;//unboxing, now compiler will write a.intValue() internally    

		//System.out.println(a+" "+i+" "+j);  
		System.out.println("Object variable value =======> "+a);  
		System.out.println("Integer to int explicitly ===> "+i);
		System.out.println("Object to primitive =========> "+j);
		
		
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
