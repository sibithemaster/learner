package com.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number");
        try {
        	int i=sc.nextInt();
        	System.out.println(i);
        }catch(InputMismatchException e)
        {
    	 System.out.println("Exceptions handled : "+e.getMessage());
        }
        
        System.out.println("hello");
        
        
	}

}
