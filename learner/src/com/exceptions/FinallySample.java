package com.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallySample {

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int c;
		try{  
			//code that may raise exception  
			System.out.println("Enter first number");
			int a=sc.nextInt();
			System.out.println("Enter second number");
			int b=sc.nextInt();
			c=a/b;  
			System.out.println(c);
		}	
		
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}  
		catch(InputMismatchException exx)
		{
			System.out.println(exx.getMessage());
		}
        
		catch(Exception ex) {
        	System.out.println(ex.getMessage());
		}
		finally {
			System.out.println("rest of the code...");
		} 
		
		
//		try{  
//            System.out.println("Enter a number");
//			int s=sc.nextInt();
//			System.out.println("welcome");
//		}
//		catch(InputMismatchException e)
//		{
//			System.out.println(e.getMessage());
//		}  
//		finally {
//			System.out.println("rest of the code...");
//		}
		
		
	}
}
