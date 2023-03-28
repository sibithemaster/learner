package com.exceptions;

public class StringIndex 
{
	public static void main(String args[])
	{
		String s="Iamthebest";	
		try {
			System.out.println(s.charAt(81));
		}catch(StringIndexOutOfBoundsException ex) {
			System.out.println("Exceptions handled : "+ex.getMessage());
		}				
		System.out.println("Resolved exceptions");		
	}
}
