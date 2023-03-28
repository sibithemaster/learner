package com.methods;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String original, reverse = "";
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string to reverse");
		original = in.nextLine();
		int length = original.length();
		for (int i = length - 1; i >= 0; i--)
		{	
		 reverse = reverse + original.charAt(i);
		}
		System.out.println(reverse);

//		String a="Hai";
//		int b=10;
//		String c="Bye";
//		
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
	//			+" "+b+" "+c);
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a number");
//		int pin=sc.nextInt();
//		
//		if(pin >1000 && pin<9999)
//		{
//			System.out.println("Enter your wish");
//			int condition=sc.nextInt();			
//			switch(condition)
//			{
//			    case 1:System.out.println("Cash Withdraw");break;
//			    case 2:System.out.println("Online payment");break;
//			    case 3:System.out.println("Pin change");break;			 
//			    default:System.out.println("Invalid case");break;
//			}
//		}else {
//			System.out.println("Enter a valid pin");
//		}
//		
		
		
	}

}
