package com.exceptions;

import java.util.Scanner;
public class StringIndex 
{
	public static void main(String args[]){
		Scanner sc = new Scanner (System.in);
		String s=sc.nextLine();	
		try {
			System.out.println(s.charAt(4));
			int a=sc.nextInt();
		}
		catch(StringIndexOutOfBoundsException ex) {
			System.out.println("Exceptions handled : "+ex.getMessage());
		}			
		catch(Exception e) {
			System.out.println("Exceptions handled : "+e.getMessage());
		}
		
		finally {
			System.out.println("Resolved exceptions");
		}				
	}
}
