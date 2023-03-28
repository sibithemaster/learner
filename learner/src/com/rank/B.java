package com.rank;

import java.util.Scanner;

public class B {

//	static void power(int n,int p)
//	{
//		System.out.println(n*power(n,p-1));
//	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		int p=sc.nextInt();
		
		int power=(int) Math.pow(n, p);
	//	B.power(n, p);
		//.args.int powe=n * n(p-1);
		System.out.println(power);

	}

}
