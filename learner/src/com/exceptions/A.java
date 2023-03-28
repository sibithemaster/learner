package com.exceptions;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.out.println("Start");
//		System.out.println("1");
//		System.out.println("2");
//		System.out.println("3");
//		try {
//			System.out.println(10/0);
//		}catch(ArithmeticException ex) {
//			System.out.println("Exception caught"+ex.getMessage());
//		}		
//		System.out.println("4");
//		System.out.println("5");
//		System.out.println("End");
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter a number");
//		int num=sc.nextInt();
//		System.out.println("Enter length");
//        int length=sc.nextInt();
//		int count=0;
//		for(int i=1;i<=length;i++)
//		{
//			if(num%i==0)
//			{
//				count++;
//			}
//		}
//		if(count==2)
//		{
//			System.out.println("prime number");
//		}else {
//			System.out.println("not a prime number");
//		}
//		if(num%4==0)
//		{
//			System.out.println("Leap year");
//		}else {
//			System.out.println("Non-Leap year");
//		}
		
	
//    	Scanner input = new Scanner(System.in);
//    	System.out.println("enter the number");
//    	n = input.nextInt();
//    	int count = 0;
//    	for (int i = 2;  num / 2>=i;i++) {
//    		if (num % i == 0) {
//    			count = 1;
//    			}
//    	}
//    	if (count == 0) {
//    		System.out.println("prime");
//    		} else {
//    		System.out.println("not prime");
//    		}
//
		
//		int n, a, i = 0, j = 0;
//		Scanner an = new Scanner(System.in);
//		System.out.println("Enter a number");
//		n = an.nextInt();
//		a = n;
//		while (a > 0) {
//		i = a % 10;
//		j = (j * 10) + i;
//		a = a / 10;
//		}
//		if (n == j) {
//		System.out.println("palindrome");
//		} else {
//		System.out.println("Not a palindrome");

	
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number");
        int num=sc.nextInt();
        System.out.println(num);
        
        System.out.println("Enter a string");
        String s = sc.next();
        System.out.println(s);
        
        System.out.println("Enter a character");
        char c=sc.next().charAt(0);
        System.out.println(c);
	}

}
//exception handlers
//try,catch,throw,throws,finally