package com.wrapper;

public class WrapperExampleAutoBoxing
{  
	public static void main(String args[])
	{  
		//Converting int into Integer  
		int a=20;  
		
		//converting int into Integer explicitly
		Integer explicit=Integer.valueOf(a);  
		
		//autoboxing, now compiler will write Integer.valueOf(a) internally
		Integer internal=a;  

		System.out.println("Local variable =======> "+a);  
		System.out.println("Integer explicitly ===> "+explicit);
		System.out.println("Autoboxing  variable =======> "+internal);
	}
}  
