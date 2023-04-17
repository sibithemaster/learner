package com.exceptions;

public class Arithmetic {

	public static void main(String[] args) {	
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		try {
			System.out.println(4/0);
		}
		catch(ArithmeticException ex) {
			System.out.println("Exception caught: "+ ex.getMessage());
		}
		System.out.println(5);
		System.out.println(6);		
	}
}

//Scanner sc = new Scanner(System.in);
//int a;
//try {
//	try {
//		System.out.println(10/0);
//		System.out.println("hai");
//	}catch(Exception ex) {
//		System.out.println("Exception caught : "+ex.getMessage());
//	}
//	System.out.println("Enter a number");
//	a=sc.nextInt();
//	System.out.println(a);
//}catch(InputMismatchException e) {
//	System.out.println("Exception caught : "+e.getMessage());
//}

