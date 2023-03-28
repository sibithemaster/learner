package com.wrapper;

public class WrapperExampleAutoBoxing
{  
	public static void main(String args[])
	{  
		//Converting int into Integer  
		int a=20;  
		
		//converting int into Integer explicitly
		Integer i=Integer.valueOf(a);  
		
		//autoboxing, now compiler will write Integer.valueOf(a) internally
		Integer j=a;  

		System.out.println("Local variable =======> "+a);  
		System.out.println("Integer explicitly ===> "+i);
		System.out.println("Autoboxing  variable =======> "+j);
	}
}  
