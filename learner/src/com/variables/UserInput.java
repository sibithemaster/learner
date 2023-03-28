package com.variables;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a=sc.nextInt();
		float b=sc.nextFloat();
		double c=sc.nextDouble();
		long d=sc.nextLong();
		byte e=sc.nextByte();
		short h=sc.nextShort();
		boolean i=sc.nextBoolean();
		char j=sc.next().charAt(0); 
		String k=sc.next();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(h);
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);

//		int age=sc.nextInt();
//		if(age>18) {
//			System.out.println("Eligible");
//		}else {
//			System.out.println("Not Eligible");
//		}
	}

}
