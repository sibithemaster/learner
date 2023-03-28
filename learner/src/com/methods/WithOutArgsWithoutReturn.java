package com.methods;

import java.util.Scanner;

public class WithOutArgsWithoutReturn 
{
    public void addTwoNumbers()
    {
    	int a=10,b=20,c;
    	c=a+b;
    	System.out.println("Addition of two numbers : "+c);  	
    }
    
    public void subtractTwoNumbers()
    {
    	int a=10,b=20,c;
    	c=a-b;
    	System.out.println("Subtraction of two numbers : "+c); 	
    }
    
	public static void main(String[] args) 
	{	
//		 Classname              objectname = new Classname();	
         WithOutArgsWithoutReturn with     = new WithOutArgsWithoutReturn();    
         with.addTwoNumbers();
         with.subtractTwoNumbers();
         System.out.println();
	}

}
//Method types
//WITHOUT ARGUMENT AND WITHOUT RETURN TYPE
//WITH ARGUMENT AND WITHOUT RETURN TYPE
//WITH ARGUMENT AND WITH RETURN TYPE
//WITHOUT ARGUMENT AND WITH RETURN TYPE
