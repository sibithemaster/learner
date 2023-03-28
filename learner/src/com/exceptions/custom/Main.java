package com.exceptions.custom;

import java.util.Scanner;

//A Class that uses above MyException
public class Main {
	// Driver Program
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int age=sc.nextInt();			
		try {
			// Throw an object of user defined exception
			if(age>18) {
				System.out.println("Eligible to vote");
			}else {
				throw new MyException("Not Eligible to vote");
			}
		}
		catch (MyException ex) {
			System.out.println("Exception caught");
			// Print the message from MyException object
			System.out.println(ex.getMessage());
		}
		System.out.println("code executed..");
	}
}
