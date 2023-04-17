package com.exceptions;

public class ThrowSample 
{	
	public static void age(int a) 
	{
		if(a<18) 
		{
			throw new ArithmeticException("Not eligible to vote");
		}
		else 
		{
			System.out.println("Eligible to vote");
		}
		System.out.println("method called");
	}
	
	public static void main(String args[]) throws InterruptedException 
	{		
		ThrowSample.age(19);
		System.out.println("rest of the code...");    
		System.out.println("Hai....");
        Thread.sleep(10000);;
        System.out.println("Bye....");
    }
}
