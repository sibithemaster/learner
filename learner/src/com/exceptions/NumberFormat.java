package com.exceptions;

public class NumberFormat {
	public static void main(String args[]){
		String s="123s";
		try {
			int i = Integer.parseInt(s);
			System.out.println(i);
		}
		catch(NumberFormatException ex){
			System.out.println("Exceptions handled : "+ex.getMessage());    
		}
		System.out.println("Welcome");
	}
}
