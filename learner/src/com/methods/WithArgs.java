package com.methods;

import java.util.Scanner;

public class WithArgs 
{
	public static void multiplicationOfTwoNumbers(int i,int g)
	{
		int c;
		c=i*g;
		System.out.println(c);
	}

	public static void divisionOfTwoNumbers(int c,int d)
	{
		int e;
		e=c/d;
		System.out.println(e);
	}
	
	public static void main(String[] args) 
	{
	   Scanner sc = new Scanner(System.in);    
       System.out.println("Enter two numbers for multiplication");
       int i =sc.nextInt();
       int g=sc.nextInt();
       WithArgs.multiplicationOfTwoNumbers(i, g);
       
//       System.out.println("Enter two numbers for division");
//       int k =sc.nextInt();
//       int l=sc.nextInt();
//       WithArgs.divisionOfTwoNumbers(k, l);
//	
	}
}
