package com.variables;

import java.util.Scanner;

public class ArraySample {
	public static void main(String[] args) {
//				int a[]=new int[5];
//				a[0]=10;
//				a[1]=20;
//				a[2]=30;
//				a[3]=40;
//				a[4]=50;		
//				//a[5]=60;
//				
//		//	System.out.println(a[2]);	
//				for(int i=0;i<a.length;i++)
//				{
//					System.out.println(a[i]);
//				}
//
//				System.out.println();

				String ar[] = {"French","Malayalam","Hindi","Tamil","English"};
				System.out.println(ar.length);
				for(int i=ar.length-1;i>=0;i--)
				{
						System.out.println(ar[i]);
				}
		//		Scanner sc = new Scanner(System.in);
		//		
		//		System.out.println("Enter a number");
		//		int num=sc.nextInt();
		//
		//		int a[]=new int[num];
		//		
		//		System.out.println("Entering the values");
		//		
		//		for(int i=0; i<a.length; i++)
		//		{
		//			a[i]=sc.nextInt();
		//		}
		//		
		//		System.out.println();
		//		
		//		System.out.println("After values entered");
		//		
		//		for(int i=0; i<a.length; i++)
		//		{
		//			System.out.println(a[i]);
		//		}

		int a[][] = new int[3][3];

		a[0][0]= 1;
		a[0][1]= 2;
		a[0][2]= 5;
		a[1][0]= 3;
		a[1][1]= 4;
		a[1][2]= 8;
		a[2][0]= 1; 
		a[2][1]= 2;
		a[2][2]= 3;

		System.out.println(a[0][2]);
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}

		// {[0,0][0,1]},{[1,0][1,1]}
		int b[][]= {{1,2},{4,5}};

		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}

}
