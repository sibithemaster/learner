package com.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Integer number");
        try {
        	int i=sc.nextInt();
        	System.out.println(i);
        }
        catch(InputMismatchException e)
        {
    	 System.out.println("Exceptions handled : "+e.getMessage());
        }
        finally {
        System.out.println("hello");
        }  
        
        System.out.println("welcome.........");
	}
}
