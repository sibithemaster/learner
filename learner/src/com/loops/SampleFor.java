package com.loops;

public class SampleFor {
	public static void main(String[] args) {		
		for(int i=10;i>=1;i--)
		{
			System.out.println(i);
		}
		
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
//10>=1 9>=1 8>=1 7>=1 6>=1 5>=1 4>=1 3>=1 2>=1 1>=1 
//0>=1-->fails