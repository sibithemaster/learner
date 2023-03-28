package com.methods;

import java.util.Scanner;

public class WithArgsAndReturn 
{
	public String positiveOrNegative(int a) 
	{
		int b=a;
		if(b>0)
		{
			return "positive number";
		}else {
			return "negative number";
		}				
	}
	
	public static void main(String[] args) {
      
	  Scanner sc = new Scanner(System.in);
	  WithArgsAndReturn wi = new WithArgsAndReturn(); 
	  System.out.println("Enter a number");

	  int i=sc.nextInt();
      System.out.println( wi.positiveOrNegative(i) );

	}

}
