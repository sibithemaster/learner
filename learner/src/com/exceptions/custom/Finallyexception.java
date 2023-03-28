package com.exceptions.custom;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Finallyexception
{
	public static void main(String args[]){
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter first number");
	int a=sc.nextInt();
	System.out.println("Enter second number");
	int b=sc.nextInt();
	int c;
	
	try{ 
		c=a/b;  
		System.out.println(c);
		//throw new ArithmeticException("Exception caught");
	}
//	catch(ArithmeticException e)
//	{
//		System.out.println("Exception caught "+e.getMessage());
//	}  
	finally {
		System.out.println("rest of the code...");
	}
//	try {  
//
//		int s=sc.nextInt();
//		System.out.println("welcome");
//	}
//	catch(InputMismatchException f)
//	{
//		System.out.println(f.getMessage());
//	}  
//	finally {
//		System.out.println("rest of the code...");
//	}
//	
	
}
}
