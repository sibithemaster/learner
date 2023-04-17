package com.exceptions;

public class ArrayIndexOut {
	 public static void main(String args[]){
		 int a[] =new int [5];
		 a[0]=10;
		 a[1]=20;
		 a[2]=30;
		 a[3]=40;
		 a[4]=50;		
		
		 try {
			 for(int i=0;i<=a.length;i++)
			 {
				 System.out.println(a[i]);
			 }
		 }catch(ArrayIndexOutOfBoundsException ex){
			 System.out.println("Exception caught: "+ ex.getMessage());
		 }
		 System.out.println("Java");
	 }
}
